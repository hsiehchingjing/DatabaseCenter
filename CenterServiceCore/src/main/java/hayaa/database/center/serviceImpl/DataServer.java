package hayaa.database.center.serviceImpl;

import hayaa.database.center.dao.*;
import hayaa.database.center.model.*;
import hayaa.database.center.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午6:20 by谢青靖（xieqj@cloud-young.com）创建
 */
@Service("dataService")
public class DataServer implements DataService {
    @Autowired
    private DataconnectionstringMapper dataconnectionstringMapper;

    /**
     * @param id@描述：根据主键获取连接字符串
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    public Result<DataConnectionString> getDataConnection(Integer id) {
        DataConnectionString info = dataconnectionstringMapper.selectByPrimaryKey(id);
        return new Result<DataConnectionString>(info);
    }

    /**
     * @param id
     * @param isActive
     * @描述：根据数据库id获取数据库连接信息
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    public Result<List<DataConnectionString>> getDataConnectionByDatabaseId(Integer id, Boolean isActive) {
        DataconnectionstringExample example = new DataconnectionstringExample();
        DataconnectionstringExample.Criteria criteria = example.createCriteria();
        criteria.andDatabaseIdEqualTo(id);
        criteria.andIsActiveEqualTo(isActive ? 1 : 0);
        List<DataConnectionString> list = dataconnectionstringMapper.selectByExample(example);
        return new Result<List<DataConnectionString>>(list);
    }

    @Autowired
    private DatabaseMapper databaseMapper;

    /**
     * @param id@描述：根据主键获取信息
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    public Result<Database> getDatabase(Integer id) {
        Database info = databaseMapper.selectByPrimaryKey(id);
        return new Result<Database>(info);
    }

    /**
     * @param info@描述：插入数据库信息,主键在成功后会填充在实体中
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    public Result<Boolean> insertDatabase(Database info) {
        Boolean r = (databaseMapper.insertSelective(info) > 0);
        return new Result<Boolean>(r);
    }

    @Autowired
    private TableMapper tableMapper;
    @Autowired
    private RelDatabaseTableMapper relDatabaseTableMapper;

    /**
     * @param info
     * @param databaseId
     * @描述：插入表信息
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    public Result<Boolean> insertTable(Table info, Integer databaseId) {
        Boolean r = (tableMapper.insertSelective(info) > 0);
        if (info.getTableId() > 0) {
            Rel_Database_Table rel = new Rel_Database_Table(databaseId, info.getTableId());
            relDatabaseTableMapper.insertSelective(rel);
        }
        return new Result<Boolean>(r);
    }

    @Autowired
    private ColumnMapper columnMapper;
    @Autowired
    private RelTableColumnMapper relTableColumnMapper;

    /**
     * @param list
     * @param tableId
     * @描述：批量插入字段
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    public Result<Boolean> insertBatchColumns(List<Column> list, Integer tableId) {
        Boolean r = (columnMapper.insertBatch(list) > 0);
        if (r) {
            RelTableColumnExample example = new RelTableColumnExample();
            RelTableColumnExample.Criteria criteria = example.createCriteria();
            criteria.andTableIdEqualTo(tableId);
            criteria.andCurrentEqualTo(1);
            Rel_Table_Column oldRel=new Rel_Table_Column();
            oldRel.setCurrent(false);
            relTableColumnMapper.updateByExampleSelective(oldRel,example);
            list.stream().forEach(n -> {
                if (n.getColumnId() > 0) {
                    Rel_Table_Column rel = new Rel_Table_Column(tableId,n.getColumnId());
                    relTableColumnMapper.insertSelective(rel);
                }
            });
        }
        return new Result<Boolean>(r);
    }
}

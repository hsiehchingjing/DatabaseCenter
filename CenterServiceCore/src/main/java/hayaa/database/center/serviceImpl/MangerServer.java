package hayaa.database.center.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import hayaa.database.center.dao.ColumnMapper;
import hayaa.database.center.dao.DatabaseMapper;
import hayaa.database.center.dao.DataconnectionstringMapper;
import hayaa.database.center.dao.TableMapper;
import hayaa.database.center.model.*;
import hayaa.database.center.parameter.SearchColumnParameter;
import hayaa.database.center.parameter.SearchDataConnectionStringParameter;
import hayaa.database.center.parameter.SearchDatabaseParameter;
import hayaa.database.center.parameter.SearchTableParameter;
import hayaa.database.center.service.MangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-29 下午6:53 by谢青靖（xieqj@cloud-young.com）创建
 */
@Service("mangerService")
public class MangerServer implements MangerService {
    @Autowired
    private DataconnectionstringMapper dataconnectionstringMapper;

    /**
     * @param title
     * @param connectionString
     * @param dataType         @描述：添加数据库连接字符串信息
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    @Override
    public Result<Integer> insertDataConnectionString(String title, String connectionString, String dataType) {
        DataConnectionString info = new DataConnectionString(title, connectionString, dataType);
        Boolean r = (dataconnectionstringMapper.insertSelective(info) > 0);
        return new Result<Integer>(info.getId());
    }

    /**
     * @param searchParameter
     * @param pageIndex
     * @param pageSize        @返回
     * @描述：搜索连接字符串并分页
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     */
    @Override
    public Pager<DataConnectionString> searchDataConnectionString(SearchDataConnectionStringParameter searchParameter,
                                                                  int pageIndex, int pageSize) {
        Pager<DataConnectionString> result = new Pager<DataConnectionString>();
        if (searchParameter == null) searchParameter = new
                SearchDataConnectionStringParameter();
        if (pageIndex == 0) pageIndex = 1;
        if (pageSize == 0) pageSize = 10;
        List<DataConnectionString> list = null;
        PageHelper.startPage(pageIndex, pageSize);
        try {
            list = dataconnectionstringMapper.searchDataConnectionString(searchParameter
                            .getConnection(), searchParameter.getDatabaseType(), searchParameter.getTitle()
                    , 1);
        } catch (Exception ex) {
            //logger.error(PACKAGENAME + "ProductBrandApi.findProductBrandPageList", ex);

        }
        PageInfo page = new PageInfo(list);
        result.setContent(list);
        result.setDataNumber(page.getTotal());
        return result;
    }

    /**
     * @param title
     * @描述：更新数据库连接字符串信息
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    @Override
    public Result<Boolean> updateDataConnectionStringById(String title, Integer id) {
        DataconnectionstringExample example = new DataconnectionstringExample();
        DataconnectionstringExample.Criteria criteria = example.createCriteria();
        DataConnectionString info = new DataConnectionString();
        info.setTitle(title);
        info.setId(id);
        Boolean r = (dataconnectionstringMapper.updateByExampleSelective(info, example) > 0);
        return new Result<Boolean>(r);
    }

    /**
     * @param id
     * @param databaseId @返回
     * @描述：更新字符串关联的数据库id
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     */
    @Override
    public Result<Boolean> updateDataConnectionString(Integer id, Integer databaseId) {
        DataconnectionstringExample example = new DataconnectionstringExample();
        DataconnectionstringExample.Criteria criteria = example.createCriteria();
        DataConnectionString info = new DataConnectionString();
        info.setDatabaseId(databaseId);
        info.setId(id);
        Boolean r = (dataconnectionstringMapper.updateByExampleSelective(info, example) > 0);
        return new Result<Boolean>(r);
    }

    /**
     * @param id
     * @描述：根据主键删除字符串
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    @Override
    public Result<Boolean> delDataConnectionString(Integer id) {
        DataconnectionstringExample example = new DataconnectionstringExample();
        DataconnectionstringExample.Criteria criteria = example.createCriteria();
        DataConnectionString info = new DataConnectionString();
        info.setId(id);
        info.setActive(false);
        Boolean r = (dataconnectionstringMapper.updateByExampleSelective(info, example) > 0);
        return new Result<Boolean>(r);
    }

    @Autowired
    private DatabaseMapper databaseMapper;

    /**
     * @param searchParameter
     * @param pageIndex
     * @param pageSize        @描述：搜索数据库信息并分页
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    @Override
    public Pager<Database> searchDatabase(SearchDatabaseParameter searchParameter, int pageIndex, int pageSize) {
        Pager<Database> result = new Pager<Database>();
        if (searchParameter == null) searchParameter = new
                SearchDatabaseParameter();
        if (pageIndex == 0) pageIndex = 1;
        if (pageSize == 0) pageSize = 10;
        List<Database> list = null;
        PageHelper.startPage(pageIndex, pageSize);
        try {
            list = databaseMapper.searchDatabase(searchParameter
                            .getName(), searchParameter.getDatabaseType(), searchParameter.getStatus()
                    , 1);
        } catch (Exception ex) {
            //logger.error(PACKAGENAME + "ProductBrandApi.findProductBrandPageList", ex);

        }
        PageInfo page = new PageInfo(list);
        result.setContent(list);
        result.setDataNumber(page.getTotal());
        return result;
    }

    /**
     * @param id
     * @param databaseTitle
     * @param databaseRemark @描述：更新数据库信息
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    @Override
    public Result<Boolean> updateDatabase(Integer id, String databaseTitle, String databaseRemark) {
        DatabaseExample example = new DatabaseExample();
        DatabaseExample.Criteria criteria = example.createCriteria();
        Database info = new Database();
        info.setDatabaseId(id);
        info.setDatabaseTitle(databaseTitle);
        info.setDatabaseRemark(databaseRemark);
        Boolean r = (databaseMapper.updateByExampleSelective(info, example) > 0);
        return new Result<Boolean>(r);
    }
    @Autowired
    private TableMapper tableMapper;
    /**
     * @param searchParameter
     * @param databaseId
     * @param pageIndex
     * @param pageSize        @返回
     * @描述：搜索表并分页
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     */
    @Override
    public Pager<Table> searchTable(SearchTableParameter searchParameter, int databaseId, int pageIndex, int pageSize) {
        Pager<Table> result = new Pager<Table>();
        if (searchParameter == null) searchParameter = new
                SearchTableParameter();
        if (pageIndex == 0) pageIndex = 1;
        if (pageSize == 0) pageSize = 10;
        List<Table> list = null;
        PageHelper.startPage(pageIndex, pageSize);
        try {
            list = tableMapper.searchTable(searchParameter
                            .getTableName(), searchParameter.getTableRemark(), searchParameter.getTableTitle()
                    , 1);
        } catch (Exception ex) {
            //logger.error(PACKAGENAME + "ProductBrandApi.findProductBrandPageList", ex);

        }
        PageInfo page = new PageInfo(list);
        result.setContent(list);
        result.setDataNumber(page.getTotal());
        return result;
    }
    @Autowired
    private ColumnMapper columnMapper;
    /**
     * @param searchParameter
     * @param tableId
     * @param pageIndex
     * @param pageSize
     * @返回
     * @描述：搜索字段并分页
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     */
    @Override
    public Pager<Column> searchColumn(SearchColumnParameter searchParameter, int tableId, int pageIndex, int pageSize) {
        Pager<Column> result = new Pager<Column>();
        if (searchParameter == null) searchParameter = new
                SearchColumnParameter();
        if (pageIndex == 0) pageIndex = 1;
        if (pageSize == 0) pageSize = 10;
        List<Column> list = null;
        PageHelper.startPage(pageIndex, pageSize);
        try {
            list = columnMapper.searchColumn(searchParameter
                            .getColumnName(), searchParameter.getColumnTitle(), searchParameter.getDataType()
                    , 1);
        } catch (Exception ex) {
            //logger.error(PACKAGENAME + "ProductBrandApi.findProductBrandPageList", ex);

        }
        PageInfo page = new PageInfo(list);
        result.setContent(list);
        result.setDataNumber(page.getTotal());
        return result;
    }
}

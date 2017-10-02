package hayaa.database.center.serviceImpl;

import hayaa.database.center.component.MysqlDatabaseManager;
import hayaa.database.center.model.*;
import hayaa.database.center.service.DataService;
import hayaa.database.center.service.MangerService;
import hayaa.database.center.service.ScanerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-30 下午3:09 by谢青靖（xieqj@cloud-young.com）创建
 */
@Service("scanerService")
public class ScanerServer implements ScanerService {
    @Autowired
    private DataService dataService;
    @Autowired
    private MangerService mangerService;

    /**
     * @param conectionId
     * @描述：依据连接字符串扫描数据库
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    @Override
    public Result<Boolean> ScanDatabaseByConnection(Integer conectionId, Integer databaseId) {
        Result<DataConnectionString> con = dataService.getDataConnection(conectionId);
        Result<Database> database = dataService.getDatabase(databaseId);
        if (con.getMethodResult()) {
            DataConnectionString conData = con.getData();
            if (conData.getDatabaseType() == "mysql") {
                MysqlDatabaseManager mysqlDatabaseManager = new MysqlDatabaseManager(conData.getConnection(), conData.getDatabaseUser(),
                        conData.getDatabasePwd());
                Result<List<Table>> tablelist = mysqlDatabaseManager.getTable(database.getData().getDatabaseName());
                if (tablelist.getMethodResult()) {
                    tablelist.getData().stream().forEach(n -> {
                        dataService.insertTable(n, databaseId);
                        Result<List<Column>> collist = mysqlDatabaseManager.getTableColumn(database.getData().getDatabaseName(), n.getTableName());
                        if(collist.getMethodResult()){
                            dataService.insertBatchColumns(collist.getData(),n.getTableId());
                        }
                    });
                }
            }
        }
        return new Result<Boolean>(true);
    }

    /**
     * @param databaseId
     * @描述：依据数据库id扫描数据库
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    @Override
    public Result<Boolean> ScanDatabaseByDatabaseId(Integer databaseId) {
        Result<List<DataConnectionString>> conList = dataService.getDataConnectionByDatabaseId
                (databaseId,
                        true);
        if (conList.getMethodResult()) {
            conList.getData().stream().forEach(n -> {
                this.ScanDatabaseByConnection(n.getId(), databaseId);
            });
        }
        return new Result<Boolean>(true);
    }
}

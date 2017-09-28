package hayaa.database.center.serviceImpl;

import hayaa.database.center.model.*;
import hayaa.database.center.service.DataService;

import java.util.List;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午6:20 by谢青靖（xieqj@cloud-young.com）创建
 */
public class DataServer implements DataService {
    /**
     * @param id@描述：根据主键获取连接字符串
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    public Result<DataConnectionString> getDataConnection(Integer id) {
        return null;
    }

    /**
     * @param id
     * @param isActive
     * @描述：根据数据库id获取数据库连接信息
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    public Result<List<DataConnectionString>> getDataConnectionByDatabaseId(Integer id, Boolean isActive) {
        return null;
    }

    /**
     * @param id@描述：根据主键获取信息
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    public Result<Database> getDatabase(Integer id) {
        return null;
    }

    /**
     * @param info@描述：插入数据库信息,主键在成功后会填充在实体中
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    public Result<Boolean> insertDatabase(Database info) {
        return null;
    }

    /**
     * @param info
     * @param databaseId
     * @描述：插入表信息
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    public Result<Boolean> insertTable(Table info, Integer databaseId) {
        return null;
    }

    /**
     * @param list
     * @param tableId
     * @描述：批量插入字段
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    public Result<Boolean> insertBatchColumns(List<Column> list, Integer tableId) {
        return null;
    }
}

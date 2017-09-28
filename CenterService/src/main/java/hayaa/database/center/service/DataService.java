package hayaa.database.center.service;


import hayaa.database.center.model.*;

import hayaa.database.center.parameter.SearchDatabaseParameter;

import java.util.List;

/**
 * 说明：数据服务接口，面向其他数据操作服务
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午4:16 by谢青靖（xieqj@cloud-young.com）创建
 */
public interface DataService {
    /**
     * @param
     * @描述：根据主键获取连接字符串
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    Result<DataConnectionString> getDataConnection(Integer id);

    /**
     * @param
     * @描述：根据数据库id获取数据库连接信息
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    Result<List<DataConnectionString>> getDataConnectionByDatabaseId(Integer id, Boolean isActive);

    /**
     * @param
     * @描述：根据主键获取信息
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    Result<Database> getDatabase(Integer id);

    /**
     * @param
     * @描述：插入数据库信息,主键在成功后会填充在实体中
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    Result<Boolean> insertDatabase(Database info);

    /**
     * @param
     * @描述：插入表信息
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    Result<Boolean> insertTable(Table info, Integer databaseId);

    /**
     * @param
     * @描述：批量插入字段
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    Result<Boolean> insertBatchColumns(List<Column> list, Integer tableId);

}

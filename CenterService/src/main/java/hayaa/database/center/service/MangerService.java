package hayaa.database.center.service;

import hayaa.database.center.model.*;
import hayaa.database.center.parameter.SearchColumnParameter;
import hayaa.database.center.parameter.SearchDataConnectionStringParameter;
import hayaa.database.center.parameter.SearchDatabaseParameter;
import hayaa.database.center.parameter.SearchTableParameter;

/**
 * 说明：管理服务定义，面向数据库管理人员
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午4:18 by谢青靖（xieqj@cloud-young.com）创建
 */
public interface MangerService {
    /**
     * @param
     * @描述：添加数据库连接字符串信息
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    Result<Integer> insertDataConnectionString(String title, String connectionString, String
            dataType);
    /**
     * @描述：搜索连接字符串并分页
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @param
     * @返回
     */
    Pager<DataConnectionString> searchDataConnectionString(SearchDataConnectionStringParameter searchParameter, int pageIndex, int
            pageSize);
    /**
     * @描述：更新数据库连接字符串信息
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @param
     * @返回
     */
    Result<Boolean> updateDataConnectionStringById(String title,Integer id);
    /**
     * @描述：更新字符串关联的数据库id
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @param
     * @返回
     */
    Result<Boolean> updateDataConnectionString(Integer id,Integer databaseId);
    /**
     * @描述：根据主键删除字符串
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @param
     * @返回
     */
    Result<Boolean> delDataConnectionString(Integer id);
    /**
     * @param
     * @描述：搜索数据库信息并分页
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    Pager<Database> searchDatabase(SearchDatabaseParameter searchParameter, int pageIndex, int
            pageSize);
    /**
     * @param
     * @描述：更新数据库信息
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @返回
     */
    Result<Boolean> updateDatabase(Integer id, String databaseTitle, String databaseRemark);
    /**
     * @描述：搜索表并分页
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @param
     * @返回
     */
    Pager<Table> searchTable(SearchTableParameter searchParameter, int databaseId, int pageIndex,
                             int
            pageSize);
    /**
     * @描述：搜索字段并分页
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @param
     * @返回
     */
    Pager<Column> searchColumn(SearchColumnParameter searchParameter, int tableId, int pageIndex,
                               int
                                     pageSize);
}

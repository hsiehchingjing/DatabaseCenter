package hayaa.database.center.service;

import hayaa.database.center.model.Result;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午3:52 by谢青靖（xieqj@cloud-young.com）创建
 */
public interface ScanerService {
    /**
     * @描述：依据连接字符串扫描数据库
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @param
     * @返回
     */
    Result<Boolean> ScanDatabaseByConnection(Integer conectionId);
    /**
     * @描述：依据数据库id扫描数据库
     * @version 1.0 17-9-28 17-9-28 由谢青靖（xieqj@cloud-young.com）创建
     * @param
     * @返回
     */
    Result<Boolean> ScanDatabaseByDatabaseId(String databaseId);
}

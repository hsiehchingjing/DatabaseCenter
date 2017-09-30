package hayaa.database.center.dao;

import hayaa.database.center.model.Table;
import hayaa.database.center.model.TableExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-29 下午6:05 by谢青靖（xieqj@cloud-young.com）创建
 */
@Repository
public interface TableMapper  extends BaseMapper<Table,TableExample>{
    List<Table> searchTable(String tableName, String tableRemark, String tableTitle, int isActive);
}

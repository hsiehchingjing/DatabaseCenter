package hayaa.database.center.dao;

import hayaa.database.center.model.Column;
import hayaa.database.center.model.ColumnExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午8:37 by谢青靖（xieqj@cloud-young.com）创建
 */
@Repository
public interface ColumnMapper extends BaseMapper<Column, ColumnExample> {
    Integer insertBatch(List<Column> list);

    List<Column> searchColumn(String columnName, String columnTitle, String dataType, int isActive);
}

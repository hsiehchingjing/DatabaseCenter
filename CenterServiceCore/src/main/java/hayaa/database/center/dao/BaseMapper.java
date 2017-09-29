package hayaa.database.center.dao;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-29 下午5:30 by谢青靖（xieqj@cloud-young.com）创建
 */
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T extends Serializable, E> {
    int countByExample(E var1);

    int deleteByExample(E var1);

    int deleteByPrimaryKey(Object var1);

    int insert(T var1);

    int insertSelective(T var1);

    List<T> selectByExample(E var1);

    T getByExample(E var1);

    T selectByPrimaryKey(@Param("id") Object var1);

    int updateByExampleSelective(@Param("record") T var1, @Param("example") E var2);

    int updateByExample(@Param("record") T var1, @Param("example") E var2);

    int updateByPrimaryKeySelective(T var1);

    int updateByPrimaryKey(T var1);

    List<T> getPageList(E var1);
}

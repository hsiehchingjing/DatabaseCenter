package hayaa.database.center.model;

import java.util.Date;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午2:19 by谢青靖（xieqj@cloud-young.com）创建
 */
public class ColumnRemark {
    private Integer id;
    private String columnName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnRemark() {
        return columnRemark;
    }

    public void setColumnRemark(String columnRemark) {
        this.columnRemark = columnRemark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    private String columnRemark;
    private java.util.Date createTime;
    private Date updateTime;

}

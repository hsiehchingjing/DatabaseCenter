package hayaa.database.center.model;

import java.util.Date;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午2:15 by谢青靖（xieqj@cloud-young.com）创建
 */
public class Rel_Table_Column {
    private Integer id;
    private Integer tableId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public Boolean getCurrent() {
        return current;
    }

    public void setCurrent(Boolean current) {
        this.current = current;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private Integer columnId;
    private Boolean current;
    private java.util.Date createTime;

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    private Date updateTime;
}

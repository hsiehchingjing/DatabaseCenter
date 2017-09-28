package hayaa.database.center.model;

import java.util.Date;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午2:11 by谢青靖（xieqj@cloud-young.com）创建
 */
public class Table {
    private Integer tableId;
    private String tableName;

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableTitle() {
        return tableTitle;
    }

    public void setTableTitle(String tableTitle) {
        this.tableTitle = tableTitle;
    }

    public String getTableRemark() {
        return tableRemark;
    }

    public void setTableRemark(String tableRemark) {
        this.tableRemark = tableRemark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private String tableTitle;
    private String tableRemark;
    private java.util.Date createTime;
}

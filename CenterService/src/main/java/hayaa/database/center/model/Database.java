package hayaa.database.center.model;

import java.util.Date;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午3:56 by谢青靖（xieqj@cloud-young.com）创建
 */
public class Database {
    private Integer databaseId;
    private String databaseName;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getDatabaseTitle() {
        return databaseTitle;
    }

    public void setDatabaseTitle(String databaseTitle) {
        this.databaseTitle = databaseTitle;
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public String getDatabaseRemark() {
        return databaseRemark;
    }

    public void setDatabaseRemark(String databaseRemark) {
        this.databaseRemark = databaseRemark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    private String databaseTitle;
    private String databaseType;
    private String databaseRemark;
    private java.util.Date createTime;
    private Boolean status;
}

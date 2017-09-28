package hayaa.database.center.model;

import java.util.Date;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午4:08 by谢青靖（xieqj@cloud-young.com）创建
 */
public class DataConnectionString {
    private Integer id;
    private String Title;
    private String connection;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    private Integer databaseId;
    private java.util.Date creatTime;
    private Date updateTime;
    private Boolean isActive;
}

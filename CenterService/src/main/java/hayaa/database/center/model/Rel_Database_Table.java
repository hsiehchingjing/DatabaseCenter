package hayaa.database.center.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午4:01 by谢青靖（xieqj@cloud-young.com）创建
 */
public class Rel_Database_Table implements Serializable {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Boolean getCurren() {
        return curren;
    }

    public void setCurren(Boolean curren) {
        this.curren = curren;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private Integer databaseId;
    private Integer tableId;
    private Boolean curren;
    private java.util.Date updateTime;
    private java.util.Date createTime;
    public Rel_Database_Table(Integer databaseId,Integer tableId){
        this.databaseId=databaseId;
        this.tableId=tableId;
        this.curren=true;
    }
}

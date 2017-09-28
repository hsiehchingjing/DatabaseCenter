package hayaa.database.center.parameter;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午4:53 by谢青靖（xieqj@cloud-young.com）创建
 */
public class SearchDatabaseParameter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    private String databaseType;
    private Boolean status;
}

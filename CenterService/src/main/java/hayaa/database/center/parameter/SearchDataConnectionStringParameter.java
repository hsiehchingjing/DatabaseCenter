package hayaa.database.center.parameter;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午5:18 by谢青靖（xieqj@cloud-young.com）创建
 */
public class SearchDataConnectionStringParameter {
    private String Title;

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

    private String connection;

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    private String databaseType;
}

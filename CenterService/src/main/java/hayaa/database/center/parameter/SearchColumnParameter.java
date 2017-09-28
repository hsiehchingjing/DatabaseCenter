package hayaa.database.center.parameter;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午5:51 by谢青靖（xieqj@cloud-young.com）创建
 */
public class SearchColumnParameter {
    private String columnName;
    private String columnTitle;
    private String dataType;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnTitle() {
        return columnTitle;
    }

    public void setColumnTitle(String columnTitle) {
        this.columnTitle = columnTitle;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
}

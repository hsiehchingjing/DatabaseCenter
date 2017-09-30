package hayaa.database.center.component;

import hayaa.database.center.model.Column;
import hayaa.database.center.model.Result;
import hayaa.database.center.model.Table;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-30 下午4:31 by谢青靖（xieqj@cloud-young.com）创建
 */
public class MysqlDatabaseManager {
    private JdbcTemplate jdbcTemplate;
    public MysqlDatabaseManager(String url, String user, String pwd) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource(url, user, pwd);
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        jdbcTemplate = new JdbcTemplate(dataSource);
    }



    public Result<List<Column>> getTableColumn(String databaseName,String tableName) {
        String sql = "select column_name,data_type from information_schema.columns where " +
                "table_schema='"+
                databaseName + "' and table_name='" + tableName + "';";
        List<Column> list = null;
//        jdbcTemplate.query(sql,new PreparedStatementCallback() {
//            public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
//
//                ps.setInt(1, 20);
//
//                ResultSet rs=ps.executeQuery();
//
//                Column info = new Column();
//
//                List list=new ArrayList();
//
//                while (rs.next()) {
//                    info.setColumnId(rs.getInt("id"));
//
//                    list.add(info);
//                }
//
//                return list;
//            }
//        });

        return new Result<List<Column>>(list);
    }

    public Result<List<Table>> getTable(String databaseName) {
        List<Table> list = null;
        return new Result<List<Table>>(list);
    }
}

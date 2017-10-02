package hayaa.database.center.test;


import hayaa.database.center.model.*;
import hayaa.database.center.parameter.SearchColumnParameter;
import hayaa.database.center.parameter.SearchDataConnectionStringParameter;
import hayaa.database.center.parameter.SearchDatabaseParameter;
import hayaa.database.center.parameter.SearchTableParameter;
import hayaa.database.center.service.DataService;
import hayaa.database.center.service.MangerService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration({"/spring/app*.xml"}) //加载配置文件
public class DataServerTest {

    @Autowired
    private DataService dataService;
    @Autowired
    private MangerService mangerService;

    private DataConnectionString insertDataConnectionStringData() throws Exception {
        Result<Integer> result = mangerService.insertDataConnectionString("test",
                "jdbc:mysql://127.0.0.1:3306/DataService?useUnicode=true&characterEncoding=UTF-8" +
                        "  &autoReconnect=true&rewriteBatchedStatements=true&useServerPrepStmts=true&allowMultiQueries=true&zeroDateTimeBehavior=convertToNull",
                "mysql");
        Result<DataConnectionString> r = dataService.getDataConnection(result.getData());
        return r.getData();
    }

    @Test
    public void insertDataConnectionString() throws Exception {
        Result<Integer> result = mangerService.insertDataConnectionString("test",
                "jdbc:mysql://127.0.0.1:3306/DataService?useUnicode=true&characterEncoding=UTF-8" +
                        "  &autoReconnect=true&rewriteBatchedStatements=true&useServerPrepStmts=true&allowMultiQueries=true&zeroDateTimeBehavior=convertToNull",
                "mysql");
        Assert.assertTrue(result.getMethodResult());
        Assert.assertTrue(result.getData() > 0);
    }

    @Test
    public void searchDataConnectionStringTest() throws Exception {
        this.insertDataConnectionStringData();
        Pager<DataConnectionString> r = mangerService.searchDataConnectionString(new SearchDataConnectionStringParameter(), 1, 10);
        Assert.assertTrue(r.getMethodResult());
        Assert.assertNotNull(r.getContent());
        Assert.assertTrue(r.getPage() > 0);
        Assert.assertTrue(r.getDataNumber() > 0);
        Assert.assertTrue(r.getTotalPage() > 0);
    }

    @Test
    public void updateDataConnectionStringByIdTest() throws Exception {
        DataConnectionString info = insertDataConnectionStringData();
        Result<Boolean> r = mangerService.updateDataConnectionStringById("update title", info.getId());
        Assert.assertTrue(r.getMethodResult());
        Assert.assertTrue(r.getData());
    }

    @Test
    public void updateDataConnectionStringTest() throws Exception {
    }

    @Test
    public void delDataConnectionStringTest() throws Exception {
        DataConnectionString info = insertDataConnectionStringData();
        Result<Boolean> r = mangerService.delDataConnectionString(info.getId());
        Assert.assertTrue(r.getMethodResult());
        Assert.assertTrue(r.getData());
    }

    @Test
    public void searchDatabaseTest() throws Exception {
        this.inserDatabaseData();
        Pager<Database> r = mangerService.searchDatabase(new SearchDatabaseParameter(), 1, 10);
        Assert.assertTrue(r.getMethodResult());
        Assert.assertNotNull(r.getContent());
        Assert.assertTrue(r.getPage() > 0);
        Assert.assertTrue(r.getDataNumber() > 0);
        Assert.assertTrue(r.getTotalPage() > 0);
    }

    private Database inserDatabaseData() {
        Database data = new Database();
        data.setDatabaseName("dataservice");
        data.setDatabaseRemark("remark");
        data.setDatabaseTitle("title");
        data.setDatabaseType("mysql");
        data.setStatus(true);
        Result<Boolean> info = dataService.insertDatabase(data);
        return data;
    }

    @Test
    public void updateDatabaseTest() throws Exception {
        Database info = inserDatabaseData();
        Result<Boolean> r = mangerService.updateDatabase(info.getDatabaseId(), "update title", "update remark");
        Assert.assertTrue(r.getMethodResult());
        Assert.assertTrue(r.getData());
    }

    @Test
    public void searchTableTest() throws Exception {
        Database databaseInfo = this.inserDatabaseData();
        this.inserTableData(databaseInfo.getDatabaseId());
        Pager<Table> r = mangerService.searchTable(new SearchTableParameter(), databaseInfo.getDatabaseId(), 1, 10);
        Assert.assertTrue(r.getMethodResult());
        Assert.assertNotNull(r.getContent());
        Assert.assertTrue(r.getPage() > 0);
        Assert.assertTrue(r.getDataNumber() > 0);
        Assert.assertTrue(r.getTotalPage() > 0);
    }

    private Table inserTableData(Integer databaseId) {
        Table info = new Table();
        info.setTableName("table");
        info.setTableRemark("remark");
        info.setTableTitle("title");
        Result<Boolean> r = dataService.insertTable(info, databaseId);
        return info;
    }

    @Test
    public void searchColumnTest() throws Exception {
        Database databaseInfo = this.inserDatabaseData();
        Table table = this.inserTableData(databaseInfo.getDatabaseId());
        this.insertColumnData(table.getTableId());
        Pager<Column> r = mangerService.searchColumn(new SearchColumnParameter(), table.getTableId(), 1, 10);
        Assert.assertTrue(r.getMethodResult());
        Assert.assertNotNull(r.getContent());
        Assert.assertTrue(r.getPage() > 0);
        Assert.assertTrue(r.getDataNumber() > 0);
        Assert.assertTrue(r.getTotalPage() > 0);
    }

    private Column insertColumnData(Integer tableId) {
        Column info = new Column();
        info.setDataType("varchar");
        info.setColumnName("column");
        info.setColumnTitle("title");
        List<Column> list = new ArrayList<Column>();
        dataService.insertBatchColumns(list, tableId);
        return info;
    }

    @Test
    public void getDataConnectionTest() throws Exception {
        DataConnectionString info = insertDataConnectionStringData();
        Result<DataConnectionString> r = dataService.getDataConnection(info.getId());
        Assert.assertTrue(r.getMethodResult());
        Assert.assertNotNull(r.getData());
    }

    @Test
    public void getDataConnectionByDatabaseIdTest() throws Exception {
        DataConnectionString info = insertDataConnectionStringData();
        Result<List<DataConnectionString>> r = dataService.getDataConnectionByDatabaseId(info.getDatabaseId(), true);
        Assert.assertTrue(r.getMethodResult());
        Assert.assertNotNull(r.getData());
        Assert.assertTrue(r.getData().size() > 0);
    }

    @Test
    public void getDatabaseTest() throws Exception {
        Database database=inserDatabaseData();
        Result<Database> r=dataService.getDatabase(database.getDatabaseId());
        Assert.assertTrue(r.getMethodResult());
        Assert.assertNotNull(r.getData());
    }

    @Test
    public void insertDatabaseTest() throws Exception {
        Database data = new Database();
        data.setDatabaseName("dataservice");
        data.setDatabaseRemark("remark");
        data.setDatabaseTitle("title");
        data.setDatabaseType("mysql");
        data.setStatus(true);
        Result<Boolean> r = dataService.insertDatabase(data);
        Assert.assertTrue(r.getMethodResult());
        Assert.assertTrue(r.getData());
    }

    @Test
    public void insertTableTest() throws Exception {
        Database database = this.inserDatabaseData();
        Table info = new Table();
        info.setTableName("table");
        info.setTableRemark("remark");
        info.setTableTitle("title");
        Result<Boolean> r = dataService.insertTable(info, database.getDatabaseId());
        Assert.assertTrue(r.getMethodResult());
        Assert.assertTrue(r.getData());
    }

    @Test
    public void insertBatchColumnsTest() throws Exception {
        Database database = inserDatabaseData();
        Table table = inserTableData(database.getDatabaseId());
        Column info = new Column();
        info.setDataType("varchar");
        info.setColumnName("column");
        info.setColumnTitle("title");
        List<Column> list = new ArrayList<Column>();
        Result<Boolean> r = dataService.insertBatchColumns(list, table.getTableId());
        Assert.assertTrue(r.getMethodResult());
        Assert.assertTrue(r.getData());
    }


}

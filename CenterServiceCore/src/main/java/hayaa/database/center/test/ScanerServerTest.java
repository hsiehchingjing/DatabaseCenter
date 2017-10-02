package hayaa.database.center.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration({"/spring/app*.xml"}) //加载配置文件
public class ScanerServerTest {
    @Test
    public void scanDatabaseByConnection() throws Exception {
    }

    @Test
    public void scanDatabaseByDatabaseId() throws Exception {
    }

}
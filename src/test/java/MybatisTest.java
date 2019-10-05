import com.test.controller.AccountController;
import com.test.mapper.AccountMapper;
import com.test.model.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 20190712713
 * @date 2019/10/5 16:24
 */
public class MybatisTest {

    AccountMapper accountMapper;
    InputStream inputStream;
    SqlSession session;
    @Before
    public void createMapper() throws IOException {
        // 加载配置文件
        inputStream = Resources.getResourceAsStream("mybatisConfig.xml");
        // 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        // 创建sqlSession对象
        session = factory.openSession();
        // 获取代理对象
        accountMapper = session.getMapper(AccountMapper.class);

    }

    @Test
    public void save(){
        Account account = new Account();
        account.setMoney(156654546D);
        account.setName("欧阳晓通");

        accountMapper.saveAccount(account);

    }
    @Test
    public void findall(){
        List<Account> list = accountMapper.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
    }

    @After
    public void close() throws IOException {
        session.commit();
        inputStream.close();
        session.close();
    }


}

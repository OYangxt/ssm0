import com.test.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 20190712713
 * @date 2019/10/5 16:24
 */
public class ServiceTest {

    @Test
    public void findAllTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as = (AccountService) applicationContext.getBean("accountService");

        as.findAll();
    }
}

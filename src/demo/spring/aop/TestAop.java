package demo.spring.aop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @program: springaop
 * @description:
 * @author: kai.wang1
 * @create: 2019-05-12 18:16
 */
public class TestAop {

    /**
     * springaop测试
     */
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Book book = (Book) applicationContext.getBean("book");
        book.add();
    }
}
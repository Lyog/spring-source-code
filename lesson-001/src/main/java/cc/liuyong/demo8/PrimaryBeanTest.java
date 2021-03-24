package cc.liuyong.demo8;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrimaryBeanTest {

    @Test
    public void normalBean(){
        String xmlPath = "classpath:/cc/liuyong/demo8/PrimaryBean.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
    }
}

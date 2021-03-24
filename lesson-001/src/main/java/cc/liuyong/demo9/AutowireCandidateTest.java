package cc.liuyong.demo9;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireCandidateTest {

    @Test
    public void normalBean(){
        String xmlPath = "classpath:/cc/liuyong/demo9/AutowireCandidateBean.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(context.getBean("setterBean"));
        System.out.println(context.getBean(AutowireCandidateBean.ServiceA.class));
    }
}

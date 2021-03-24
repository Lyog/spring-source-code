package cc.liuyong.demo10;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyInitBeanTest {

    @Test
    public void lazyInitBean(){
        String xmlPath = "classpath:/cc/liuyong/demo10/LazyInitBean.xml";
        System.out.println("Spring容器开始启动");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println("Spring容器启动完成");
        System.out.println(context.getBean("lazyInitBean1"));
    }

    @Test
    public void ActualTimeDependencyLazyBean(){
        String xmlPath = "classpath:/cc/liuyong/demo10/LazyInitBean.xml";
        System.out.println("Spring容器开始启动");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println("Spring容器启动完成");
        System.out.println(context.getBean("actualTimeDependencyLazyBean"));
    }
}

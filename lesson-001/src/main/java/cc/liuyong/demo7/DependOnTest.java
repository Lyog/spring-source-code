package cc.liuyong.demo7;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependOnTest {

    @Test
    public void normalBean(){
        String xmlPath = "classpath:/cc/liuyong/demo7/NormalBean.xml";
        System.out.println("Spring容器启动中");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println("Spring容器准备关闭");
        context.close();
        System.out.println("Spring容器已关闭");
    }

    @Test
    public void strongDependenceBean(){
        String xmlPath = "classpath:/cc/liuyong/demo7/StrongDependenceBean.xml";
        System.out.println("Spring容器启动中");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println("Spring容器准备关闭");
        context.close();
        System.out.println("Spring容器已关闭");
    }

    @Test
    public void dependOnBean(){
        String xmlPath = "classpath:/cc/liuyong/demo7/NormalBean.xml";
        System.out.println("Spring容器启动中");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println("Spring容器准备关闭");
        context.close();
        System.out.println("Spring容器已关闭");
    }
}

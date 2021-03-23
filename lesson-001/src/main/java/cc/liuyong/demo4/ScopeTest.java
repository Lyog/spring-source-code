package cc.liuyong.demo4;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    ClassPathXmlApplicationContext context;

    @Before
    public void before(){
        System.out.println("spring容器准备启动……");
        String xmlPath = "classpath:/cc/liuyong/demo4/beans.xml";
        this.context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println("spring容器启动完毕！");
    }

    @Test
    public void singletonBean(){
        System.out.println("------单例bean，每次获取的bean实例都一样------");
        System.out.println(this.context.getBean("singletonBean"));
        System.out.println(this.context.getBean("singletonBean"));
        System.out.println(this.context.getBean("singletonBean"));
    }

    @Test
    public void prototypeBean(){
        System.out.println("------原型bean，每次获取的bean实例都不一样------");
        System.out.println(this.context.getBean("prototypeBean"));
        System.out.println(this.context.getBean("prototypeBean"));
        System.out.println(this.context.getBean("prototypeBean"));

    }
}

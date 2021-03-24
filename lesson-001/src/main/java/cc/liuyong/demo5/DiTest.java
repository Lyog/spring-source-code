package cc.liuyong.demo5;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {
    private ClassPathXmlApplicationContext context;

    @Before
    public void before() {
        System.out.println("spring容器准备启动……");
        String xmlPath = "classpath:/cc/liuyong/demo5/DiAutowireByName.xml";
        this.context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println("spring容器启动完毕！");
    }

    @Test
    public void diByConstructorParamIndex() {
        System.out.println(context.getBean("diByConstructorParamIndex"));
    }

    @Test
    public void diByConstructorParamType() {
        System.out.println(context.getBean("diByConstructorParamType"));
    }

    @Test
    public void diByConstructorParamName() {
        System.out.println(context.getBean("diByConstructorParamName"));
    }

    @Test
    public void diBySetter() {
        System.out.println(context.getBean("diBySetter"));
    }

    @Test
    public void diBeanBySetter() {
        System.out.println(context.getBean("diBeanBySetter"));
    }

    @Test
    public void diBeanByConstructor() {
        System.out.println(context.getBean("diBeanByConstructor"));
    }

    @Test
    public void diOtherType() {
        System.out.println(context.getBean("diOtherType"));
    }
}

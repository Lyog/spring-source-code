package cc.liuyong.demo6;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;
import java.util.List;

public class DiAutowireTest {

    private ClassPathXmlApplicationContext context;
//
//    @Before
//    public void before() {
//        System.out.println("spring容器准备启动……");
//        String xmlPath = "classpath:/cc/liuyong/demo6/DiAutowireByName.xml";
//        this.context = new ClassPathXmlApplicationContext(xmlPath);
//        System.out.println("spring容器启动完毕！");
//    }

    @Test
    public void isAssignableFrom() {
        System.out.println(Object.class.isAssignableFrom(Integer.class));
        System.out.println(Object.class.isAssignableFrom(int.class));
        System.out.println(Object.class.isAssignableFrom(List.class));
        System.out.println(Collection.class.isAssignableFrom(List.class));
        System.out.println(List.class.isAssignableFrom(Collection.class));
    }


    @Test
    public void diAutowireByName() {
        String xmlPath = "classpath:/cc/liuyong/demo6/DiAutowireByName.xml";
        this.context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(context.getBean("diAutowireByName1"));
        System.out.println(context.getBean("diAutowireByName2"));

    }

    @Test
    public void diAutowireByType() {
        String xmlPath = "classpath:/cc/liuyong/demo6/DiAutowireByName.xml";
        this.context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(context.getBean("diAutowireByType1"));
    }

    @Test
    public void diAutowireByTypeExtend() {
        String xmlPath = "classpath:/cc/liuyong/demo6/DiAutowireByTypeExtend.xml";
        this.context = new ClassPathXmlApplicationContext(xmlPath);
        DiAutowireByTypeExtend diAutowireByTypeExtend = context.getBean(DiAutowireByTypeExtend.class);
        System.out.println("serviceList：" + diAutowireByTypeExtend.getServiceList());
        System.out.println("baseServiceList：" + diAutowireByTypeExtend.getBaseServiceList());
        System.out.println("serviceMap：" + diAutowireByTypeExtend.getServiceMap());
        System.out.println("baseServiceMap：" + diAutowireByTypeExtend.getBaseServiceMap());
    }

    @Test
    public void diAutowireByConstructor() {
        String xmlPath = "classpath:/cc/liuyong/demo6/DiAutowireByConstructor.xml";
        this.context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(context.getBean("diAutowireByConstructor1"));
    }
}

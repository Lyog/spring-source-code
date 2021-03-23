package cc.liuyong.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        String xmlPath = "classpath:/cc/liuyong/demo1/users.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.say();
    }
}

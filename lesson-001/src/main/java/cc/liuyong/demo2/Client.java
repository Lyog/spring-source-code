package cc.liuyong.demo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {

        String xmlPath = "classpath:/cc/liuyong/demo2/beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);

        for (String beanName: Arrays.asList("user1","user2","user3","user4","user5")){
            String[] aliases = context.getAliases(beanName);
            System.out.printf("beanName:%s,别名：[%s]%n",beanName,String.join(",",aliases));
        }
        System.out.println("spring容器中所有bean如下：");
        for (String beanName:context.getBeanDefinitionNames()){
            String[] aliases = context.getAliases(beanName);
            System.out.printf("beanName:%s,别名：[%s]%n",beanName,String.join(",",aliases));
        }

    }
}

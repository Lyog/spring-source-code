package cc.liuyong.demo4;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

public class ThreadScopeTest {
    ClassPathXmlApplicationContext context;

    @Before
    public void before(){
        String xmlPath = "classpath:/cc/liuyong/demo4/beans-thread.xml";
        this.context = new ClassPathXmlApplicationContext(xmlPath);
        context.getBeanFactory().registerScope(ThreadScope.THREAD_SCOPE,new ThreadScope());
    }

    @Test
    public void threadBean() throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread() + "," + context.getBean("threadBean"));
                System.out.println(Thread.currentThread() + "," + context.getBean("threadBean"));
            }).start();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}

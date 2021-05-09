package cc.liuyong.demo15;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ClassProxyTest {

    @Test
    public void testM1() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<IService> proxyClass = (Class<IService>) Proxy.getProxyClass(IService.class.getClassLoader(), IService.class);
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("我是InvocationHandler，被调用的方法是：" + method.getName());
                return null;
            }
        };

        IService iService = proxyClass.getConstructor(InvocationHandler.class).newInstance(invocationHandler);
        iService.m1();
        iService.m2();
        iService.m3();
    }

    @Test
    public void testM2(){
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("我是InvocationHandler，被调用的方法是：" + method.getName());
                return null;
            }
        };
        IService iService = (IService) Proxy.newProxyInstance(IService.class.getClassLoader(), new Class[]{IService.class}, invocationHandler);
        iService.m1();
        iService.m2();
        iService.m3();
    }
}

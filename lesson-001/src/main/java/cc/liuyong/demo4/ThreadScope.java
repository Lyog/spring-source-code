package cc.liuyong.demo4;


import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ThreadScope implements Scope {

    public static final String THREAD_SCOPE = "thread";

    private ThreadLocal<Map<String, Object>> beanMap = new ThreadLocal() {
        @Override
        protected Object initialValue() {
            return new HashMap<>();
        }
    };

    @Override
    public Object get(String s, ObjectFactory<?> objectFactory) {
        Object o = beanMap.get().get(s);
        if (Objects.isNull(o)) {
            o = objectFactory.getObject();
            beanMap.get().put(s, o);
        }
        return o;
    }

    @Override
    public Object remove(String s) {
        return this.beanMap.get().remove(s);
    }

    /**
     * 用户注册销毁时回调
     */
    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {
        System.out.println(s);
    }

    /**
     * 解析对应的上下文数据，不如request作用域将返回request中的属性
     */
    @Override
    public Object resolveContextualObject(String s) {
        return s;
    }

    /**
     * 作用域的会话标志
     */
    @Override
    public String getConversationId() {
        return Thread.currentThread().getName();
    }
}

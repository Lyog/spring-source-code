package cc.liuyong.demo8;

import org.springframework.beans.factory.DisposableBean;

public class PrimaryBean {
    public interface IService{}
    public static class ServiceA implements IService{}
    public static class ServiceB implements IService{}

    private IService service;

    public void setService(IService service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "PrimaryBean{" +
                "service=" + service +
                '}';
    }
}

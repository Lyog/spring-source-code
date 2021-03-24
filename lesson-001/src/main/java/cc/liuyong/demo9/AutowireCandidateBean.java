package cc.liuyong.demo9;

public class AutowireCandidateBean {
    public interface IService{}
    public static class ServiceA implements IService{}
    public static class ServiceB implements IService{}

    private IService service;

    public void setService(IService service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "AutowireCandidateBean{" +
                "service=" + service +
                '}';
    }
}

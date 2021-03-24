package cc.liuyong.demo6;

public class DiAutowireByConstructor {

    public static class BaseService{
        private String desc;

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        @Override
        public String toString() {
            return "BaseService{" +
                    "desc='" + desc + '\'' +
                    '}';
        }
    }

    public static class Service1 extends BaseService {}
    public static class Service2 extends BaseService{}

    private Service1 service1;
    private Service2 service2;

    public DiAutowireByConstructor() {
        System.out.println("DiAutowireByConstructor()");
    }

    public DiAutowireByConstructor(Service1 service1) {
        System.out.println("DiAutowireByConstructor(Service1 service1)");
        this.service1 = service1;
    }

    public DiAutowireByConstructor(Service1 service1, Service2 service2) {
        System.out.println("DiAutowireByConstructor(Service1 service1, Service2 service2)");
        this.service1 = service1;
        this.service2 = service2;
    }

    public Service1 getService1() {
        return service1;
    }

    public void setService1(Service1 service1) {
        this.service1 = service1;
    }

    public Service2 getService2() {
        return service2;
    }

    public void setService2(Service2 service2) {
        this.service2 = service2;
    }

    @Override
    public String toString() {
        return "DiAutowireByConstructor{" +
                "service1=" + service1 +
                ", service2=" + service2 +
                '}';
    }
}

package cc.liuyong.demo3;

public class UserStaticFactory {

    public static UserModel buildUser1() {
        System.out.println(UserStaticFactory.class + ".buildUser1()");
        UserModel userModel = new UserModel();
        userModel.setName("无参构建");
        return userModel;
    }

    public static UserModel buildUser2(String name, int age) {
        System.out.println(UserStaticFactory.class + ".buildUser2()");
        return new UserModel(name, age);
    }
}

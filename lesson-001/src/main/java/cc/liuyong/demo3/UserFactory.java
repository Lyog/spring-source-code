package cc.liuyong.demo3;

public class UserFactory {

    public UserModel buildUser1() {
        System.out.println(UserFactory.class + ".buildUser1()");
        UserModel userModel = new UserModel();
        userModel.setName("无参构建");
        return userModel;
    }

    public UserModel buildUser2(String name, int age) {
        System.out.println(UserFactory.class + ".buildUser2()");
        return new UserModel(name, age);
    }
}

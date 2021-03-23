package cc.liuyong.demo3;

import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<UserModel> {
    int count = 1;

    @Override
    public UserModel getObject() throws Exception {
        UserModel userModel = new UserModel();
        userModel.setName("通过FactoryBean创建的第" + count++ + "个对象");
        return userModel;
    }

    @Override
    public Class<?> getObjectType() {
        return UserModel.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}

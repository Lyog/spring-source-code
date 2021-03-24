package cc.liuyong.demo5;

import java.beans.ConstructorProperties;

public class CarModel {
    private String name;
    private String desc;

    public CarModel() {
    }

    @ConstructorProperties({"name","desc"})
    public CarModel(String p1, String p2) {
        this.name = p1;
        this.desc = p2;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

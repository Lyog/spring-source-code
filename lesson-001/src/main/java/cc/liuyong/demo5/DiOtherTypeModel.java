package cc.liuyong.demo5;

import java.util.*;

public class DiOtherTypeModel {

    private List<String> list;
    private Set<UserModel> set;
    private Map<String,Integer> map;
    private int[] array;
    private Properties properties;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<UserModel> getSet() {
        return set;
    }

    public void setSet(Set<UserModel> set) {
        this.set = set;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DiOtherTypeModel{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", array=" + Arrays.toString(array) +
                ", properties=" + properties +
                '}';
    }
}

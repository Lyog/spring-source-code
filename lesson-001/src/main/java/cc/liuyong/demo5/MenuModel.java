package cc.liuyong.demo5;

public class MenuModel {
    private String label;
    private Integer theSort;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getTheSort() {
        return theSort;
    }

    public void setTheSort(Integer theSort) {
        this.theSort = theSort;
    }

    @Override
    public String toString() {
        return "MenuModel{" +
                "label='" + label + '\'' +
                ", theSort=" + theSort +
                '}';
    }
}

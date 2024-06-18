package objectExercise;

public class Land extends Property {
    private double area;

    public Land(String name, String owner, String type, int price, double area) {
        super(name, owner, type, price);
        this.area = area;
    }
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void propertyInformation() {
        super.propertyInformation();
        System.out.println("広さ：" + this.area + "㎡");
    }
}

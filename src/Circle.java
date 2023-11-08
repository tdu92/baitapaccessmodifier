package src;

public class Circle {
    //khai bao 2 properties
    private double radius = 1.0;
    private String color = "red";

// khai bao constructor khong tham so
    private Circle() {}
//khai bao constructor co tham so
    public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
    }

    // khai bao 2 methods
    public void setRadius(double radius) {
        this.radius = radius;
        }
        public void setColor(String color) {
            this.color = color;
        }

    public double getRadius() { return radius;}
    public double getArea() { return 3.14*radius*radius;}

}

package Final;
import java.util.Date;

public class Cylinder extends Shape implements Drawable3D, Comparable<Cylinder> {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return height * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void printArea() {
        System.out.println("Cylinder Area: " + getArea());
    }

    @Override
    public int compareTo(Cylinder o) {
        return Double.compare(this.getVolume(), o.getVolume());
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ", height=" + height + "]";
    }
}



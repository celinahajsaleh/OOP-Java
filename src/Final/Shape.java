package Final;

import java.util.Date;

public abstract class Shape {
    protected double radius;
    protected String color;
    protected Date dateCreated;

    protected Shape() {
    }
    protected Shape(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", dateCreated=" + new Date() +
                '}';
    }
    public abstract void printArea();
}


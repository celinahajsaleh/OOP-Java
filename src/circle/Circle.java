package circle;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius =1.0;
        color = "Red";
    }

    public double getRadius() {return radius;}
    public void setRadius(double radius) {this.radius = radius;}
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public Circle(double radius) {this.radius = radius;}
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;}
    public void setInfo(double radius, String color){
        this.radius=radius;
        this.color=color;}
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;}
    public String toString(){
        return "The area of circle for the radius= "+ getRadius()+" is= "+getArea()+
                "  and its color is: "+getColor();}
}

package shapes;

public class Shape1 {
    protected double height; //مثال عن البروتكتد وكيف نستدعيه ببكج تاني protextedModifier
    private double width;

    public Shape1() {
    }

    public Shape1(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Shape1(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "this is a super" + "Shape{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}

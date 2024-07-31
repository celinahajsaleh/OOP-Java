package shapes;

public class Triangle extends Shape1 {
    private double base;

    public Triangle(double height, double base) {
        super(height);
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                "} " + super.toString();
    }
}


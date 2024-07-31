package shapes;

public class Rect extends Shape1 {
    public Rect(double height, double width) {
        super(height, width);
    }

    public void printpermitter() {
        System.out.println(2 * getHeight() + 2 * getWidth());
    }

    @Override
    public String toString() {
        return "Rect{" +
                "height=" + getHeight() +
                ", width=" + getWidth() +
                '}';
    }
}

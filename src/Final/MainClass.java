package Final;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MainClass {

    public static void printDetails(Shape shape) {
        System.out.println(shape.toString());
        shape.printArea();
        if (shape instanceof Drawable3D) {
            System.out.println("Volume: " + ((Drawable3D) shape).getVolume());
        }
    }
    public static void main(String[] args) {
        Cylinder[] cylinders = new Cylinder[4];
        cylinders[0] = new Cylinder(2, "Pink", 4);
        cylinders[1] = new Cylinder(5, "Black", 6);
        cylinders[2] = new Cylinder(3, "Green", 7);
        cylinders[3] = new Cylinder(4, "White", 5);
        Arrays.sort(cylinders);
        try (FileWriter writer = new FileWriter("CelinaHajsaleh.txt")) {
            writer.write(cylinders[cylinders.length - 1].toString());
            writer.write("\nArea: " + cylinders[cylinders.length - 1].getArea());
            writer.write("\nVolume: " + cylinders[cylinders.length - 1].getVolume());
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Cylinder cylinder : cylinders) {
            printDetails(cylinder);
        }
    }
}


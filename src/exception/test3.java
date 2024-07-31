package exception;

import java.util.*;

public class test3 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        getArea(c.nextDouble());
        try { //اذا ما حطيت try, catch حيعطي ايرور
            getPrimeter(c.nextDouble());
        } catch (Exception e) {
            e.printStackTrace(); //بطبعه زي شكل ايرور لون احمر
            //System.err.println("Radius cant be Negative"); نفسها
        }
    }

    public static void getArea(double r) throws InputMismatchException, ArithmeticException { //عشان نوعهم الاكسبشنز unchecked مش ضروري نعرفهم هون بالheader يعني هون عازي لو ما عملنا throws..
        if (r >= 0) {
            double area = r * r * Math.PI;
            System.out.println(area);
        } else {
            throw new InputMismatchException("Radius cant be Negative");
            //System.out. println("Radius cant be Negative");
        }
        if (r == 0) {
            throw new ArithmeticException("Radius is zero");
        }
    }

    public static void getPrimeter(double r) throws Exception { //عشان نوعهم الاكسبشنز checked  ضروري نعرفهم هون بالheader يعني هون لازم نحط throws..
        if (r >= 0) {
            double area = 2 * r * Math.PI;
            System.out.println(area);
        } else {
            throw new Exception("Radius cant be Negative"); //checked
            //System.out. println("Radius cant be Negative");
        }
        if (r == 0) {
            throw new ArithmeticException("Radius is zero"); //unchecked
        }
    }
}

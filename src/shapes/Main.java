package shapes;

public class Main {
    public static void main(String[] args) {
        Rect r = new Rect(10, 20);
        System.out.println(r.getArea());
        r.printpermitter();
        System.out.println("*************************");
        //with polymorphism
        Shape1 s = new Rect(12, 20);
        System.out.println(s.getArea());
        ((Rect) s).printpermitter(); //if i want to invoke a method from the son class and i have a pointer from the father class we do casting
        //casting===> ((son class).object from father class).the method from son class
        //method Matching مش معموله override
        //any method that is not overrided it is calleed Matching
        System.out.println("***********************************");
        Object b = new Rect(10, 15);
        System.out.println(b.toString()); //Dynamic Binding==> بتطبع الي موجودة بكلاس الابن Rect
        System.out.println("***************************");
        Rect f = new Rect(15, 22);
        PrintData(f);
        //Shape x= new Rect(15,22); the same
        System.out.println("*************");
        PrintData(s); //shape x= new shape(12,20);
        System.out.println("*************");
        Shape1 w = new Shape1(22, 20);
        PrintData(w); //in ((Rect)x).printpermitter(); it will give an error because w points at Shape and not Rect
        System.out.println("************************");

        Triangle t = new Triangle(10, 5);
        printdata(s);
        printdata(r);
        printdata(t);

    }

    public static void printdata(Object s) { //instance of
        s.toString();
        if (s instanceof Rect) {
            System.out.println("I'm Rect");
            ((Rect) s).printpermitter();
            System.out.println(((Rect) s).getArea());
        } else if (s instanceof Triangle) {
            System.out.println("I'm Triangle");
            double base = ((Triangle) s).getBase();
            double height = ((Triangle) s).getHeight();

            System.out.println("Area= " + 0.5 * base * height);

        }
    }

    public static void PrintData(Object x) { //Object is a genaric class الاب الروحي
        System.out.println(x.toString()); //Dynamic Binding
        ((Rect) x).printpermitter();
    }

}

package car;

public class carMain {
    public static void main(String[]args){
        Car c1=new Car("DF",22,"red");
        Car c2=new Car("Drf",25,"black");
        Car c3=new Car("sdsf",78,"pink");
        c1=c2;
        c1.printInfo();
        c2.printInfo();
        System.out.println(c2);
        System.out.println(c3);



    }
}

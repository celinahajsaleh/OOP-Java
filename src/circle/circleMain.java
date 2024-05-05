package circle;

public class circleMain {
    public static void main(String[] args){
        Circle c1=new Circle();
        System.out.println(c1.toString());
        c1.setRadius(5);
        System.out.println(c1.toString());
        c1.setInfo(2, "black");
        System.out.println(c1.toString());
        Circle c2=new Circle(3 , "Pink");
        System.out.println(c2.toString());
    }
}

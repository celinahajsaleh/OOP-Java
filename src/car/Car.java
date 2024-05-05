package car;
public class Car {
    private String name;
    private int model;
    private String color;
    public static int count;
    public Car(){ count++; }
    public Car(String name, int model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
        count++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getModel() {
        return model;}
    public void setModel(int model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Car.count = count;
    }
    public void printInfo(){
        System.out.println("Car name  "+this.name+" color  "+this.color+" counted from  "+count+" model "+this.model);
    }
}

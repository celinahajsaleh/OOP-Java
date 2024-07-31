package humanAnimal;

public class main {
    public static void main(String[] args) {
        Human h = new Human("Ahmad");
        Animal a = new Animal("Cat");
        Eat(a);
        Eat(h);
    }

    private static void Eat(Object creature) {
        if (creature instanceof Human) {
            System.out.println(((Human) creature).eat("Falafel"));
        } else if (creature instanceof Animal) {
            System.out.println(((Animal) creature).eat("Tepen"));
        }
    }

}

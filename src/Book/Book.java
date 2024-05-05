/*
package Book;
public class Book {
    private String name;
private Author auth;
private double price;
private int qty;
    public Book() {
    }
    public Book(String name, Author auth, double price, int qty) {
        this.name = name;
        this.auth = auth;
        this.price = price;
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Author getAuth() {
        return auth;
    }
    public void setAuth(Author auth) {
        this.auth = auth;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public void getInfo(){
        System.out.println("*********************");
        System.out.println("Book name "+this.name);
        System.out.println("Book price "+this.price);
        System.out.println("Book QTY "+this.qty);
        System.out.println("Book Auther "+this.auth); //رح يطبع موقع الauth بالذاكرة مش الداتا الي جواه
        System.out.println("Author name "+this.auth.getName());
        System.out.println("Auth email"+this.auth.getEmail());
        System.out.println("Book Gender "+this.auth.getGender());

    }
}
*/
package Book;
public class Book {
    private String name;
    private Author [] autharr;
    private double price;
    private int qty=0;

    public Book(String name, Author[] author, double price) {
        this.name = name;
        this.autharr = author;
        this.price = price;
    }

    public Book(String name,Author [] author, double price, int qty) {
        this.name = name;
        this.autharr = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthor() {
        return autharr;
    }

    public void setAutharr(Author[] author) {
        this.autharr = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book{" +
                "name='" + this.name + '\'' +
                ", author=" + this.autharr +
                ", price=" + this.price +
                ", qty=" + this.qty +
                '}';
    }
}

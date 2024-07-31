package medexam;

public class University {
    private String name;
    private String e_mail;
    private int counter=0;

    public University() {
    }

    public University(String name, String e_mail) {
        this.name = name;
        this.e_mail = e_mail;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", e_mail='" + e_mail + '\'' +
                ", counter=" + counter +
                '}';
    }
}

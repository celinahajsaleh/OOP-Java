/*
package Book;
public class Author {
     private String name;
     private String Email;
    private char gender;

    public Author() {
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        Email = email;
        this.gender = gender;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getEmail() {return Email;}
    public void setEmail(String email) {Email = email;}
    public char getGender() {return gender;}
    public void setGender(char gender) {this.gender = gender;}
    public void setAuthor(String name,String Email, char gender){
        this.name=name;
        this.gender=gender;
        this.Email=Email;
    }
}
*/
package Book;
public class Author {
    private String name;
    private String Email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        Email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}

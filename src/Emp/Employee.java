package Emp;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;
    static int count = 0;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        return (int) (salary += (salary * percent / 100.0));
    }

    public String toString() {
        return "Employee [" + "Id: " + id + "\tName: " + getName() + "\tsalary: " +
                getSalary() + "\tThe annual salary is: " + getAnnualSalary() + "\traise salary to 20%: " +
                raiseSalary(20) + "]";


    }
}



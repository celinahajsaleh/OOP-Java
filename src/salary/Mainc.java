package salary;

import java.util.*;

public class Mainc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Emp name and his salaru:");
        System.out.println("Emp 1:");
        Empl e = new Programmer(in.next(), in.nextDouble());
        System.out.println("Emp 2:");
        Empl r = new Manager(in.next(), in.nextDouble());
        System.out.println("Emp 3:");
        Empl s = new Manager(in.next(), in.nextDouble());
        increasSal(e);
        increasSal(r);
        increasSal(s);
    }
    public static void increasSal(Empl emp) {
        System.out.println(emp.toString());

        if (emp instanceof Manager) {
            emp.setSalary((emp.getSalary() + (emp.getSalary() * 0.2)));
            System.out.println(emp.getName() + " is a Manager the new salary is: " + emp.getSalary());
        } else if (emp instanceof Programmer) {
            emp.setSalary(emp.getSalary() + (emp.getSalary() * 0.1));
            System.out.println(emp.getName() + "  is a Programmer the new salary is: " + emp.getSalary());

        } else {
            System.out.println("no raising in salary");
        }
    }
}

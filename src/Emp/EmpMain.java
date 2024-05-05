package Emp;

import java.util.Scanner;
public class EmpMain {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter ur Id,First and Last Name,and ur salary");
        Employee e1=new Employee(s.nextInt(),s.next(), s.next(), s.nextInt());

        System.out.println(e1.toString());
        e1.setSalary(234567);
        System.out.println("The updated salary info for the emplo:");
        System.out.println(e1.toString());
        System.out.println(Employee.count);
        Employee e2=new Employee(1234455,"Celina","Hajsaleh",234567);
        Employee e3=new Employee(14455,"Celina","Hajsaleh",234567);
        Employee e5=new Employee(123445,"Celina","Hajsaleh",234567);
        Employee e4=new Employee(34455,"Celina","Hajsaleh",234567);
        Employee e8=new Employee(23445,"Celina","Hajsaleh",234567);
        System.out.println(Employee.count); //عشان نعرف كم object عنا
        /*Employee [] empArr=new Employee[3];
        for (int i = 0; i < empArr.length; i++) {
            empArr[i]=new Employee(s.nextInt(),s.next(), s.next(), s.nextInt());
            System.out.println("*****************************");
        }
        System.out.println(Employee.count);
        System.out.println("******************************");

        for (int i = 0; i < empArr.length; i++) {
            System.out.println(empArr[i].toString());
            System.out.println("*******************************");

                     }*/

    }

}

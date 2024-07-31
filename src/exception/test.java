package exception;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            System.out.println(x * x);
            System.out.println(x * x * x);
            System.out.println(Math.sqrt(x));
        } catch (Exception e) { //Exception is the super class مش شرط نحطها بنقدر نحط فيرها
            System.out.println("I'm in Catch");
            System.out.println(e);
        }
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println("End of System");
    }}

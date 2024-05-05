/*
package Book;
import java.util.*;

public class MainClass {
    public static void main(String[]args){
        */
/*Scanner in=new Scanner(System.in);
        System.out.println("Enter Author's name: ");
        String a=in.nextLine() ;
        System.out.println("Enter his Email Address: ");
        String e= in.nextLine();
        System.out.println("What's his gender? ");
        char g=in.next().charAt(0);
        Author x= new Author(a,e,g);*//*

        Author x= new Author("Muhammad","muhammed.saffarini@gmail.com",'M');
        Book b=new Book("OOP",x,120.4,33); //عند الx ما حطلنا جمبها انه عن شو هاي ما حكالنا مقلا انها بتمثل الauthor(القيمة الراجعة) عشان احنا ما بعتنا القيمة مباشرة بعتت متغير
        b.getInfo();

//        int y=87765;
       Integer myInteger = 5; // بدلاً من Integer myInteger = new Integer(5);
//        Integer.BigInteger;
//        Integer myInteger = new Integer(5);
        Integer.parseInt("122", 2);

    }
}
*/
package Book;
import java.util.*;
public class MainClass {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int r= in.nextInt();
        String d=in.nextLine();
        System.out.println(r);
        System.out.println(d);


    }
}

package files;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class TableNo {
    public  static void main(String [] args){
       try {
           File in=new File("No.txt");
           File out=new File("tableNo.txt");
           PrintWriter p=new PrintWriter(out);
           Scanner n =new Scanner(in);
           while (n.hasNextInt()){
               p.println("****************************************************************");

               int x=n.nextInt() ;
               p.println("<<< Table of "+x+" >>>");

               for (int i = 1; i <= 10; i++) {
                  p.println("\t"+x+" * "+i+" = "+x*i);

               }
           }
           p.println("****************************************************************");
           p.close();

       }catch (Exception e){
e.printStackTrace();
       }
    }
}

package files;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        try {

            File fIn = new File("Name.txt");
            File fOut = new File("output.txt");
            PrintWriter pw = new PrintWriter(fOut);
            Scanner s = new Scanner(fIn);
            while (s.hasNextLine()) {
                String st = s.next();
                pw.println(st+" ==> "+st.length());
            }
            pw.close();//لازم نسكرها
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

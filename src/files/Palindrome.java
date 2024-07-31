package files;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        try {
            File in = new File("palNo.txt");
            File output = new File("isPalindrome.txt");
            PrintWriter pwr = new PrintWriter(output);
            Scanner n = new Scanner(in);
            while (n.hasNext()) {
                String s = n.next();
                int flag = 0;
                int j = s.length() - 1;

                for (int i = 0; i <= s.length()/2; i++) {
                    if(s.charAt(i)!=s.charAt(j)){
                        flag=1;
                        break;
                    }
                    j--;
                }
                if(flag==0){
                    pwr.println(s+" ====> Pal");
                }
                else{
                    pwr.println(s+" ====> not Pal");}

            }
            pwr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

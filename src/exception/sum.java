package exception;
import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = 0;
        int sum = 0;
        while (x != -1) {
            try {
                x = in.nextInt();
                sum += x;
            } catch (Exception e) {
                System.out.println("Input Missmatch");
                in.nextLine(); //عشان اذا ادخلنا فوق نص بالغلط بفوت جوا الاكسبشن والمؤشر بكون لسا واقف ما قرأ اشي فحطينا هاي عشان يقرأها ويكبها
            }
        }
        try {
            System.out.println(10 / 0);
        } catch (Exception r) {
            System.out.println(r);
        }
        System.out.println(sum);
        System.out.println("End of system");
    }
}

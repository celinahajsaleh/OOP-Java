package exception;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int x = s.nextInt();
            System.out.println(x / 0);
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (ArithmeticException e) { //اكتر من اكسبشن غالبا احنا بنختصر عحالنا بنحط كلاس الاب الي هو Exception
            System.out.println(e);
        }
        //اكتر من اكسبشن بدخل على الاكسبشن الي اله علاقة فيه يعني بهاد المثال حيدخل عالاكسبشن التاني

        finally {//سواء تنفذ الاكسبشن او لا حيدخل جوا الفاينلي
            System.out.println("ok, now i'm in finally");
        }
    }
}

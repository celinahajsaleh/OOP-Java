package MarksWithNoClasses;

import java.util.*;

public class main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int count = 0;
        int sum = 0;
        while (i != -1) {
            try {
                i = s.nextInt();
                sum += i;
                count++;
            } catch (Exception e) {
                System.out.println("InputMissmatch!!!");
                s.nextLine();
            }
        }
        if (count == 0)
            System.out.println("can't devide by zero");
        else
            System.out.println("The AVG is: " + (sum * 1.0 / count));//subtract by 0.1 because if we dont it will give us exception(NAN) الدبل بعطينا نان او انفينيتي عشان مقسمة انت على انت الجواب غالبا حيكون دبل فبحط نان اذا ما كنا عاملين كاستنغ


    }
}

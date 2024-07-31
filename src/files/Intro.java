package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        File file = new File("r.txt"); //عشان عنا ملف التكست جمب الsrc فبنستدعي اسم الفايل بدون الpath
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        int x = sc.nextInt();
        System.out.println(x);
    }
}

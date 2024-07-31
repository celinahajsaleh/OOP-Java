package marks;

public class main {
    public static void main(String[]args){
        Student x=new Student("ahmad","567890",99);
        x.setName("ahmad");
        double [] marksArr={90, 85, 96, 92, 80};
        x.setUniMarksArr(marksArr);


        x.setUniMarksArr(new double[]{80,75,90,55,33});//اسندت قيمة جديدة للعلامات
        x.print(x.getUniMarksArr());
        System.out.println("The avg is "+x.getAvg());
    }
}

package marks;

public class Student extends Human {
    //Extends Human : attributes and methods from Human
    private double tawjihiMark;
    private double[] uniMarksArr;
    public Student(String name,String ID,double tawjihiMark){
        super(name,ID);
        this.tawjihiMark=tawjihiMark;
    }

    public double getTawjihiMark() {
        return tawjihiMark;
    }

    public void setTawjihiMark(double tawjihiMark) {
        this.tawjihiMark = tawjihiMark;
    }

    public double[] getUniMarksArr() {
        return uniMarksArr;
    }

    public void setUniMarksArr(double[] uniMarksArr) {
        this.uniMarksArr = uniMarksArr;
    }
    public double getAvg(){
        double sum=0;
        for (int i = 0; i < uniMarksArr.length; i++) {
            sum+=uniMarksArr[i];
        }
        return sum/uniMarksArr.length;}
    public void print(double arrr[])
    {

        for(int i=0; i<arrr.length;i++)
        {
            System.out.print(arrr[i]+" ");

        }
        System.out.println();
    }
    }


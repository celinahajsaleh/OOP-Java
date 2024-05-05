package StudentTeacher;
public class main {
    public static void main (String[]args){
      String coursesArr [] ={"Java","Data","linear"};
      int gradesArr[]= {99, 87,90};
       Student s1=new Student("lolo","nablus", coursesArr.length, coursesArr,gradesArr);
       s1.printGrade();
        System.out.println("Student AVG "+ s1.getAverageGrade());
        System.out.println(s1.toString());
        System.out.println("**********************************************************************************");
        String courseTeacher[]={"Swift","kotlin","Java","HTML","C#"};
        Teacher t1=new Teacher("Ahmad","Tulkarm",courseTeacher.length,courseTeacher);
        t1.printCourses();
        System.out.println(t1.removeCourse("Kotlin"));
        t1.printCourses();
        System.out.println(t1.toString());
    }
}

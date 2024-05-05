package StudentTeacher;
import java.util.Arrays;
public class Student extends Person{
    private int numCourses=0;
    private String[] courses={};
    private int[] grades={};

    public Student(String name, String address, int numCourses, String[] courses, int[] grades) {
        super(name, address);
        this.numCourses = numCourses;
        this.courses = courses;
        this.grades = grades;
    }
    public int getNumCourses() {
        return numCourses;
    }
    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    public String[] getCourses() {
        return courses;
    }
    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
    public void printGrade(){
        for (int i = 0; i < courses.length; i++) {
            System.out.println("Courses: "+courses[i]+"  ====> "+grades[i]);
        }
    }
    public double getAverageGrade(){
        double count=0;
        for (int i = 0; i < grades.length; i++) {
            count+=grades[i];
        }
        return count/grades.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "numCourses=" + numCourses +
                ", courses=" + Arrays.toString(courses) +
                ", grades=" + Arrays.toString(grades) +
                "} " + super.toString();
    }
}

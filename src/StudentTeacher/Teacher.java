package StudentTeacher;

import java.util.Arrays;

public class Teacher extends Person {
    private int numCourses=0;
    private String[] courses={};

    public Teacher(String name, String address, int numCourses, String[] courses) {
        super(name, address);
        this.numCourses = numCourses;
        this.courses = courses;
    }

    public boolean removeCourse(String course){
        for (int i = 0; i < courses.length; i++) {
            if(!courses[i].equals(course)){
                courses[i]=null;
                numCourses--;
            return true; }
        }
        return false;
    }
    public void printCourses(){
        for (int i = 0; i < courses.length; i++) {
            System.out.println("courses:  "+courses[i]);

        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "numCourses=" + numCourses +
                ", courses=" + Arrays.toString(courses) +
                "} " + super.toString();
    }
}

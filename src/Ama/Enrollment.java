//Program to identify the course name clash and time clash for a perticular student
package Ama;
import java.util.HashSet;
import java.util.Set;

class CourseEnrolled {
    public String id;
    public String name;
    public String time;
    CourseEnrolled(String id,String name,String time){
        this.id = id;
        this.name = name;
        this.time = time;
    }
}


/**
 * Created  on 5/15/18.
 */
public class Enrollment {
    static Set<CourseEnrolled> enrolled = new HashSet<CourseEnrolled>();
    public static void main(String[] args){
        //Sample data added
        enrolled.add(new CourseEnrolled("12","English","11:00"));
        enrolled.add(new CourseEnrolled("12","Science","12:00"));
        //Solution for the problem
        enroll("13","English","11:00");
    }

    public static void enroll(String id,String name,String time){
        CourseEnrolled newCourse = new CourseEnrolled(id,name,time);
        int flag = verifyEnrollment(newCourse);
         if (flag == 0) {
             System.out.println("Enrolling the course");
             enrolled.add(newCourse);
         }
         System.out.println("List of enrolled students");
        for(CourseEnrolled ce : enrolled){
            System.out.println(ce.id+" "+ce.name+" "+ce.time);
        }
    }
    public static int verifyEnrollment(CourseEnrolled newCourse){
        int flag = 0;
        for(CourseEnrolled ce : enrolled)
        {
            if (ce.id == newCourse.id)
            {
                if (ce.name == newCourse.name)
                {
                    System.out.println("Already enrolled in the course");
                    flag = 1;
                    break;
                }
                else if (ce.time == newCourse.time)
                {
                    System.out.println("Time is clashing");
                    flag = 1;
                    break;
                }
            }
        }
        return flag;
    }
}

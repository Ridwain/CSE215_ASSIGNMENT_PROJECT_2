import java.util.ArrayList;

public class Student extends User implements Action {
    //static String[][] student1CourseData = new String[3][4];
    static Course[] courseListForStudent1 = new Course[5];
    static Course[] courseListForStudent2 = new Course[5];
    static Course[] courseListForStudent3 = new Course[5];

    public Student() {

    }



    public Student(String email, String password, String id, String name, String studentCgpa) {
        this.setEmail(email);
        this.setPassword(password);
        this.setId(id);
        this.setName(name);
        this.setStudentCGPA(studentCgpa);
    }

    @Override
    public void handleActions() {
        System.out.println("1: ADD COURSE   2: VIEW COURSE  3:BACK");
    }
    @Override
    public void viewCourse(User user) {
            int i;
            if(user.getName().equals("A")) {
                for (i = 0; i < courseListForStudent1.length; i++) {
                    if (courseListForStudent1[i] != null) {
                        System.out.println("Course Name : " + courseListForStudent1[i].getCourseName() + "." + courseListForStudent1[i].getSection());
                    }
                }
            } else if (user.getName().equals("B")) {
                for (i = 0; i < courseListForStudent2.length; i++) {
                    if (courseListForStudent2[i] != null) {
                        System.out.println("Course Name : " + courseListForStudent2[i].getCourseName() + "." + courseListForStudent2[i].getSection());
                    }
                }
            } else if (user.getName().equals("C")) {
                for (i = 0; i < courseListForStudent3.length; i++) {
                    if (courseListForStudent3[i] != null) {
                        System.out.println("Course Name : " + courseListForStudent3[i].getCourseName() + "." + courseListForStudent3[i].getSection());
                    }
                }
            }

    }



    public static void addCourse(Student student, Course course) {
        int i;
        if (student.getName().equals("A")) {
            for (i = 0; i < courseListForStudent1.length; i++) {
                if (courseListForStudent1[i] == null) {
                    courseListForStudent1[i] = course;
                    break;
                }
            }
            System.out.println("Successfully Enrolled Course "+courseListForStudent1[i].getCourseName()+"."+courseListForStudent1[i].getSection());

        } else if (student.getName().equals("B")) {
            for ( i = 0; i < courseListForStudent2.length; i++) {
                if (courseListForStudent2[i] == null) {
                    courseListForStudent2[i] = course;
                    break;
                }
            }
        } else if (student.getName().equals("C")) {
            for (i = 0; i < courseListForStudent3.length; i++) {
                if (courseListForStudent3[i] == null) {
                    courseListForStudent3[i] = course;
                    break;
                }
            }
        }


    }
}

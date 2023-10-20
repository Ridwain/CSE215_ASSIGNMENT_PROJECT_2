import java.util.ArrayList;

public class Teacher extends User implements Action{
    private CourseManagement manager;


    public Teacher() {

    }
    public Teacher(String email,String password,String id,String name){
        this.setEmail(email);
        this.setPassword(password);
        this.setId(id);
        this.setName(name);
    }

    @Override
    public void handleActions() {
        Session session = Session.getSession();
        Course[] courses = session.getCourseList();
        System.out.println("1: View Courses  2: Log out");
        int choice = session.inputScanner.nextInt();

        if(choice == 1) {
            CourseManagement.viewCourse(this);

            if (this.getName().equals("A")) {
                System.out.println("\nEnter Your Choice : ");
                int select = session.inputScanner.nextInt();
                if (select == 1) {
                    Course.viewStudentList(courses[0]);
                } else if (select == 2) {
                    Course.viewStudentList(courses[2]);
                } else if (select == 3) {
                    Course.viewStudentList(courses[3]);
                } else if (select == 4) {
                    Course.viewStudentList(courses[5]);
                }
            } else if (this.getName().equals("B")) {
                System.out.print("\nEnter Your Choice : ");
                int select = session.inputScanner.nextInt();
                if (select == 1) {
                    Course.viewStudentList(courses[1]);
                } else if (select == 2) {
                    Course.viewStudentList(courses[4]);
                }
            } else if (choice == 2) {
                return;
            }
        }
    }
    @Override
    public void viewCourse(User user) {
        Session session = Session.getSession();
        Course[] course = session.getCourseList();
        if(user.getName().equals("A")) {
            int j = 1;
            for (Course value : course) {
                if (value.getTeacher().equals("T1")) {
                    System.out.print((j) + ". " + value.getCourseName() + "."+value.getSection()+"   ");
                    j++;
                }
            }
        } else if(user.getName().equals("B")){
            int j = 1;
            for (Course value : course) {
                if (value.getTeacher().equals("T2")) {
                    System.out.print((j) + ". " + value.getCourseName() + "."+value.getSection()+"   ");
                    j++;
                }
            }
        }

    }
    public static void addStudent(Student student){

    }
    public static void viewStudentList(){

    }



}

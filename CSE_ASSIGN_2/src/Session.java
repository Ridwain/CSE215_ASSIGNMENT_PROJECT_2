import java.util.Scanner;

public class Session {
    private static Session session = null;
    private User userList[] =new User[7];
    private Course courseList[] = new Course[6];
    public Scanner inputScanner = new Scanner(System.in);

    private Session(){
        createDatabase();
    }
    private void createDatabase(){

        userList[0]= new Student("student_a@northsouth.edu","password","S1","A","3.4");
        userList[1]= new Student("student_b@northsouth.edu","password","S2","B","3.4");
        userList[2]= new Student("student_c@northsouth.edu","password","S3","C","3.4");
        userList[3]= new Teacher("teacher_a@northsouth.edu","password","T1","A");
        userList[4]= new Teacher("teacher_b@northsouth.edu","password","T1","B");
        userList[5]= new Assistant("assistant_a@northsouth.edu","password","A1","A");
        userList[6]= new Assistant("assistant_b@northsouth.edu","password","A2","B");


        courseList[0] = new Course("1","Course A","1","A","T1","A");
        courseList[1] = new Course("2","Course A","2","A","T2","A");
        courseList[2] = new Course("3","Course A","3","B","T1","B");
        courseList[3] = new Course("4","Course B","1","D","T1","A");
        courseList[4] = new Course("5","Course C","1","B","T2","A");
        courseList[5] = new Course("6","Course C","2","C","T1","B");


    }
    public static Session getSession(){
        if(session == null) {
            session = new Session();
        }
        return session;
    }
    public Course[] getCourseList(){
        return courseList;
    }
    public User[] getUserList(){
        return userList;
    }
}

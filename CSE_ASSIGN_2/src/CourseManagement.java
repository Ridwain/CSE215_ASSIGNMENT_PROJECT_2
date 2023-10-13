import java.net.Socket;

public class CourseManagement {
    public static void main(String[] args) {
        while(true) {
            Session session = Session.getSession();
            System.out.print("Enter Your Email    : ");
            String email = session.inputScanner.nextLine();
            System.out.print("Enter Your Password : ");
            String password = session.inputScanner.nextLine();

            try {
                User user = login(email,password);
                if(user instanceof Student){
                    while(true) {
                        ((Student) user).handleActions();
                        int choice = session.inputScanner.nextInt();
                        Course[] courses = session.getCourseList();
                        int i;
                        if (choice == 1) {
                            for(i=0;i< courses.length;i++){
                                System.out.print((i+1)+". "+courses[i].getCourseName()+"."+courses[i].getSection()+"  ");
                            }
                            System.out.println("\nPress 0 to go Back");
                            System.out.print("Index of Course to be added :>");
                            int courseIndex = session.inputScanner.nextInt();
                            if(courseIndex==0){
                                return;
                            }
                            else{
                                addCourse(((Student)user),courses[courseIndex]);
                            }


                        } else if (choice == 2) {
                            viewCourse(user);
                        }
                    }
                }
                else if(user instanceof Teacher){
                    ((Teacher)user).handleActions();
                }
                else if(user instanceof Assistant){
                    ((Assistant)user).handleActions();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            break;
        }
    }
    public static User login(String email,String password)throws Exception{
        Session session = Session.getSession();
        User[] user =session.getUserList();
        int i;
        boolean flag = false;
        for(i=0;i<7;i++){
            if(user[i].getEmail().equals(email) && user[i].getPassword().equals(password)){
                flag =true;
                break;
            }
        }
        if(flag){
            return user[i];
        }
        else{
            throw new Exception("User not Found");
        }

    }
    public static void addCourse(Student student,Course course){
        System.out.println(course.getCourseName());

    }
    public static void removeCourse(Student student,Course course){

    }
    public static void viewCourse(User user){
        if(user instanceof Student){
            ((Student)user).viewCourse();
        } else if (user instanceof Teacher) {
            ((Teacher)user).viewCourse();
        }
        else if (user instanceof Assistant) {
            ((Assistant)user).viewCourse();
        }
    }
}
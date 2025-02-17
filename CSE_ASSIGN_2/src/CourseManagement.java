public class CourseManagement {
    public static void main(String[] args) {
        while(true) {
            Session session = Session.getSession();
            System.out.print("Enter Your Email    : ");
            String email = session.inputScanner.next();
            System.out.print("Enter Your Password : ");
            String password = session.inputScanner.next();
            try {
                User user = login(email,password);
                if(user instanceof Student){
                    ((Student) user).handleActions();
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
        }
    }
    // Login Method for everyone...
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
    // Add course method for students-->>
    public static void addCourse(Student student,Course course){
        Student.addCourse(student,course);
    }
    // View Course Method For ALL USERS-->>
    public static void viewCourse(User user){
        if(user instanceof Student){
            Session session = Session.getSession();
            while(true) {
                ((Student) user).viewCourse(user);
                switch (user.getName()) {
                    case "A" -> {
                        Course[] courses1 = Student.courseListForStudent1;
                        int isEmpty = Student.checkNUll(Student.courseListForStudent1);
                        if (selectCourseToBeRemoved((Student) user, session, courses1, isEmpty)) return;
                    }
                    case "B" -> {
                        Course[] courses2 = Student.courseListForStudent2;
                        int isEmpty = Student.checkNUll(Student.courseListForStudent2);
                        if (selectCourseToBeRemoved((Student) user, session, courses2, isEmpty)) return;
                    }
                    case "C" -> {
                        Course[] courses3 = Student.courseListForStudent3;
                        int isEmpty = Student.checkNUll(Student.courseListForStudent3);
                        if (selectCourseToBeRemoved((Student) user, session, courses3, isEmpty)) return;
                    }
                }
            }
        } else if (user instanceof Teacher) {
            ((Teacher)user).viewCourse(user);
        } else if (user instanceof Assistant) {
            ((Assistant)user).viewCourse(user);
        }
    }
    private static boolean selectCourseToBeRemoved(Student user, Session session, Course[] courses, int isEmpty) {
        if (isEmpty == 0) {
            System.out.println("No Courses To Show\n1: BACK");
            int choice = session.inputScanner.nextInt();
            if (choice == 1) {
                return true;
            } else {
                System.out.println("Wrong input !!!Please Try Again");
            }
        } else {
            System.out.println("\n1: Remove Course  2: Back");
            int choice2 = session.inputScanner.nextInt();
            if (choice2 == 1) {
                System.out.println("Course Index to be Removed : ");
                int courseIndex = session.inputScanner.nextInt();
                removeCourse(user, courses[courseIndex-1]);
            }
            else if(choice2==2){
                return true;
            }
        }
        return false;
    }

    // Remove course method for students-->>
    public static void removeCourse(Student student,Course course){
        Student.removeCourse(student,course);
    }
}
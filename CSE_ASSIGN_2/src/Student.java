

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
//    public Course[] getCourseListForStudent1(){
//        return courseListForStudent1;
//    }

    @Override
    public void handleActions() {
        System.out.println("1: ADD COURSE   2: VIEW COURSE  3:BACK");
    }
    @Override
    public void viewCourse(User user) {
        switch (user.getName()) {
            case "A" -> showingEnrolledCourses(courseListForStudent1, user);
            case "B" -> showingEnrolledCourses(courseListForStudent2, user);
            case "C" -> showingEnrolledCourses(courseListForStudent3, user);
        }

    }
    // For printing the Student's enrolled courses-->>
    private void showingEnrolledCourses(Course[] courseListForStudent1,User user) {
        int i;
        Session session = Session.getSession();
        while(true) {
            int isEmpty = checkNUll(courseListForStudent1);
            if (isEmpty == 0) {
                System.out.println("No Courses To Show\n1: BACK");
                int choice = session.inputScanner.nextInt();
                if(choice == 1){
                    return;
                }
                else{
                    System.out.println("Wrong input !!!Please Try Again");
                    //continue;
                }
            } else {

                for (i = 0; i < courseListForStudent1.length; i++) {
                    if (courseListForStudent1[i] != null) {
                        System.out.println((i) + ". Course Name : " + courseListForStudent1[i].getCourseName() + "." + courseListForStudent1[i].getSection());
                    }
                }
                System.out.println("\n1: Remove Course  2: Back");
                int choice2 = session.inputScanner.nextInt();
                if (choice2 == 1) {
                    System.out.println("Course Index to be Removed : ");
                    int courseIndex = session.inputScanner.nextInt();
                    removeCourse((Student) user, courseListForStudent1[courseIndex]);

                } else {
                    return;
                }
            }
        }
    }
   // checking the array of courses if it is empty or not
    private int checkNUll(Course[] courses){
        int i,flag=0;
        for(i=0;i<courses.length;i++){
            if(courses[i]!=null){
                flag=1;
                return flag;

            }
        }
        return flag;
    }


    // Add Course Method
    public static void addCourse(Student student, Course course) {
        int i;
        switch (student.getName()) {
            case "A" -> {
                for (i = 0; i < courseListForStudent1.length; i++) {
                    if (courseListForStudent1[i] == null) {
                        courseListForStudent1[i] = course;
                        break;
                    }
                }
                System.out.println("Successfully Enrolled  " + courseListForStudent1[i].getCourseName() + "." + courseListForStudent1[i].getSection());
            }
            case "B" -> {
                for (i = 0; i < courseListForStudent2.length; i++) {
                    if (courseListForStudent2[i] == null) {
                        courseListForStudent2[i] = course;
                        break;
                    }
                }
                System.out.println("Successfully Enrolled  " + courseListForStudent2[i].getCourseName() + "." + courseListForStudent2[i].getSection());
            }
            case "C" -> {
                for (i = 0; i < courseListForStudent3.length; i++) {
                    if (courseListForStudent3[i] == null) {
                        courseListForStudent3[i] = course;
                        break;
                    }
                }
                System.out.println("Successfully Enrolled  " + courseListForStudent3[i].getCourseName() + "." + courseListForStudent3[i].getSection());
            }
        }

    }

    // Method for removing a Course from a student's enrolled courseList-->>
    public static void removeCourse(Student student,Course course){
        int i;
        switch (student.getName()) {
            case "A" -> {
                for (i = 0; i < courseListForStudent1.length; i++) {
                    if (courseListForStudent1[i] == course) {
                        System.out.println(courseListForStudent1[i].getCourseName() + "." + courseListForStudent1[i].getSection() + " is removed successfully");
                        courseListForStudent1[i] = null;
                        break;
                    }
                }
            }
            case "B" -> {
                for (i = 0; i < courseListForStudent2.length; i++) {
                    if (courseListForStudent2[i] == course) {
                        System.out.println(courseListForStudent2[i].getCourseName() + "." + courseListForStudent2[i].getSection() + " is removed successfully");
                        courseListForStudent2[i] = null;
                        break;
                    }
                }
            }
            case "C" -> {
                for (i = 0; i < courseListForStudent3.length; i++) {
                    if (courseListForStudent3[i] == course) {
                        System.out.println(courseListForStudent3[i].getCourseName() + "." + courseListForStudent3[i].getSection() + " is removed successfully");
                        courseListForStudent3[i] = null;
                        break;
                    }
                }
            }
        }

    }
}

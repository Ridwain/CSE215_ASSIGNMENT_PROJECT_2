public class Student extends User implements Action {
    //static String[][] student1CourseData = new String[3][4];
    private static Course[] courseListForStudent1 = new Course[5];
    public static Course[] courseListForStudent2 = new Course[5];
    public static Course[] courseListForStudent3 = new Course[5];
    CourseManagement manager;
    public Student(String email, String password, String id, String name, String studentCgpa) {
        this.setEmail(email);
        this.setPassword(password);
        this.setId(id);
        this.setName(name);
        this.setStudentCGPA(studentCgpa);
    }
    public static Course[] getCourseListForStudent1(){
        return courseListForStudent1;
    }
    public static Course[] getCourseListForStudent2(){
        return courseListForStudent2;
    }
    public static Course[] getCourseListForStudent3(){
        return courseListForStudent3;
    }

    @Override
    public void handleActions() {
        while (true) {
            System.out.println("1: ADD COURSE   2: VIEW COURSE  3:BACK");
            Session session = Session.getSession();
            int choice = session.inputScanner.nextInt();
            Course[] courses = session.getCourseList();
            int i;
            if (choice == 1) {
                for (i = 0; i < courses.length; i++) {
                    System.out.print((i + 1) + ". " + courses[i].getCourseName() + "." + courses[i].getSection() + "  ");
                }
                System.out.println("\nPress 0 to go Back");
                System.out.print("Index of Course to be added :>");
                int courseIndex = session.inputScanner.nextInt();
                if (courseIndex == 0) {
                    continue;
                } else {
                    manager.addCourse(this, courses[courseIndex - 1]);
                }
            } else if (choice == 2) {
                manager.viewCourse(this);
            } else if (choice == 3) {
                break;
            }
        }
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
        for (i = 0; i < courseListForStudent1.length; i++) {
            if (courseListForStudent1[i] != null) {
                System.out.println((i+1) + ". Course Name : " + courseListForStudent1[i].getCourseName() + "." + courseListForStudent1[i].getSection());
            }
        }
    }

   // checking the array of courses if it is empty or not
    public static int checkNUll(Course[] courses){
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
        switch (student.getName()) {
            case "A" -> {
                checkingForDuplicateCourseAndTimeClashing(student,course, courseListForStudent1);
                Course.addStudent(student);
            }
            case "B" -> {
                checkingForDuplicateCourseAndTimeClashing(student,course, courseListForStudent2);
                Course.addStudent(student);
            }
            case "C" -> {
                checkingForDuplicateCourseAndTimeClashing(student,course, courseListForStudent3);
                Course.addStudent(student);
            }
        }
    }

    private static void checkingForDuplicateCourseAndTimeClashing(Student student,Course course, Course[] courseListForStudent) {
        int i;
        int flag = checkAlreadyExist(courseListForStudent,course);
        if(flag==1){
            System.out.println("Sorry!! This Course Is Already Taken Or The Time Is Clashing With Other Courses");
            return;
        }
        else {
            for (i = 0; i < courseListForStudent.length; i++) {
                if (courseListForStudent[i] == null) {
                    courseListForStudent[i] = course;
                    break;
                }
            }

            System.out.println("Successfully Enrolled  " + courseListForStudent[i].getCourseName() + "." + courseListForStudent[i].getSection());
        }
    }

    public static int checkAlreadyExist(Course[] courseListForStudent,Course course){
        int flag=0;
        for(int i=0;i<courseListForStudent.length;i++){
            if(courseListForStudent[i]!=null) {
                if (courseListForStudent[i].getTiming().equals(course.getTiming()) || courseListForStudent[i].getCourseName().equals(course.getCourseName())) {
                    flag=1;
                    return flag;
                }
            }
        }
        return flag;
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

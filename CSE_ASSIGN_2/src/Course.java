public class Course {
    private String index;
    private String courseName;
    private String section;
    private String timing;
    private String teacher;
    private String tA;
    static String[] studentsCourseA1 = new String[5]; //students in course A.1
    static String[] studentsCourseA2 = new String[5]; //students in course A.2
    static String[] studentsCourseA3 = new String[5]; //students in course A.3
    static String[] studentsCourseB1 = new String[5]; //students in course B.1
    static String[] studentsCourseC1 = new String[5]; //students in course C.1
    static String[] studentsCourseC2 = new String[5]; //students in course C.2
    public Course(){

    }
    public Course(String index,String courseName,String section,String timing,String teacher,String tA){
        this.index = index;
        this.courseName =courseName;
        this.section = section;
        this.timing = timing;
        this.teacher = teacher;
        this.tA = tA;
    }
    public String getSection() {
        return section;
    }

    public String getTiming() {
        return timing;
    }

    public String getTeacher() {
        return teacher;
    }



    public String getCourseName() {
        return courseName;
    }


    public String getTA() {
        return tA;
    }

    public static void addStudent(Student student){
        switch (student.getName()) {
            case "A" -> addStudentForStudent(student, Student.courseListForStudent1);
            case "B" -> addStudentForStudent(student, Student.courseListForStudent2);
            case "C" -> addStudentForStudent(student, Student.courseListForStudent3);
        }
    }
    public static void addStudentForStudent(Student student,Course[] course) {
        for(int i=0;i<course.length;i++){
            if(course[i]!=null) {
                if (course[i].getSection().equals("1") && course[i].getCourseName().equals("Course A")) {
                    add1(student, studentsCourseA1);
                    continue;
                } else if (course[i].getSection().equals("2") && course[i].getCourseName().equals("Course A")) {
                    add1(student, studentsCourseA2);
                } else if (course[i].getSection().equals("3") && course[i].getCourseName().equals("Course A")) {
                    add1(student, studentsCourseA3);
                } else if (course[i].getSection().equals("1") && course[i].getCourseName().equals("Course B")) {
                    add1(student, studentsCourseB1);
                } else if (course[i].getSection().equals("1") && course[i].getCourseName().equals("Course C")) {
                    add1(student, studentsCourseC1);
                } else if (course[i].getSection().equals("2") && course[i].getCourseName().equals("Course C")) {
                    add1(student, studentsCourseC2);
                }
            }

        }

    }

    private static void add1(Student student, String[] studentsCourse) {
        int flag = checkStudent(studentsCourse,student.getName());
        if(flag==0) {
            for (int j = 0; j < studentsCourse.length; j++) {
                if (studentsCourse[j] == null) {
                    studentsCourse[j] = student.getName();
                    break;
                } else {
                    continue;
                }
            }
        }
        else{
            return;
        }
    }

    public static int checkStudent(String[] studentsCourse,String student){
        int i,flag=0;
        for(i=0;i<studentsCourse.length;i++){
            if(studentsCourse[i]==student){
                flag=1;
                break;
            }
        }
        return flag;
    }


    public static void sendingStudentToRemove(String[] courseList,Student student){
        for(int i=0;i<courseList.length;i++){
            if(courseList[i]!=null) {
                if (courseList[i].equals(student.getName())) {
                    courseList[i] = null;
                    removeStudent(student);
                    return;
                }
            }
        }
    }
    public static void removeStudent(Student student){
        System.out.print("Student "+student.getName()+" Successfully Removed From The Course");
    }
    public static void removeCourseForTeacher(Student student,Course course){
        int i;
        switch (student.getName()) {
            case "A" -> {
                for (i = 0; i < Student.courseListForStudent1.length; i++) {
                    if (Student.courseListForStudent1[i] == course) {
                        Student.courseListForStudent1[i] = null;
                        break;
                    }
                }
            }
            case "B" -> {
                for (i = 0; i < Student.courseListForStudent2.length; i++) {
                    if (Student.courseListForStudent2[i] == course) {
                        //System.out.println(courseListForStudent2[i].getCourseName() + "." + courseListForStudent2[i].getSection() + " is removed successfully");
                        Student.courseListForStudent2[i] = null;
                        break;
                    }
                }
            }
            case "C" -> {
                for (i = 0; i < Student.courseListForStudent3.length; i++) {
                    if (Student.courseListForStudent3[i] == course) {
                        //System.out.println(courseListForStudent3[i].getCourseName() + "." + courseListForStudent3[i].getSection() + " is removed successfully");
                        Student.courseListForStudent3[i] = null;
                        break;
                    }
                }
            }
        }

    }
    public static void viewStudentList(Course course) {
        int i;
            if (course.getCourseName().equals("Course A") && course.getSection().equals("1")) {
                int flag;
                flag = checkNullForStudentList(studentsCourseA1);
                if(flag==1) {
                    for (i = 0; i < studentsCourseA1.length; i++) {
                        if (studentsCourseA1[i] != null) {
                            System.out.println(i + ". Student " + studentsCourseA1[i]);
                        }
                    }
                }
                else{
                    System.out.println("No Student");
                }
            } else if (course.getCourseName().equals("Course A") && course.getSection().equals("2")) {
                printingStudentList(studentsCourseA2);
            } else if (course.getCourseName().equals("Course A") && course.getSection().equals("3")) {
                int flag;
                flag = checkNullForStudentList(studentsCourseA3);
                if(flag==1) {
                    for (i = 0; i < studentsCourseA3.length; i++) {
                        if (studentsCourseA3[i] != null) {
                            System.out.println(i + ". Student " + studentsCourseA3[i]);
                        }
                    }
                }
                else{
                    System.out.println("No Students To Show");
                }
            } else if (course.getCourseName().equals("Course B") && course.getSection().equals("1")) {
                printingStudentList(studentsCourseB1);
            } else if (course.getCourseName().equals("Course C") && course.getSection().equals("1")) {
                printingStudentList(studentsCourseC1);
            } else if (course.getCourseName().equals("Course C") && course.getSection().equals("2")) {
                printingStudentList(studentsCourseC2);
            }
    }
    private static void printingStudentList(String[] studentsCourseA2) {
        int i;
        int flag;
        flag = checkNullForStudentList(studentsCourseA2);
        if(flag==1) {
            for (i = 0; i < studentsCourseA2.length; i++) {
                if (studentsCourseA2[i] != null) {
                    System.out.println(i + ". Student " + studentsCourseA2[i]);
                }
            }
        }
        else {
            System.out.println("No Student To Show");
        }
    }

    public static  int checkNullForStudentList(String[] studentsCourse){
        int flag=0;
        for(int i=0;i<studentsCourse.length;i++){
            if(studentsCourse[i]!=null){
                flag=1;
                return flag;
            }
        }
        return flag;
    }
}



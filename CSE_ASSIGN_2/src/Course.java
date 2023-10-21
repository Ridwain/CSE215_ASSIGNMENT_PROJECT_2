import java.util.ArrayList;

public class Course {
    private String index;
    private String courseName;
    private String section;
    private String timing;
    private String teacher;
    private String tA;
    static String[] studentsCourseA1 = new String[5];
    static String[] studentsCourseA2 = new String[5];
    static String[] studentsCourseA3 = new String[5];
    static String[] studentsCourseB1 = new String[5];
    static String[] studentsCourseC1 = new String[5];
    static String[] studentsCourseC2 = new String[5];
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

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTA() {
        return tA;
    }

    public void setTA(String tA) {
        this.tA = tA;
    }
    public static void addStudentForStudent(Student student,Course[] course) {
        for(int i=0;i<course.length;i++){
            if(course[i]!=null) {
                if (course[i].getSection().equals("1") && course[i].getCourseName().equals("Course A")) {
                    int flag = checkStudent(studentsCourseA1,student.getName());
                    if(flag==0) {
                        for (int j = 0; j < studentsCourseA1.length; j++) {
                            if (studentsCourseA1[j] == null) {
                                studentsCourseA1[j] = student.getName();
                                break;
                            } else {
                                continue;
                            }
                        }
                    }
                    else{
                        continue;
                    }
                } else if (course[i].getSection().equals("2") && course[i].getCourseName().equals("Course A")) {
                    int flag = checkStudent(studentsCourseA2,student.getName());
                    if(flag==0) {
                        for (int j = 0; j < studentsCourseA2.length; j++) {
                            if (studentsCourseA2[j] == null) {
                                studentsCourseA2[j] = student.getName();
                                break;
                            } else {
                                continue;
                            }
                        }
                    }
                    else{
                        continue;
                    }
                } else if (course[i].getSection().equals("3") && course[i].getCourseName().equals("Course A")) {
                    int flag = checkStudent(studentsCourseA3,student.getName());
                    if(flag==0) {
                        for (int j = 0; j < studentsCourseA3.length; j++) {
                            if (studentsCourseA3[j] == null) {
                                studentsCourseA3[j] = student.getName();
                                break;
                            } else {
                                continue;
                            }
                        }
                    }
                    else{
                        continue;

                    }
                } else if (course[i].getSection().equals("1") && course[i].getCourseName().equals("Course B")) {
                    int flag = checkStudent(studentsCourseB1,student.getName());
                    if(flag==0) {
                        for (int j = 0; j < studentsCourseB1.length; j++) {
                            if (studentsCourseB1[j] == null) {
                                studentsCourseB1[j] = student.getName();
                                break;
                            } else {
                                continue;
                            }
                        }
                    }
                    else {
                        continue;
                    }
                } else if (course[i].getSection().equals("1") && course[i].getCourseName().equals("Course C")) {
                    int flag = checkStudent(studentsCourseC1,student.getName());
                    if(flag==0) {
                        for (int j = 0; j < studentsCourseC1.length; j++) {
                            if (studentsCourseC1[j] == null) {
                                studentsCourseC1[j] = student.getName();
                                break;
                            } else {
                                continue;
                            }
                        }
                    }
                    else{
                        continue;
                    }
                } else if (course[i].getSection().equals("2") && course[i].getCourseName().equals("Course C")) {
                    int flag = checkStudent(studentsCourseC2,student.getName());
                    if(flag==0) {
                        for (int j = 0; j < studentsCourseC2.length; j++) {
                            if (studentsCourseC2[j] == null) {
                                studentsCourseC2[j] = student.getName();
                                break;
                            } else {
                                continue;
                            }
                        }
                    }
                    else{
                        continue;
                    }
                }
            }

        }

    }
    public static void addStudent(Student student){
        Session session = Session.getSession();
        if(student.getName().equals("A")){
            addStudentForStudent(student,student.getCourseListForStudent1());
        }
        else if(student.getName().equals("B")){
            addStudentForStudent(student,student.getCourseListForStudent2());
        }
        else if(student.getName().equals("C")) {
            addStudentForStudent(student,student.getCourseListForStudent3());
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
    public static void removeStudent(Student student){
        int i;
        for(i=0;i<studentsCourseA1.length;i++){
            if(studentsCourseA1[i]!=null) {
                if (studentsCourseA1[i].equals(student.getName())) {
                    System.out.println("Student "+studentsCourseA1[i]+" Successfully Removed From The Course A.1");
                    studentsCourseA1[i] = null;
                    break;
                }
            }
        }
        for(i=0;i<studentsCourseA2.length;i++){
            if(studentsCourseA2[i]!=null) {
                if (studentsCourseA2[i].equals(student.getName())) {
                    System.out.println("Student "+studentsCourseA2[i]+" Successfully Removed From The Course A.2");
                    studentsCourseA2[i] = null;
                    break;
                }
            }
        }
        for(i=0;i<studentsCourseA3.length;i++){
            if(studentsCourseA3[i]!=null) {
                if (studentsCourseA3[i].equals(student.getName())) {
                    System.out.println("Student "+studentsCourseA3[i]+" Successfully Removed From The Course A.3");
                    studentsCourseA3[i] = null;
                    break;
                }
            }
        }
        for(i=0;i<studentsCourseB1.length;i++){
            if(studentsCourseB1[i]!=null) {
                if (studentsCourseB1[i].equals(student.getName())) {
                    System.out.println("Student "+studentsCourseB1[i]+" Successfully Removed From The Course B.1");
                    studentsCourseB1[i] = null;
                    break;
                }
            }
        }
        for(i=0;i<studentsCourseC1.length;i++){
            if(studentsCourseC1[i]!=null) {
                if (studentsCourseC1[i].equals(student.getName())) {
                    System.out.println("Student "+studentsCourseC1[i]+" Successfully Removed From The Course C.1");
                    studentsCourseC1[i] = null;
                    break;
                }
            }
        }
        for(i=0;i<studentsCourseC2.length;i++){
            if(studentsCourseC2[i]!=null) {
                if (studentsCourseC2[i].equals(student.getName())) {
                    System.out.println("Student "+studentsCourseC1[i]+" Successfully Removed From The Course C.2");
                    studentsCourseC2[i] = null;
                    break;
                }
            }
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
    public static void viewStudentList(Course course) {
        int i;
            if (course.getCourseName().equals("Course A") && course.getSection().equals("1")) {
                int flag=0;
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
                int flag=0;
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
            } else if (course.getCourseName().equals("Course A") && course.getSection().equals("3")) {
                int flag=0;
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
                int flag=0;
                flag = checkNullForStudentList(studentsCourseB1);
                if(flag==1) {
                    for (i = 0; i < studentsCourseB1.length; i++) {
                        if (studentsCourseB1[i] != null) {
                            System.out.println(i + ". Student " + studentsCourseB1[i]);
                        }
                    }
                }
                else{
                    System.out.println("No Student To Show");
                }
            } else if (course.getCourseName().equals("Course C") && course.getSection().equals("1")) {
                int flag=0;
                flag = checkNullForStudentList(studentsCourseC1);
                if(flag==1) {
                    for (i = 0; i < studentsCourseC1.length; i++) {
                        if (studentsCourseC1[i] != null) {
                            System.out.println(i + ". Student " + studentsCourseC1[i]);
                        }
                    }
                }
                else{
                    System.out.println("No Student To Show");
                }
            } else if (course.getCourseName().equals("Course C") && course.getSection().equals("2")) {
                int flag=0;
                flag = checkNullForStudentList(studentsCourseC2);
                if(flag==1) {
                    for (i = 0; i < studentsCourseC2.length; i++) {
                        if (studentsCourseC2[i] != null) {
                            System.out.println(i + ". Student " + studentsCourseC2[i]);
                        }
                    }
                } else {
                    System.out.println("No Student To Show");
                }
            }


    }
    public static void sendingStudentToRemove(String[] courseList){
        Session session = Session.getSession();
        User[] users = session.getUserList();
        System.out.println("1. Remove Course  2. Back");
        System.out.print("Enter Your Choice :> ");
        int select = session.inputScanner.nextInt();
        if(select==1) {
            System.out.print("Index to be removed : ");
            int choice = session.inputScanner.nextInt();
            if (courseList[choice] != null) {
                if (courseList[choice].equals("A")) {
                    removeStudent((Student) users[0]);
                } else if (courseList[choice].equals("B")) {
                    removeStudent((Student) users[1]);
                } else if (courseList[choice].equals("C")) {
                    removeStudent((Student) users[2]);
                }
            } else {
                return;
            }
        } else if(select == 2){
            return;
        }
    }
}



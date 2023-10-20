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
    public static void addStudent(Student student){
        Session session =Session.getSession();
        Course[] course = Student.getCourseListForStudent1();

        //int j=0,k=0,l=0,m=0,n=0,p=0;
        for(int i=0;i<course.length;i++){
            if(course[i]!=null) {
                if (course[i].getSection().equals("1") && course[i].getCourseName().equals("Course A")) {
                    int flag = checkStudent(studentsCourseA1,student.getName());
                    if(flag==0) {
                        for (int j = 0; j < studentsCourseA1.length; j++) {
                            if (studentsCourseA1[j] == null) {
                                System.out.println("ok");
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
    public static int checkStudent(String[] studentsCourse,String student){
        int i,flag=0;
        System.out.println(student);
        for(i=0;i<studentsCourse.length;i++){
            if(studentsCourse[i]==student){
                flag=1;
                break;
            }
        }
        return flag;

    }

    public void removeStudent(Student student){

    }
    public static void viewStudentList(Course course){

        int i;
        if(course.getCourseName().equals("Course A") && course.getSection().equals("1")) {
            for (i = 0; i < studentsCourseA1.length; i++) {
                if (studentsCourseA1[i] != null) {
                    System.out.println(i + ". " + studentsCourseA1[i]);
                }
            }
        }
        else if(course.getCourseName().equals("Course A") && course.getSection().equals("2")){
            for (i = 0; i < studentsCourseA2.length; i++) {
                if (studentsCourseA2[i] != null) {
                    System.out.println(i + ". " + studentsCourseA2[i]);
                }
            }
        }
        else if(course.getCourseName().equals("Course A") && course.getSection().equals("3")){
            for (i = 0; i < studentsCourseA3.length; i++) {
                if (studentsCourseA3[i] != null) {
                    System.out.println(i + ". " + studentsCourseA3[i]);
                }
            }
        }
        else if(course.getCourseName().equals("Course B") && course.getSection().equals("1")){
            System.out.println("ok");
            for (i = 0; i < studentsCourseB1.length; i++) {
                if (studentsCourseB1[i] != null) {
                    System.out.println(i + ". " + studentsCourseB1[i]);
                }
            }
        }
        else if(course.getCourseName().equals("Course C") && course.getSection().equals("1")){
            for (i = 0; i < studentsCourseC1.length; i++) {
                if (studentsCourseC1[i] != null) {
                    System.out.println(i + ". " + studentsCourseC1[i]);
                }
            }
        }
        else if(course.getCourseName().equals("Course C") && course.getSection().equals("2")){
            for (i = 0; i < studentsCourseC2.length; i++) {
                if (studentsCourseC2[i] != null) {
                    System.out.println(i + ". " + studentsCourseC2[i]);
                }
            }
        }

    }


}


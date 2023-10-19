import java.util.ArrayList;

public class Course {
    private String index;
    private String courseName;
    private String section;
    private String timing;
    private String teacher;
    private String tA;
    static String[] studentsCourseA1 = new String[5];
    static Student[] studentsCourseA2 = new Student[5];
    static Student[] studentsCourseA3 = new Student[5];
    static Student[] studentsCourseB1 = new Student[5];
    static Student[] studentsCourseC1 = new Student[5];
    static Student[] studentsCourseC2 = new Student[5];


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


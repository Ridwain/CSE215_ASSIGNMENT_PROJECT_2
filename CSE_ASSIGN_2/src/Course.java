public class Course {
    private String index;
    private String courseName;
    private String section;
    private String timing;
    private String teacher;
    private String tA;

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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}


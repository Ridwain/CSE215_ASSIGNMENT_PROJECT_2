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

}


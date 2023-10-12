public class Student extends User implements Action{
    public Student(){

    }
    public Student(String email,String password,String id,String name,String studentCgpa){
        this.setEmail(email);
        this.setPassword(password);
        this.setId(id);
        this.setName(name);
        this.setStudentCGPA(studentCgpa);
    }

    @Override
    public void handleActions() {
        System.out.println("1: ADD COURSE   2: VIEW COURSE  3:BACK");
    }

    @Override
    public void viewCourse() {
        System.out.println("YES BABY");
    }
}

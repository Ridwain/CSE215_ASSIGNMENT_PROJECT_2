public class Student extends User{
    public Student(){

    }
    public Student(String email,String password,String id,String name,String studentCgpa){
        this.setEmail(email);
        this.setPassword(password);
        this.setId(id);
        this.setName(name);
        this.setStudentCGPA(studentCgpa);
    }

}

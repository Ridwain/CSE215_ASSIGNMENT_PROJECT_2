public abstract class User{
    private String email;
    private String password;
    private String Id;
    private String Name;
    private String studentCGPA;
    public User(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStudentCGPA() {
        return studentCGPA;
    }

    public void setStudentCGPA(String studentCGPA) {
        this.studentCGPA = studentCGPA;
    }
    public  abstract void viewCourse(User user);
}

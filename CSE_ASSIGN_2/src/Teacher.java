public class Teacher extends User{
    public Teacher() {

    }
    public Teacher(String email,String password,String id,String name){
        this.setEmail(email);
        this.setPassword(password);
        this.setId(id);
        this.setName(name);
    }
}

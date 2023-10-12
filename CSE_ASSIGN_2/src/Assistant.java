public class Assistant extends User implements Action{
    public Assistant(){

    }
    public Assistant(String email,String password,String id,String name){
        this.setEmail(email);
        this.setPassword(password);
        this.setId(id);
        this.setName(name);
    }

    @Override
    public void handleActions() {
        System.out.println("1: View Courses  2: Log out");
    }
    @Override
    public void viewCourse() {

    }
}

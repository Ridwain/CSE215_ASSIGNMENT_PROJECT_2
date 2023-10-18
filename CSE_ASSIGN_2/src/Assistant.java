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
        Session session = Session.getSession();
        System.out.println("1: View Courses  2: Log out");
        int choice = session.inputScanner.nextInt();
        if(choice == 1){
            CourseManagement.viewCourse(this);
        }
    }
    @Override
    public void viewCourse(User user) {
        Session session = Session.getSession();
        Course[] course = session.getCourseList();
        if(user.getName().equals("A")) {
            int j = 1;
            for (Course value : course) {
                if (value.getTA().equals("A")) {
                    System.out.print((j) + ". " + value.getCourseName() + " ");
                    j++;
                }
            }
        } else if(user.getName().equals("B")){
            int j = 1;
            for (Course value : course) {
                if (value.getTA().equals("B")) {
                    System.out.print((j) + ". " + value.getCourseName() + " ");
                    j++;
                }
            }
        }

    }
}

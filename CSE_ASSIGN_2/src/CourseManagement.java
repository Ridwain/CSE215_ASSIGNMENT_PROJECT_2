public class CourseManagement {
    public static void main(String[] args) {
        while(true) {
            Session session = Session.getSession();

            //User userList[] =session.getUserList();
            Course courseList[] = session.getCourseList();
            System.out.println(courseList[2].getCourseName());
            break;
        }

        //kllll
        //hhu

    }
}
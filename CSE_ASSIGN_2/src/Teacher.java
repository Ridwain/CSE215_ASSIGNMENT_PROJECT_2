public class Teacher extends User implements Action{
    public Teacher() {

    }
    public Teacher(String email,String password,String id,String name){
        this.setEmail(email);
        this.setPassword(password);
        this.setId(id);
        this.setName(name);
    }

    @Override
    public void handleActions() {
        Session session = Session.getSession();
        Course[] courses = session.getCourseList();
        User[] users = session.getUserList();

        while (true) {
            System.out.println("1: View Courses  2: Log out");
            int choice = session.inputScanner.nextInt();
            if (choice == 1) {
                CourseManagement.viewCourse(this);
                if (this.getName().equals("A")) {
                    System.out.println("\nPress 0 to go back");
                    System.out.print("Enter Your Choice : ");
                    int select = session.inputScanner.nextInt();
                    if (select == 1) {
                        Course.viewStudentList(courses[0]);
                        System.out.println("1. Remove Student  2. Back");
                            int choice1= session.inputScanner.nextInt();
                            if(choice1==1){
                                System.out.println("Index to be Removed :");
                                int choice2 = session.inputScanner.nextInt();
                                switch (Course.studentsCourseA1[choice2]) {
                                    case "A" -> {
                                        Course.sendingStudentToRemove(Course.studentsCourseA1, (Student) users[0]);
                                        System.out.println(" A.1");
                                        Course.removeCourse((Student) users[0],courses[0]);
                                    }
                                    case "B" -> {
                                        Course.sendingStudentToRemove(Course.studentsCourseA1, (Student) users[1]);
                                        System.out.println(" A.1");
                                        Course.removeCourse((Student) users[1],courses[0]);
                                    }
                                    case "C" -> {
                                        Course.sendingStudentToRemove(Course.studentsCourseA1, (Student) users[2]);
                                        System.out.println(" A.1");
                                        Course.removeCourse((Student) users[2],courses[0]);
                                    }
                                }
                            }else if(choice1==2){
                                continue;
                            }
                            else{
                                continue;
                            }

                    } else if (select == 2) {
                        Course.viewStudentList(courses[2]);
                        System.out.println("1. Remove Student  2. Back");
                        int choice1= session.inputScanner.nextInt();
                        if(choice1==1){
                            System.out.println("Index to be Removed :");
                            int choice2 = session.inputScanner.nextInt();
                            switch (Course.studentsCourseA3[choice2]) {
                                case "A" -> {
                                    Course.sendingStudentToRemove(Course.studentsCourseA3, (Student) users[0]);
                                    System.out.println(" A.3");
                                    Course.removeCourse((Student) users[0],courses[2]);
                                }
                                case "B" -> {
                                    Course.sendingStudentToRemove(Course.studentsCourseA3, (Student) users[1]);
                                    System.out.println(" A.3");
                                    Course.removeCourse((Student) users[1],courses[2]);
                                }
                                case "C" -> {
                                    Course.sendingStudentToRemove(Course.studentsCourseA3, (Student) users[2]);
                                    System.out.println(" A.3");
                                    Course.removeCourse((Student) users[2],courses[0]);
                                }
                            }
                        }else if(choice1==2){
                            continue;
                        }

                    } else if (select == 3) {
                        Course.viewStudentList(courses[3]);
                        System.out.println("1. Remove Student  2. Back");
                        int choice1= session.inputScanner.nextInt();
                        if(choice1==1){
                            System.out.println("Index to be Removed :");
                            int choice2 = session.inputScanner.nextInt();
                            switch (Course.studentsCourseB1[choice2]) {
                                case "A" -> {
                                    Course.sendingStudentToRemove(Course.studentsCourseB1, (Student) users[0]);
                                    System.out.println(" B.1");
                                    Course.removeCourse((Student) users[0],courses[3]);
                                }
                                case "B" -> {
                                    Course.sendingStudentToRemove(Course.studentsCourseB1, (Student) users[1]);
                                    System.out.println(" B.1");
                                    Course.removeCourse((Student) users[1],courses[3]);
                                }
                                case "C" -> {
                                    Course.sendingStudentToRemove(Course.studentsCourseB1, (Student) users[2]);
                                    System.out.println(" B.1");
                                    Course.removeCourse((Student) users[2],courses[3]);
                                }
                            }
                        }else if(choice1==2){
                            continue;
                        }

                    } else if (select == 4) {
                        Course.viewStudentList(courses[5]);
                        System.out.println("1. Remove Student  2. Back");
                        int choice1= session.inputScanner.nextInt();
                        if(choice1==1){
                            System.out.println("Index to be Removed :");
                            int choice2 = session.inputScanner.nextInt();
                            switch (Course.studentsCourseC2[choice2]) {
                                case "A" -> {
                                    Course.sendingStudentToRemove(Course.studentsCourseC2, (Student) users[0]);
                                    System.out.println(" C.2");
                                    Course.removeCourse((Student) users[0],courses[5]);
                                }
                                case "B" -> {
                                    Course.sendingStudentToRemove(Course.studentsCourseC2, (Student) users[1]);
                                    System.out.println(" C.2");
                                    Course.removeCourse((Student) users[1],courses[5]);
                                }
                                case "C" -> {
                                    Course.sendingStudentToRemove(Course.studentsCourseC2, (Student) users[2]);
                                    System.out.println(" C.2");
                                    Course.removeCourse((Student) users[2],courses[5]);
                                }
                            }
                        }else if(choice1==2){
                            continue;
                        }

                    }
                    else if(select==0){
                        continue;
                    }
                } else if (this.getName().equals("B")) {
                    System.out.println("\nPress 0 to go back");
                    System.out.print("Enter Your Choice : ");
                    int select = session.inputScanner.nextInt();
                    if (select == 1) {
                        Course.viewStudentList(courses[1]);
                        System.out.println("1. Remove Student  2. Back");
                        int choice1= session.inputScanner.nextInt();
                        if(choice1==1){
                            System.out.println("Index to be Removed :");
                            int choice2 = session.inputScanner.nextInt();
                            switch (Course.studentsCourseA2[choice2]) {
                                case "A" -> {
                                    Course.sendingStudentToRemove(Course.studentsCourseA2, (Student) users[0]);
                                    System.out.println(" A.2");
                                    Course.removeCourse((Student) users[0],courses[1]);
                                }
                                case "B" -> {
                                    Course.sendingStudentToRemove(Course.studentsCourseA2, (Student) users[1]);
                                    System.out.println(" A.2");
                                    Course.removeCourse((Student) users[1],courses[1]);
                                }
                                case "C" -> {
                                    Course.sendingStudentToRemove(Course.studentsCourseA2, (Student) users[2]);
                                    System.out.println(" A.2");
                                    Course.removeCourse((Student) users[2],courses[1]);
                                }
                            }
                        }else if(choice1==2){
                            continue;
                        }

                    } else if (select == 2) {
                        Course.viewStudentList(courses[4]);
                        System.out.println("1. Remove Student  2. Back");
                        int choice1= session.inputScanner.nextInt();
                        if(choice1==1){
                            System.out.println("Index to be Removed :");
                            int choice2 = session.inputScanner.nextInt();
                            switch (Course.studentsCourseC1[choice2]) {
                                case "A" -> {
                                    Course.sendingStudentToRemove(Course.studentsCourseC1, (Student) users[0]);
                                    System.out.println(" C.1");
                                    Course.removeCourse((Student) users[0],courses[4]);
                                }
                                case "B" -> {
                                    Course.sendingStudentToRemove(Course.studentsCourseC1, (Student) users[1]);
                                    System.out.println(" C.1");
                                    Course.removeCourse((Student) users[1],courses[4]);
                                }
                                case "C" -> {
                                    Course.sendingStudentToRemove(Course.studentsCourseC1, (Student) users[2]);
                                    System.out.println(" C.1");
                                    Course.removeCourse((Student) users[2],courses[4]);
                                }
                            }
                        }
                        else if(choice1==2){
                            continue;
                        }
                    }
                    else if(select==0){
                        continue;
                    }
                }

            } else if (choice == 2) {
                return;
            }
        }
    }

    @Override
    public void viewCourse(User user) {
        Session session = Session.getSession();
        Course[] course = session.getCourseList();
        if(user.getName().equals("A")) {
            int j = 1;
            for (Course value : course) {
                if (value.getTeacher().equals("T1")) {
                    System.out.print((j) + ". " + value.getCourseName() + "."+value.getSection()+"   ");
                    j++;
                }
            }
        } else if(user.getName().equals("B")){
            int j = 1;
            for (Course value : course) {
                if (value.getTeacher().equals("T2")) {
                    System.out.print((j) + ". " + value.getCourseName() + "."+value.getSection()+"   ");
                    j++;
                }
            }
        }
    }
}

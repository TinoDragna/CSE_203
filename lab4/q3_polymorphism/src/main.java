import java.util.*;

public class main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Vector<Student> studentsList = new Vector<>();

        Student s1 = new CollegeStudent("11", "s1", 100, 80, 0);
        Student s2 = new UniversityStudent("22", "s2", 120, 100, "cook", 5.5);
        Student s3 = new UniversityStudent("13", "s3", 160, 120, "four", 6);
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);

        while (true) {
            showMenu();

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addColledge1(studentsList);
                    break;

                case 2:
                    addUniversity2(studentsList);
                    break;

                case 3:
                    remove3(studentsList);
                    break;

                case 4:
                    print4(studentsList);
                    break;

                case 5:
                    printIsGraduate5(studentsList);
                    break;

                case 6:
                    sortByStudentType6(studentsList);
                    break;

                case 7:
                    sc.nextLine();
                    findByFullName7(studentsList);
                    break;

                case 8:
                    System.out.println("Exit");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add a new college student");
        System.out.println("2. Add a new university student");
        System.out.println("3. Remove a student from the list with the student code entered from the keyboard");
        System.out.println("4. Print student list");
        System.out.println("5. Print the list of students eligible for graduation and indicate the number of eligible students");
        System.out.println("6. Sort the student list ascending by Student type (College, university) and student code");
        System.out.println("7. Find student list by student's full name (Contains).");
        System.out.println("8. Exit");
        System.out.print("Choose option: ");
    }

    public static void addColledge1(Vector<Student> studentsList) {
        System.out.println("ques 1: ");
        Student a = new CollegeStudent("1", "a", 120, 0, 0);
        studentsList.add(a);
    }

    public static void addUniversity2(Vector<Student> studentsList) {
        System.out.println("ques 2: ");
        Student b = new UniversityStudent("2", "b", 120, 0, "tech", 5.5);
        Student c = new UniversityStudent("3", "c", 160, 0, "none", 5.5);
        studentsList.add(b);
        studentsList.add(c);
    }

    public static void remove3(Vector<Student> studentsList) {
        System.out.println("ques 3: ");
        String idRemove = "1";
        studentsList.removeIf(student -> student.getId().equals(idRemove));
    }

    public static void print4(Vector<Student> studentsList) {
        System.out.println("ques 4: ");
        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println("student " + i + ": " + studentsList.get(i));
        }
    }

    public static void printIsGraduate5(Vector<Student> studentsList) {
        System.out.println("ques 5: ");

        studentsList.sort((s1, s2) -> Boolean.compare(s1.canGraduate(), s2.canGraduate()));
        for (Student student : studentsList) {
            System.out.println(student);
        }
        countGraduate(studentsList);
    }

    public static void sortByStudentType6(Vector<Student> studentsList) {
        System.out.println("ques 6: ");
        studentsList.sort((s1, s2) -> s1.compareTo(s2));
        for (Student student : studentsList) {
            System.err.println(student);
        }
    }

    //******* */
    public static void findByFullName7(Vector<Student> studentsList) {
        System.out.println("ques 7: enter fullname of student need to find: ");
        String fullName = sc.nextLine();
        boolean canFind =false;
        for (Student student : studentsList) {
            if (student.getFullName().equalsIgnoreCase(fullName)) { 
                System.out.println(student);
                canFind = true; 
            }
        }
        if(canFind == false){
            System.out.println("not found");
        }
    }

    private static void countGraduate(Vector<Student> studentsList) {
        int numOfCanGraduate = 0;
        int numOfCannotGraduate = 0;
        for (Student student : studentsList) {
            if (!student.canGraduate()) {
                numOfCannotGraduate++;
            } else {
                numOfCanGraduate++;
            }
        }
        System.out.println(" num Of Can't Graduate = " + numOfCannotGraduate+ "\n"
                + "num Of Can Graduate = " + numOfCanGraduate );
    }

}

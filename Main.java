class Student {
    String name;
    int roll_no;
    static String college_name = "GPKS";

    Student(int r, String n) {
        roll_no = r;
        name = n;
    }

    void display() {
        System.out.println(roll_no + " " + name + " " + college_name);
    }
}

public class Main{
    public static void main(String[] args) {

        Student s1 = new Student(1, "ABC");
        Student s2 = new Student(2, "xyz");

        s1.display();
        s2.display();

        Student.college_name = "IIT Delhi";

        System.out.println("College name changed");

        s1.display();
        s2.display();
    }
}
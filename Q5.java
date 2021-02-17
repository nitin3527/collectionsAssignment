import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int id;
    double marks,age;
    String name;
    Student(int id, double marks, double age, String name){
        this.id = id;
        this.marks = marks;
        this.age = age;
        this.name = name;
    }
    public double getMarks() {
        return marks;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Student : " + id + " - " + marks + " - " + age + " - " + name + "\n";
    }
}
public class Q5 {
    public static void main(String[] args) {
        Student s1 = new Student(1,88,19,"nitin");
        Student s3 = new Student(4,88,15,"aadil");
        Student s2 = new Student(2,83.5,16,"harry");
        Student s4 = new Student(6,56.5,17,"yash");

        List<Student> stud = new ArrayList<Student>();
        stud.add(s1);
        stud.add(s2);
        stud.add(s3);
        stud.add(s4);
        Collections.sort(stud, Comparator.comparing(Student::getMarks)
                .thenComparing(Student::getName));
        System.out.println(stud);
        System.out.println("highest salary is: " + stud.get(stud.size()-1).marks);
    }
}

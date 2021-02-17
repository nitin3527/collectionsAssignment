import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

class Employee {
    int id;
    double salary,age;
    String name;
    Employee(int id, double sal, double age, String name){
        this.id = id;
        this.salary = sal;
        this.age = age;
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public String toString() {
        return "Employee : " + id + " - " + salary + " - " + age + " - " + name + "\n";
    }
}
class SortbySal implements Comparator<Employee>
{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return (int) (emp1.salary - emp2.salary);
    }
}
public class Q4 {
    public static void main(String[] args) {
        Employee e2 = new Employee(1,226.23,22.3,"nitin");
        Employee e1 = new Employee(2,4560.23,21.3,"harry");
        Employee e4 = new Employee(3,2966.23,25.45,"robin");
        Employee e3 = new Employee(4,276.23,27.3,"rahul");
        List<Employee> emp = new ArrayList  ();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        Collections.sort(emp, Comparator.comparing(Employee::getSalary));
        System.out.println(emp);
        System.out.println("highest salary is: " + emp.get(emp.size()-1).salary);
    }
}

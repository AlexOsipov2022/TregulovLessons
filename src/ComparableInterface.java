import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee(7, "Goga", 5000);
        Employee e2 = new Employee(3, "Giga", 7000);
        Employee e3 = new Employee(1, "Guga", 11000);
        list.add(e1);
        list.add(e2);
        list.add(e3);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}

class Employee implements Comparable<Employee> {

    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
//        if (this.id == o.id) {
//            return 0;
//        } else if (this.id < o.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
        return this.id - o.id;
    }
}



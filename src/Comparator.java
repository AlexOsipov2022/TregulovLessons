import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {

        List<Employers> list2 = new ArrayList<>();
        Employers e1 = new Employers(7, "Goga", 5000);
        Employers e2 = new Employers(3, "Giga", 7000);
        Employers e3 = new Employers(1, "Guga", 11000);
        list2.add(e1);
        list2.add(e2);
        list2.add(e3);

        System.out.println(list2);
        Collections.sort(list2, new IdComparator());
        System.out.println(list2);
    }
}

    class Employers {
        int id;
        String name;
        int salary;

        public Employers(int id, String name, int salary) {
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
    }

    class IdComparator implements java.util.Comparator<Employers> {
        @Override
        public int compare(Employers emp1, Employers emp2) {
            if (emp1.id == emp2.id) {
                return 0;
            } else if (emp1.id < emp2.id) {
                return -1;
            } else {
                return 1;
            }
        }
    }

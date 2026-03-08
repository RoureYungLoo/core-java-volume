import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Program_4_2 {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("zhangsan", 75000, 1987, 12, 15);
        staff[1] = new Employee("lisi", 35000, 1988, 12, 15);
        staff[2] = new Employee("wangwu", 55000, 1989, 12, 15);

        for (Employee employee : staff) {
            employee.raiseSalary(new Random().nextDouble(0.3));
        }

        for (Employee employee : staff) {
//            System.out.println(employee);
        }

        Employee employee = new Employee();
//        System.out.println(employee);

        Date tmp = staff[2].getHireDayDate();
        System.out.println(tmp);
        /* 破坏封装了 */
        tmp.setTime(System.currentTimeMillis() + 500000000);
        System.out.println(tmp);
        System.out.println(staff[2]);

    }
}


class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    private Date hireDayDate;

    public void raiseSalary(int delta) {
        this.salary += delta;
    }

    public void raiseSalary(double percentage) {
        this.salary *= (1 + percentage);
    }

    public Employee() {
        String name = "123";
        this.name = name;
    }


    public Employee(String name, int salary, int year, int month, int day) {
        this(name, salary, LocalDate.of(year, month, day));
    }

    public Employee(String name, double salary, LocalDate hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
        this.hireDayDate = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public Date getHireDayDate() {
        return hireDayDate;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                ", hireDayDate=" + hireDayDate +
                '}';
    }
}

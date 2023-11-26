import java.time.LocalDate;

public class Employee {
    public double salary;
    public String name;
    public LocalDate hireDate;

    public Employee (double salary, String name, int year, int month, int day) {
        this.salary = salary;
        this.name = name;
        this.hireDate = LocalDate.of(year,month,day);
    }

}

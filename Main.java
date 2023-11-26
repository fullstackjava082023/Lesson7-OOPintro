import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void helloWorld() {
        System.out.println("hello World1");
    }

    public static void main(String[] args) {
        Animal cat = new Animal();
        //System.out.println(cat.color);
        Animal dog = new Animal();
        cat.age = 3;
        cat.color = "grey";
        cat.specie = "cat";
        dog.age = 5;
        dog.color = "brown";
        dog.specie = "dog";


        //System.out.println(dog.specie);
//        System.out.println(cat);
//        System.out.println(dog);
//        System.out.println(dog.color);//brown
//        dog.color = "red";
//        System.out.println(dog.color);//red
        dog.saySomething();
        cat.saySomething();


        Animal animal1 = new Animal();
        System.out.println(animal1.color);

        Animal animal2 = new Animal(5, "blue", "bird");
        System.out.println(animal2.color);

        Person aria = new Person("Aria", "Stark", 12, "Winterfell");
        //rami with all fields
        aria.describe();//prints its fields
/*

        Create class person which will represent person.
        The class should have fields:
        name
        lastName
        age
        address
        The class should have an empty constructor which will put default address “Center of the world”
        The class should have another constructor with all parameters
         and it will initialize all values according to the constructors values and using this keyword
        You should create method describe() which receive no parameters and return nothing but
        it should print the name the last name, age and the address in the beautiful way.
                In the main create instance of such object which will represent you (your age name and address)
        Call describe() method from the instance and it should print the attributes.
*/

        LocalDate today = LocalDate.now();
        System.out.println(today);

        String today2 = "2023-11-26";
        String today3 = "2023:11:26";

        System.out.println(today.lengthOfMonth());
        LocalDate nextDay45 = today.plusDays(45);

        System.out.println(nextDay45.getClass());

/*

        Create Employee class
        Fields:
        Name of employee
        Salary of employee
        Hire day
        Constructor:
// constructor public Employee(String n, double s, int year, int month, int day) {
        Use LocalDate.of(year,month,day)
        In main please create three instance of the employees:
        "Carl Cracker", with salary 75000,  and hiring date 15/12/1987
        "Harry Hacker", with salary 50000, and hiring date  01/10/1989
        "Tony Tester",  with salary 40000, and hiring date 15/03/1990
        Create method raiseSalary(double byPercent) in Employe which will raise the salary by given percent
        In Main raise salary to all Employees by 5%
                Create method in Employee to print its information:
        System.out.println("name=" + <name> + ",salary=" + <salary> + ",hireDay=" + <hireDay>;
        In Main print all Employees info after salary raise
*/






    }
}
import java.time.LocalDate;

public class Person {
    public String name;
    public String lastName;
    public int age;
    public String address;
    public LocalDate birthday;

    public Person() {
        this.address = "Center of the world";
    }


    public void helloWorld() {
        System.out.println("hello World2");
        String otherName = this.name;
    }



    public Person(String name, String lastName, int age, String address) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public void describe() {
        System.out.println("Hi, my name is: " + this.name + " " + this.lastName + " and my age is: " + this.age
        + " and my address is: " + this.address);
    }

}

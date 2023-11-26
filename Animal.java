public class Animal {
    public int age;
    public String color;
    public String specie;

    public Animal() {
        color = "white";
    }

    public Animal(int age, String color, String specie) {
        this.age = age;
        this.color = color;
        this.specie = specie;
    }



    public void saySomething() {
        if (specie.equals("cat")) {
            System.out.println("Miu miu");
        } else {
            System.out.println("I am animal");
        }
    }

}

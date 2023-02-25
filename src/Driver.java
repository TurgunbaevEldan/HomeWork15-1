import Person.Person;

public class Driver extends Person {
    public Driver(String name, int age) {
        super(name, age);
    }

    @Override
    public void working() {
        System.out.println("Везет людей");
    }

    @Override
    public String toString() {
        return "Driver: \n"+
        "Name: " + getName() + "Age: " + getAge();
    }
}

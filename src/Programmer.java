import Person.Person;

public class Programmer extends Person {
    public Programmer(String name, int age) {
        super(name, age);
    }

    @Override
    public void working() {
        System.out.println("Разробатывает приложения ");
    }

    @Override
    public String toString() {
        return "Programmer: \n"+
        "Name: " + getName() + "Age: " + getAge();
    }
}


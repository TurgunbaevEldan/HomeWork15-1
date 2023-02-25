import Person.Person;

public class Builder extends Person {
    public Builder(String name, int age) {
        super(name, age);
    }

    @Override
    public void working() {
        System.out.println("Строит дома ");
    }

    @Override
    public String toString() {
        return "Builder: \n"+
        "Name: " + getName() + "Age: " + getAge();
    }
}

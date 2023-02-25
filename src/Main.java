import Person.Person;

public class Main {
    public static void main(String[] args) {
        //TODO HOME WORK #15.1
//        IntelliJ IDEA дан жаңы проект ачыңыз.
//        src деген пакеттин ичине жаңы person деген пакет ачыңыз.
//        person пакеттин ичине Person, Programmer, Driver, Builder деген класс түзүңүз.
//        Person класстын ичине private final name, private static age деген поля кошуп,
//        working() деген метод түзүңүз.Баардык класстар Person классын мурастасын.
//        Main класстан бирден объектерин түзүп, аргументтерин берип, Person класстын
//        working() методдун override кылып, өзүнө тиешелүү жумуштарын консольго чыгарыңыз
        Person person = new Person("эльдан ", 17);
        System.out.println(person);
        person.working();

        Programmer programmer = new Programmer("кайрат ", 19);
        System.out.println(programmer);
        programmer.working();

        Driver driver = new Driver("айзат ", 19);
        System.out.println(driver);
        driver.working();

        Builder builder = new Builder("Давран ", 17);
        System.out.println(builder);
        builder.working();


    }
}
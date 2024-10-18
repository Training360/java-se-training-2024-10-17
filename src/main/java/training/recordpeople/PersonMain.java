package training.recordpeople;

public class PersonMain {

    public static void main(String[] args) {
        var person = new Person("John Doe", 1980);
        System.out.println(person.name());
    }
}

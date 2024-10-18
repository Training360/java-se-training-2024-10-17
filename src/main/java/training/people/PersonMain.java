package training.people;

import java.util.Scanner;

public class PersonMain {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        var input = scanner.nextLine();
        var name = input;

        System.out.println("Enter your year of birth: ");
        input = scanner.nextLine();
        var yearOfBirth = Integer.parseInt(input);

        var person = new Person(name, yearOfBirth);

        System.out.println(person.getName() + ": " + person.getAge(2024));

        System.out.println(person);
    }
}

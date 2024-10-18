package training.arrays;

import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {
        var numbers = new int[10];
        var names = new String[10];

        for (var name: names) {
            System.out.println(name);
        }

        System.out.println(names.length);

        var friends = new String[]{"John", "Jane"};

        // Best practice: kerüljük!
        System.out.println(friends);

        System.out.println(Arrays.toString(friends));
        Arrays.sort(friends);
        System.out.println(Arrays.toString(friends));

    }
}

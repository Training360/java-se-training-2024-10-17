package training.parameters;

import java.util.Arrays;

public class ParametersMain {

    public static void main(String[] args) {
        new ParametersMain().printNames("Jack", "Jane");
        new ParametersMain().printNames("Jack", "Jane", "Joe");
        new ParametersMain().printNames();
    }

    // varargs
    public void printNames(String... names) {
        System.out.println(Arrays.toString(names));
        System.out.println(names.equals(new String[] { "Jack", "Jane" }));
        System.out.println(Arrays.equals(new String[] { "Jack", "Jane" }, names));
    }
}

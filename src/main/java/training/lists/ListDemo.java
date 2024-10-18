package training.lists;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
        var names = new ArrayList<String>();

        names.add("John");
        System.out.println(names);

        for (var name: names) {
            System.out.println(name);
        }

        var colors= List.of("red", "blue", "green");
        System.out.println(colors.getClass());
        System.out.println(colors);
//        colors.add("cyan"); java.lang.UnsupportedOperationException

        var dogs = new ArrayList<>(List.of("Buksi", "Morzsi"));
        dogs.add("Bubu");
        System.out.println(dogs);

        // Concurrent modification exception
//        for (var dog: dogs) {
//            if (dog.equals("Buksi")) {
//                dogs.remove(dog);
//            }
//        }
//        System.out.println(dogs);

//        var i = dogs.iterator();
//        while (i.hasNext()) {
//            var dog = i.next();
//            if (dog.equals("Bubu")) {
//                i.remove();
//            }
//        }
//        System.out.println(dogs);

//        var toRemove = new ArrayList<String>();
//        for (var dog: dogs) {
//            if (dog.equals("Bubu")) {
//                toRemove.add(dog);
//            }
//        }
//        dogs.removeAll(toRemove);
//        System.out.println(dogs);

//        dogs.removeIf(dog -> dog.equals("Bubu"));
//        System.out.println(dogs);

        System.out.println(
                dogs
                        .stream()
                        .filter(dog -> !dog.equals("Bubu"))
                        .toList()
        );
    }
}

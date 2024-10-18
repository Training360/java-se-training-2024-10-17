package training.enums;

public class EnumDemo {

//    private enum TrafficLight {
//        GREEN, YELLOW, RED
//    }

    public static void main(String[] args) {
        var actual = TrafficLight.GREEN;
        System.out.println(actual);

        System.out.println(actual.ordinal());

        for (var light: TrafficLight.values()) {
            System.out.println(light);
        }

        var parsed = TrafficLight.valueOf("GREEN");
        System.out.println(parsed);
    }
}

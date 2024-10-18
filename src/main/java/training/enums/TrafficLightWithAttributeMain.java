package training.enums;

public class TrafficLightWithAttributeMain {

    public static void main(String[] args) {
        var actual = TrafficLightWithAttribute.RED;
        actual = actual.next();
        System.out.println(actual);
    }
}

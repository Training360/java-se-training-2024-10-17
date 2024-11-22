package training.staticmethods;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {

    private Long id;

    private String name;

    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(String name) {
        this.name = name;
    }

    public static Employee fromLine(String line) {
        String[] parts = line.split(",");
        return new Employee(Long.parseLong(parts[0]), parts[1]);
    }

    public static void main(String[] args) {
        var now = LocalDateTime.now();
        var time = LocalTime.of(10, 20, 30);

        Path path = Path.of("");
    }

}

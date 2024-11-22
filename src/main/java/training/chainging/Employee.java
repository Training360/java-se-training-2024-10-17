package training.chainging;

import lombok.Data;

@Data
public class Employee {

    private Long id;

    private String name;

    public Employee withId(Long id) {
        this.id = id;
        return this;
    }

    public Employee withName(String name) {
        this.name = name;
        return this;
    }

    public static void main(String[] args) {
        Employee employee = new Employee()
                .withId(12L)
                .withName("John Doe");
    }
}

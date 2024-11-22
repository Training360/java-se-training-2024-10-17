package training.inheritance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

    private Long id;

    private String name;

    public Employee(Employee another) {
        id = another.id;
        name = another.name;
    }

    @SneakyThrows
    public static void main(String[] args) {
        var employee = new Employee(1L, "John Doe");
        var employee2 = new Employee(employee);
        System.out.println(employee);
        System.out.println(employee2);

        Object o = new Employee(1L, "Jane");

        Employee employee3 = (Employee) o;

    }
}

package training.chainging;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {

    private String isbn;

    private String title;

    public static void main(String[] args) {
        Book book = Book.builder()
                .isbn("12345")
                .title("Hello Java")
                .build();

//        () -> entityManager.createQuery("select id, name from employees where name like :name and werte")
//                .setParameter(name, "John")
//                .setParameter(werwe, "wewerrwe")
//                .maxResult(10)
//                .page(2)
//                .getResultList();
    }
}

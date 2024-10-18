package training.people;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getAge() {
        assertEquals(44, new Person("John", 1980)
                .getAge(2024));
    }
}
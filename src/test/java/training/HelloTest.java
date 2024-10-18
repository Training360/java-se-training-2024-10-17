package training;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    void sayHello() {
        assertEquals("Hello John",
                new Hello().sayHello("John"));
    }
}
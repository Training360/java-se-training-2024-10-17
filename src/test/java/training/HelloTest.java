package training;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    Hello hello;

    HelloTest() {
        System.out.println("Constructor");
    }

    @BeforeAll
    static void log() {
        System.out.println("log");
    }

    @BeforeEach
    void createHello() {
        System.out.println("createHello");
        hello = new Hello();
    }

    @Test
    void sayHello() {
        // BDD given - when - then
        //String result = hello.sayHello("John");
        //assertEquals("Hello John!", result);

        assertEquals("Hello John",
                hello.sayHello("John"));
    }

    @Test
    void sayHelloToJack() {
        assertEquals("Hello Jack",
                hello.sayHello("Jack"));
    }
}
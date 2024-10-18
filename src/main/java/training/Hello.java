package training;

public class Hello {

    public static void main(String[] args) {
        var hello = new Hello();
        var result = hello.sayHello("Trainer");
        System.out.println(result);
    }


    public String sayHello(String name) {
        return "Hello " + name;
    }
}

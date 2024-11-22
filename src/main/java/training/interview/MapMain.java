package training.interview;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    static {
        System.out.println("ertert");
    }

    {
        System.out.println("Inicializator");
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(){{put("a", "b");}};
    }
}

package training.maths;

import java.math.BigDecimal;

public class MathDemo {

    public static void main(String[] args) {
        var i = Integer.MAX_VALUE;
        System.out.println(i);
//        i++;
//        System.out.println(i);

//        var j = Math.addExact(i, 1);

        var price = BigDecimal.valueOf(10);
        var incremented = price.add(BigDecimal.valueOf(1));
//        BigDecimal.ROUND_CEILING
//        10.0 / 10

        int d = 2 / 3;
        System.out.println(d);
    }
}

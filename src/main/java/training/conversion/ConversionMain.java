package training.conversion;

public class ConversionMain {

    public static void main(String[] args) {
        int i = 5;
        Integer n = 5; // Autoboxing
        int i2 = n; // Autoboxing

        long l = n;
        int i3 = (int) l; // Explicit cast


        Long l2 = (long) 14;

        // NullPointerException
//        Long l3 = null;
//        System.out.println(l3 + 6);

        String s = "4";
        int i4 = Integer.parseInt(s);

        // NumberFormatException
        //int i5 = Integer.parseInt("ertwer");

        int i6 = 6;
        String six = Integer.toString(i6);

        String numbers = //String.format("numbers: %d + %d = %d", 5, 6, 5 + 6);
                "numbers: %d + %d = %d".formatted(5, 6, 5 + 6);

        System.out.println(numbers);

        //Integer n7 = new Integer(17);
                //Integer.valueOf(14);

        Integer i11 = 15;
        Integer i12 = 15;
        System.out.println(i11 == i12);
        System.out.println(i11.equals(i12));

        Integer i13 = 1015;
        Integer i14 = 1015;
        System.out.println(i13 == i14);
        System.out.println(i13.equals(i14));

        System.out.println(i11 + 1 == i12 + 1);

        String s1 = "alma";
        String s2 = "alma";
        System.out.println(s1 == s2);

        String s3 = new String("alma");
        String s4 = new String("alma");
        System.out.println(s3 == s4);

        String s5 = "alm" + ('b' - 1);
        System.out.println("alma" == s5);

    }
}

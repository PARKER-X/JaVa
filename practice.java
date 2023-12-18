public class practice{
    public static void main(String[] args){
        // System.out.println("Hello World!");

        // Primitive Data Types
        // byte = 1 [-128,127]
        // short = 2
        // int = 4
        // long = 8
        // float = 4
        // double = 8
        // char = 2
        // boolean = 1
        byte num1 = 100;
        // byte num2 = 10000;
        int num2 = 10000;
        System.out.println(num1);
        System.out.println(num2);

        // Floats
        // float num3 = 3.14;
        float num3 = 3.14F;
        System.out.println(num3);

        // Long
        // long num4 = 10000000000000;
        long num4 = 10000000000000L;
        System.out.println(num4);

        // Double
        double num5 = 1000000.11;
        System.out.println(num5);
    

    // Non - primitive types
    // String is Immutable
        String name = "Hello";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        String name2 = name.replace('H','T');
        System.out.println(name2);

        String fname = "Tony";
        String lname = "Stark";
        System.out.println(fname + " " + lname);

        // Substring
        String name3 = "Ironman and Tony Stark";
        System.out.println(name3);
        System.out.println(name3.substring(0,5));

    }
}
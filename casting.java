public class casting {
    public static void main(String[] args) {
        // Implicit same type
        double prices = 100.0;
        double finalprices = 10 + prices;

        System.out.println(finalprices);

        // Explict if differ types
        int price = 10;
        // int final_price = 10+1.8;
        int final_price = 10 + (int)1.8;
        System.out.println(final_price);
    }
}

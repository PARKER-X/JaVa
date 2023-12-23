public class error {
    public static void main(String[] args){
        // Try-catch 
        int[] marks = {80,70,100};
        try{
            System.out.println(marks[3]);
        }
        catch(Exception exception) {
            System.out.println("An exception occur! ");
        }


    }
}

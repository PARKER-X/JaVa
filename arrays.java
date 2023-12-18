import java.lang.reflect.Array;
import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {
        // Arrays
        int[] marks = new int[3];
        marks[0] = 99;
        marks[1] = 98;
        marks[2] = 97;

        System.out.println(marks[0]);
        System.out.println(marks.length);

        // Sort
        Arrays.sort(marks);
    }
}

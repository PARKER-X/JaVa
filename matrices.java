import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        // Matrices -3X3
        System.out.println("Matrices 3X3: ");
        int[][] matrices = new int[3][3];
        for (int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                System.out.println("Enter matrices " + i + " row " + j + " col " + " element ");
                Scanner sc = new Scanner(System.in);
                int mat = sc.nextInt();
                matrices[i][j] = mat;
            }
        }
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println(matrices[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
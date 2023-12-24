import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class files {
    public static void main(String[] args) {
        // Creating a file
        File myfile = new File("myfile.txt");
        try{
            myfile.createNewFile();
            System.out.println(" Files Successfully Created! ");
        }
        catch(IOException e){
            System.out.println("Error Occurs!");
        }

        // Write in a file
        try{
        FileWriter filewriter = new FileWriter("myfile.txt");
        filewriter.write("Hello Avengers! I am Ironman!");
        filewriter.close();
        }
        catch (IOException e){
            System.out.println("Error!");
        }
        

        // Read a file
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Deleting a file 
        if (myfile.delete()){
            System.out.println("I have deleted " + myfile.getName());
        }
    }
}

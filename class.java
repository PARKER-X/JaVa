import java.util.Scanner;

class Square{
    // Properties
    int side;

    // Functions
    public void Area(){
        int area = this.side*this.side;
        System.out.println(area);
    }

    public void Perimeter(){
        int preimeter = this.side*4;
        System.out.println(preimeter);
    }

    public static void main(String[] args) {
        System.out.println("Enter the length of sides: ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        Square s1 = new Square();
        s1.side = s;
        s1.Area();
        s1.Perimeter();
    }

}
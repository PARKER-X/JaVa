public class Polymorphism{
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Rectangle R1 = new Rectangle();
        Square S1 = new Square();

        s1.Area();
        S1.Area(10);
        R1.Area(10,12);
    }
}

class Shape{
    public void Area(){
        System.out.println(" Display the Area of Shape! ");
    }
}

class Square extends Shape{
    public void Area(int side){
        System.out.println(4*side);
    }
}

class Rectangle extends Shape{
    public void Area(int length, int breadth){
        System.out.println(length*breadth);
    }
}

public class interfaces {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
    }
}


interface Animal{
    void walk();
    void eat();
}

// interfaces supports multiple inheritance 

class Horse implements Animal{
    public void walk(){
        System.out.println(" Horse run! not walk! ");
    }
    public void eat(){
        System.out.println(" Horse run! not eat! ");
    }
    
}


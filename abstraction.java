class Abstraction{
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
    }
}

abstract class Animal{
    abstract void walk();
    void eat(){
        System.out.println("Animal wants to eat! ");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Horse can walk!");
    }
}


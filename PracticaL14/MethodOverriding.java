//package PracticaL14;

class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting: Dog object is referenced as Animal
        a.sound();

        Dog d = (Dog) a; // Downcasting: Animal reference converted back to Dog
        d.sound();
    }
}
//1
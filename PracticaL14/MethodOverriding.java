class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Animal a = new Dog(); // Upcasting: a Dog object is referenced as an Animal.
        // Dog d = (Dog) a; // Downcasting: the Animal reference is converted back to
        // Dog.
        a.sound();
        // d.sound();
        /// d.sound(); // This will call the Dog's overridden method, not the Animal's
        // method.
    }
}

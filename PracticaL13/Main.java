
class Animal1 {
    String name = "Animal";

    Animal1() {
        System.out.println("Parent constructor called");
    }

    void display() {
        System.out.println("Parent method");
    }
}

class Dog1 extends Animal1 {
    String name = "Dog";

    Dog1() {
        super();
        System.out.println("Child constructor called");
    }

    void display() {
        System.out.println("Child name: " + this.name);
        System.out.println("Parent name: " + super.name);

        this.show();
        super.display();
    }

    void show() {
        System.out.println("Child method");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.display();
    }
}

// package abstraction;

abstract class Animal {
    abstract void sounds();

    abstract void sleep();

}

class Dog extends Animal {
    void sounds() {
        System.err.println("Dog barks...");
    }

    void sleep() {
        System.out.println("Zzz...");
    }
}

class Cat extends Animal {
    void sounds() {
        System.err.println("Cat meows...");
    }

    void sleep() {
        System.out.println("Zzz...");
    }
}

public class Abstration {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sounds();
        dog.sleep();

        Cat cat = new Cat();
        cat.sounds();
        cat.sleep();

    }

}

// package runTImePolymorphism;

class Animal {
    void Sound() {
        System.out.println("Which sounds the animal");
    }
}

class Cat extends Animal {
    void Sound() {
        System.out.println("meows meows...");
    }
}

class Dog extends Animal {
    void Sound() {
        System.out.println("barks barks...");
    }
}

public class RunTImePolymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.Sound(); // By default (Parent method)
        animal = new Cat();// new object for Cat Class
        animal.Sound();

        animal = new Dog();// new object for Dog Class
        animal.Sound();
    }
}

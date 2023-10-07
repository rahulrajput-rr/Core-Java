// package polymorphism;

// Superclass Animal
class Animal {
    void Sounds() {
        System.out.println("Animal makes sounds");
    }
}

// Subclass (Cat)
class Cat extends Animal {
    /*
     * provides a
     * specific implementation
     * for a method of superclass
     */
    @Override
    void Sounds() {
        System.out.println("Cat makes as meows...");
    }
}

// Subclass (Dog)
class Dog extends Animal {

    @Override
    void Sounds() {
        System.out.println("Dog makes as barks...");
    }
}

public class RunTime {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.Sounds();

        Animal cat = new Cat();
        cat.Sounds();
        Animal dog = new Dog();
        dog.Sounds();
    }

}

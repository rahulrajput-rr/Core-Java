abstract class Animal {
    /*
     * Abstract method, Declaration
     * of method, has no body
     */
    protected abstract void Sounds();

    public void sleep() {
        System.out.println("Zzzz");
    }

}

class Cat extends Animal {
    public void Sounds() { // Definition of method
        System.out.println("Cat meows meows...");
    }
}

class Dog extends Animal {
    public void Sounds() { // Definition of method
        System.out.println("Dog barks barks...");
    }
}

public class Main {
    public static void main(String[] args) {

        // Animal obj = new Animal();// Cannot be instantiated object
        Animal animal = new Cat();
        animal.Sounds();
        animal.sleep();

        Cat cat = new Cat();
        cat.Sounds();

        Dog dog = new Dog();
        dog.Sounds();

    }
}
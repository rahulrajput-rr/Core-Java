// package inheritance;

class Animal {
    void Sounds() {
        System.out.println("Animal makes sounds");
    }
}

class Dog extends Animal {
    void Sounds() {
        System.out.println("Dog makes as barks..");
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.Sounds();

        Animal dog = new Dog();
        dog.Sounds();

    }
}

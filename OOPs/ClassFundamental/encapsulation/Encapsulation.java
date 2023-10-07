// package encapsulation;

import java.util.Scanner;

class Animal {
    private String animalName;
    private String animalSound;

    // Animal(String animalName, String animalSound) {
    // this.animalName = animalName;
    // this.animalSound = animalSound;
    // }

    public void setNameAndSound(String animalName, String animalSound) {
        this.animalName = animalName;
        this.animalSound = animalSound;
    }

    public String getNameAndSound() {
        return ("Animal Name: " + animalName + "\tAnimal Sound: " + animalSound);
    }

}

public class Encapsulation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter animal name: ");
        String Name = scanner.nextLine();
        System.out.print("Enter animal sound: ");
        String Sound = scanner.nextLine();

        Animal animal = new Animal();
        // System.out.println("Animal Name: " + Name + "\tAnimal Sound: " + Sound);

        animal.setNameAndSound(Name, Sound);
        System.out.println(animal.getNameAndSound());

        /* OR */

        // String out = animal.getNameAndSound();
        // System.out.println(out);

        scanner.close();

    }

}

/*
 * Either can use constructor or setter/getter methods to initialied the object
 * further more if setter/getter methods used need to create an object
 * 
 */
class Animal {

    private String category;

    // setter for the category
    public void setCategory(String category) {
        this.category = category;
    }

    // getter for the category
    public String getCategory() {
        return this.category;
    }

}

class Retiles extends Animal {
}

public class Main {
    public static void main(String[] args) {

        /* Ways to Initialize an Object */
        // parent to parent
        Animal animal = new Animal();
        animal.setCategory("Retiles Category");
        System.out.println(animal.getCategory());

        // parent to child
        Animal child = new Retiles();
        child.setCategory("Retiles Category...");
        System.out.println(child.getCategory());

        // child to child
        Retiles chReptiles = new Retiles();
        chReptiles.setCategory(null);
        System.out.println(chReptiles.getCategory());
    }
}
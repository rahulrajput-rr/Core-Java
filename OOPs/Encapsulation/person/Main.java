import java.util.Scanner;

class Person {
    private String name;
    private int id;

    // Setter MEthods

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    // Getter Methods

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter Id: ");
        int userId = scanner.nextInt();

        // Set the name and Id using the setter method
        person.setName(userName);
        person.setId(userId);

        // Get the name and Id using the getter method
        userName = person.getName();
        userId = person.getId();

        // print
        System.err.println("Name = " + userName + "\tId =  " + userId);

        scanner.close();

    }
}

// if getter method not defined, it will also give the output
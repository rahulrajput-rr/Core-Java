// package compileTimepolymorphism;

class CompileTimepolymorphism {
    void operator(String str1, String str2) {
        String string = str1 + str2;
        System.out.println("Concatenated String - " + string);
    }

    void operator(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }

    void operator(float num1, int num2) {
        float sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }

    void operator(double num1, int num2) {
        double sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        CompileTimepolymorphism obj = new CompileTimepolymorphism();
        obj.operator(50, 50);
        obj.operator("Hi", "Java");
        obj.operator(50.90f, 50);
        obj.operator(50.90, 50);
    }

}

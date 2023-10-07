// package polymorphism;

class MathOperation {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    double add(double num1, double num2) {
        return num1 + num2;
    }
}

public class CompileTime {
    public static void main(String[] args) {
        MathOperation op = new MathOperation();
        System.out.println(op.add(60, 40));
        System.out.println(op.add(50, 50));
    }
}
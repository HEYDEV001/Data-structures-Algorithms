package bitManipulation.Questions;

public class Swap {
    public static void main(String[] args) {
        swapWithout3rdVariable(1, 2);

    }
    public static void swapWithout3rdVariable(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a+" b = " + b);
    }
}

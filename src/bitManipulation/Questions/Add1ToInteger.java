package bitManipulation.Questions;

public class Add1ToInteger {
    public static void main(String[] args) {
        System.out.println(add1ToInteger(11));
        System.out.println(~10);

    }
    public static int add1ToInteger(int num) {
// If we want to add 1 to number then we can take the -ve of any number compliment
        // because the NOT operator give  ~num = -(num+1)
        return -(~num);
    }
}

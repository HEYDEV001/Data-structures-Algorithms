package bitManipulation.Questions;

public class ConvertUpperToLower {
    public static void main(String[] args) {
convertUpperToLower();
    }
    public static void convertUpperToLower() {
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char)(ch | ' '));
        }

    }
}

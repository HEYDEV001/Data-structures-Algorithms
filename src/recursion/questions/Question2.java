package recursion.questions;

public class Question2 {
    public static void main(String[] args) {
        convertIntoWords(1249);

    }

        static String[] numbers={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        public static void convertIntoWords(int number) {
            if(number==0){
                return;
            }
            int lastDigit = number % 10;
            convertIntoWords(number/10);
            System.out.print(numbers[lastDigit]+" ");
        }

}

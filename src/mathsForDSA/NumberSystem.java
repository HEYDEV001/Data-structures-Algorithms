package mathsForDSA;

public class NumberSystem {
    public static void main(String[] args) {
        convertToDecimal("63", 16);
        decimalToBinary(1,2);
        decimalToAnyNumberSystem(107, 16);

    }

    public static int getDigits(char ch){
        return switch (ch) {
            case 'A' -> 10;
            case 'B' -> 11;
            case 'C' -> 12;
            case 'D' -> 13;
            case 'E' -> 14;
            case 'F' -> 15;
            default -> ch - '0';
        };
    }
    public static void convertToDecimal(String number, int currentBase){
        double result =0 ;
        int pos =0;
        for(int i =number.length()-1; i>=0; i--){
            int digitAtPosition   =getDigits(number.charAt(i));
            if(digitAtPosition >= currentBase){
                System.out.println("Conversion Invalid");
                return;
            }
            result = result + (digitAtPosition * Math.pow(currentBase, pos));
            pos++;
        }
        System.out.println("The decimal number is " + result);
    }

    public static void decimalToBinary(int number, int currentBase){
        StringBuilder result = new StringBuilder();
        while(number>0){
            int remainder = number % currentBase;
            result.append(remainder);
            number = number / currentBase;
        }
        System.out.println("The Binary number is : " + result.reverse());
    }

    public static void decimalToAnyNumberSystem(int number, int currentBase){
        StringBuilder result = new StringBuilder();
        while(number>0){
            int remainder = number % currentBase;
            char remainderString = getRemainderString(remainder);
            result.append(remainderString);
            number = number / currentBase;
        }
        System.out.println("The number is : " + result.reverse());
    }
    private static char getRemainderString(int remainder){
        return switch(remainder){
            case 10 -> 'A';
            case 11 -> 'B';
            case 12 -> 'C';
            case 13 -> 'D';
            case 14 -> 'E';
            case 15 -> 'F';
            default -> (char)(remainder + '0');

        };
    }

}

package mathsForDSA.part_2;

public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmStrong(133));

    }
    public static boolean isArmStrong(int num) {
        int digits = (int)Math.log10(num)+1;
        int newNumber=0;
        int originalNumber = num;
        while(num > 0){
            int lastDigit = num%10;
            newNumber = newNumber + (int)Math.pow(lastDigit,digits);
            num /= 10;
        }
        return (newNumber == originalNumber);
    }
}

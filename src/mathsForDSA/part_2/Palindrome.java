package mathsForDSA.part_2;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1231));
        System.out.println(isPalindrome2("1231"));

    }
    public static boolean isPalindrome(int num) {
        int originalNumber = num ;
        int reversedNumber = 0;
        while (num > 0) {
            reversedNumber  = (reversedNumber *10) + (num%10);
            num = num / 10;
        }
        return originalNumber == reversedNumber;
    }

    public static boolean isPalindrome2(String string){
        int start = 0,  end =string.length()-1;
        while(start < end){
            if(string.charAt(start) != string.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}

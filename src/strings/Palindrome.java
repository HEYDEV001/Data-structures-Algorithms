package strings;

public class Palindrome {
    public static void main(String[] args) {
        String s = "121,2:1:21";
        System.out.println(isPalindrome(s));


    }
    public static Boolean isPalindrome(String str ) {
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        int start = 0, end = str.length() - 1;
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}

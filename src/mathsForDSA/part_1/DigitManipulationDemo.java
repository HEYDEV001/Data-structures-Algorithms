package mathsForDSA.part_1;

public class DigitManipulationDemo {
    public static void main(String[] args) {
        DigitManipulationDemo demo = new DigitManipulationDemo(); // Or we can make the method static
        System.out.println(demo.findNumberOfDigitsByFormula(-120));
        System.out.println(findNumberOfDigits(-120));
        System.out.println(demo.appendDigit(-123, 4));
        System.out.println(demo.appendDigit2(-10,7));
        System.out.println(demo.appendDigitAtFirst(-123, 4));
        System.out.println(reverseNumber(-22343));
    }

    public int findNumberOfDigitsByFormula(int num) { // TC = O(1)
        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            num = -1 * num;
        }
        return (int) Math.log10(num) + 1;
    }

    public static int findNumberOfDigits(int num) { // TC = O()

        if (num == 0) {
            return 1;
        }
        int count = 0;

        if (num < 0) {
            num = -1 * num;
        }
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }


    public int appendDigit(int num , int digit){
        int multipleOf10 = findNumberOfDigitsByFormula(digit);
        if(num<0){
            num = -1 * num;
            int res  =(int)(num * Math.pow(10, multipleOf10)) + digit;
            return -1* res;
        }
        return (int)(num * Math.pow(10, multipleOf10)) + digit;
    }

    public int appendDigit2(int num , int digit){
        if(num<0){
            num = -1 * num;
            int res = (num * 10) + digit;
            return -1 * res;
        }
        return (num * 10) + digit;
    }

    public int appendDigitAtFirst(int num , int digit){
        int multipleOf10 = findNumberOfDigitsByFormula(num);
        if(num<0){
            num = -1 * num;
            int res = (int)(digit*(Math.pow(10, multipleOf10)) + num);
            return -1 * res;
        }
        return (int)(digit*(Math.pow(10, multipleOf10)) + num);

    }

    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num/=10;
        }
        return reverse;
    }

}

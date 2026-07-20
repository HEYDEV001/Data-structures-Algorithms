package bitManipulation.ShashCode;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        swap(2,3);

    }
    public static void swap(int a, int b ){
        a= a ^ b;
        b= a ^ b; // b = (a ^ b) ^ b  : we know that n ^ n = 0, so (a ^ b ^ b) will be equal to a . Hence, b = a
        a= a ^ b; // here we have a = a ^ b (from first step) and b = a (from second step) so in this step we are performing a = a ^ b ^ a => (a = b)
        System.out.println("a = "+a +", "+"b = "+ b);
    }
}

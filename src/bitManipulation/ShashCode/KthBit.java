package bitManipulation.ShashCode;

public class KthBit {
    public static void main(String[] args) {
        System.out.println(isSet(10,2));
        System.out.println(setKthBit(10,2));
        System.out.println(unsetKthBit(10,3));
        System.out.println(flipOrToggleKthBit(10,2));

    }
    public static boolean isSet(int n, int k) {
        return ((n & (1<<k))!=0);
    }

    public static int setKthBit(int n , int k ){
        return n | (1<<k);
    }

    public static int unsetKthBit(int n , int k){
        return (n & ~(1<<k));
    }

    public static int flipOrToggleKthBit(int n , int k ){
        return (n ^ (1<<k));
    }

}

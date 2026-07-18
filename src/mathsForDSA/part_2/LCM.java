package mathsForDSA.part_2;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(7996,9995));

    }
    public static int lcm(int a, int b) {
        int lcm = a*b;
        int maxOfTwo= Math.max(a, b);
        for(int i=maxOfTwo; i<(a*b); i++){
            if(i % a == 0 && i % b == 0){
                lcm = Math.min(lcm, i);
            }
        }
        return lcm;
    }

}

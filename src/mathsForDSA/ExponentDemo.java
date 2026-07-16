package mathsForDSA;

public class ExponentDemo {
    public static void main(String[] args) {
        System.out.println(findPower(2,-2));

    }
    public static double findPower(int num , int  pow){
        double res = 1;
        boolean isNegative = false;
        if(pow<0){
            pow = -1* pow;
            isNegative=true;
        }
        for(int i=0 ;i<pow;i++){
            res = res * num;
        }
        if(isNegative){
            res=  1/res;
        }
        return res;
    }
}

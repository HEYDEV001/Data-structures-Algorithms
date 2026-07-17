package mathsForDSA.part_1;

public class ExponentDemo {
    public static void main(String[] args) {
        System.out.println(findPower(2,0));
        System.out.println(fastExponentiation(2,0));

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

    public static double fastExponentiation(int num , int pow){
        double res = 1 ;
        boolean isNegative = false;
        if(pow<0){
            pow = -1* pow;
            isNegative=true;
        }
        while(pow>0){
            if(pow % 2 != 0 ){
                res =res*num;
                pow--;
            }
            pow = pow/2;
            num = num * num;

        }
        if(isNegative){
            res=  1/res;
        }
        return res;
    }
}

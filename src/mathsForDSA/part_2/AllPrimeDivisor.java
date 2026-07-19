package mathsForDSA.part_2;

import java.util.ArrayList;
import java.util.List;

public class AllPrimeDivisor {
    public static void main(String[] args) {
        System.out.println(uniquePrimeFactors(60));
        System.out.println(allPrimeFactors(60));

    }
    public static List<Integer> uniquePrimeFactors(int num){
        List<Integer> res = new ArrayList<>();
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                res.add(i);
            }
            while(num % i == 0){
                num /= i ;
            }
        }
        if(num>1) res.add(num);
        return res;
    }

    public static List<Integer> allPrimeFactors(int num){
        List<Integer> res = new ArrayList<>();
        for(int i = 2; i <= Math.sqrt(num); i++){
            while(num % i == 0){
                num /= i ;
                res.add(i);
            }
        }
        if(num>1) res.add(num);
        return res;
    }
}

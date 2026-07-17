package mathsForDSA.part_2;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Divisor {
    public static void main(String[] args) {
        System.out.println(divisors(36));

    }
    public static Set<Integer> divisors(int num) {
        Set<Integer> res = new HashSet<>();
        int i =1 ;
        while(i<=Math.sqrt(num)){
            if(num % i==0){
                res.add(i);
                res.add(num/i);
            }
            i++;
        }
        return res;
    }
}

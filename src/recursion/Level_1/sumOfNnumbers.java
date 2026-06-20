package recursion.Level_1;

public class sumOfNnumbers {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
    static int sum(int n ){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}

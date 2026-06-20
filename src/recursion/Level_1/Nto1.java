package recursion.Level_1;

public class Nto1 {
    public static void main(String[] args) {
        function1(5);
    }
    //This prints in decreasing order
    static int funrev(int n ){
        if(n==0){
            return 0;
        }
        System.out.println(n);
       return funrev(n-1);
    }
    // This prints in increasing order
    static void function1(int n ){
        if(n==0){
            return ;
        }
        function1(n-1);
        System.out.println(n);

    }

}

package Stack.Questions;

public class MinimumNumberOfSwaps {
    public static void main(String[] args) {

    }
    static int minimumNumberOfSwaps(String s) {
        // code here
        int n= s.length();
        int open =0;
        int close =0 ;
        int unbalancedClose =0 ;
        int swaps = 0;
        for(int i  =0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(ch=='['){
                open++;
                if(unbalancedClose>0){
                    swaps += unbalancedClose;
                    unbalancedClose--;
                }
            }else{
                close++;
                unbalancedClose = close-open;
            }
        }
        return swaps;
    }
}

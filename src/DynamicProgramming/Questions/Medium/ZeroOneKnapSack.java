package DynamicProgramming.Questions.Medium;

public class ZeroOneKnapSack {
    public static void main(String[] args) {

    }
    // Using Recursion
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n  = val.length;
        return finalCapacity(W,  val,  wt, n-1);

    }
    private int finalCapacity(int cap, int val[], int wt[], int index){
        if(index==0){
            if(wt[index] <= cap){
                return val[index];
            }else{
                return 0;
            }
        }
        if(cap == 0) return 0;

        int pick = 0;
        if(wt[index] <= cap){
            pick = val[index] + finalCapacity(cap- wt[index],  val,  wt,  index-1);
        }
        int noPick =finalCapacity(cap,  val,  wt,  index-1);
        return Math.max(pick, noPick);
    }
}

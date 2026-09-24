package DynamicProgramming.Questions.Medium.InfiniteInputPattern;

public class CoinChange {
    public static void main(String[] args) {

    }
    // Using Recursion
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length -1;
        int res = result(coins, amount, n);
        if(res == (int)(1e9)){
            return -1;
        }else{
            return res;
        }
    }
    private static int result(int[] coins, int amount, int index){
        if(index == 0){
            if(amount % coins[index] == 0){
                return amount/coins[0];
            }
            return (int)(1e9);
        }
        if(amount == 0){
            return (int)(1e9);
        }
        int pick = (int)(1e9);
        if(coins[index] <= amount){
            pick = 1 + result(coins, amount - coins[index], index);
        }
        int noPick = result(coins, amount, index-1);
        return Math.min(pick, noPick);
    }
}

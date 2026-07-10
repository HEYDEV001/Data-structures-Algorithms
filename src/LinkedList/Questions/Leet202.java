package LinkedList.Questions;

public class Leet202 {
    public static void main(String[] args) {

    }

    // This is the solution
    public boolean isHappy(int n) {
        int slow = n ;
        int fast  = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow!= fast);

        if(slow ==1){
            return true;
        }
        return false;
    }

    public int findSquare(int num){
        int ans = 0 ;
        while(num>0){
            int rem  = num%10;
            ans += rem*rem;
            num /=10;
        }
        return ans;
    }

}

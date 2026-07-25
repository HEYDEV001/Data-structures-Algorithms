package binarySearch.ShashCode.Questions;

public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        char ans  = letters[0];
        int start = 0;
        int end  = letters.length-1;
        while(start<=end){
            int mid = start+((end-start)/2);
            if(letters[mid] <= target){
                start = mid+1;
            }else{
                end = mid-1;
                ans = letters[mid];
            }
        }
        return ans;
    }
}

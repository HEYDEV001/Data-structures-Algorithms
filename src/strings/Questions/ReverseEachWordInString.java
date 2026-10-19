package strings.Questions;

public class ReverseEachWordInString {
    // hello world -> olleh dlrow
    public static void main(String[] args) {

    }
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        int start =0;
        for(int end = 0 ; end <= len ;end++){
            if(end == len || arr[end] == ' '){
                reverse(arr, start, end-1);
                start = end +1;
            }
        }
        return new String(arr);
    }

    private void reverse(char[] arr, int start, int end){
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}

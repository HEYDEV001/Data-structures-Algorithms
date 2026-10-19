package strings.Questions;

public class ReverseWordsInAString {
    public static void main(String[] args) {

    }
    public String reverseWords(String s) {
        String result = "";
        String[] arr = s.split(" ");
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i].isEmpty()){
                continue;
            }
            if(result.isEmpty()){
                result = arr[i];
            }else{
                result += " " + arr[i];
            }
        }
        return result;
    }


}

package strings.Questions;

public class ReverseWordsInAString {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        String result = "";
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].isEmpty()) {
                continue;
            }
            if (result.isEmpty()) {
                result = arr[i];
            } else {
                result += " " + arr[i];
            }
        }
        return result;
    }


    public String reverseWords2(String s) {
        StringBuilder res = new StringBuilder("");
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].isEmpty()) {
                continue;
            }
            if (res.isEmpty()) {
                res.append(arr[i]);
            } else {
                res.append(" ").append(arr[i]);
            }
        }
        return res.toString();
    }


    public String reverseWords3(String s) {
        StringBuilder res = new StringBuilder("");
        int startIndex = s.length() - 1;
        while (startIndex >= 0) {
            while (startIndex >= 0 && s.charAt(startIndex) == ' ') {
                startIndex--;
            }
            if(startIndex< 0){
                break;
            }
            int endIndex = startIndex;
            while (startIndex >= 0 && s.charAt(startIndex) != ' ') {
                startIndex--;
            }
            if (res.isEmpty()) {
                res.append(s.substring(startIndex + 1, endIndex + 1));
            } else {
                res.append(" ");
                res.append(s.substring(startIndex + 1, endIndex + 1));
            }
        }
        return res.toString();
    }
}

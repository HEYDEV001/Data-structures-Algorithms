package recursion;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDuplicates("cbacdcbc", 0, new StringBuilder(""), new boolean[26]);

    }
    public static void removeDuplicates(String str , int index, StringBuilder newString, boolean[] map) {
        str = str.toLowerCase();
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if(map[currChar - 'a']){
            removeDuplicates(str, index+1, newString, map);
        }else{
            map[currChar -'a'] = true;
            removeDuplicates(str, index+1, newString.append(currChar), map);
        }
    }
}

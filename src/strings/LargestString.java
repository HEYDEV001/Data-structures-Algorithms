package strings;

public class LargestString {
    public static void main(String[] args) {
    // This will compare the Strings in lexicographically (alphabetical Order)
        String[] words = {"dev", "Ajav", "Rishi", "yuvraj", "Zaid"};
        System.out.println(largestString(words));


    }
    public static String largestString(String[] words) {
        String largest  = words[0];
        for (String word : words) {
            if(word.compareToIgnoreCase(largest)>0){
                largest = word;
            }
        }
        return largest;
    }

}

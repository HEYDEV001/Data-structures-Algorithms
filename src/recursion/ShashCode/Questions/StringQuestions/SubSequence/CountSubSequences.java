package recursion.ShashCode.Questions.StringQuestions.SubSequence;

public class CountSubSequences {
    public static void main(String[] args) {
        System.out.println(countAllSubSequences("abc", 0, ""));
        System.out.println(countSelectiveSubSequences("abc", 0, ""));
    }
    public static int countAllSubSequences(String s, int index, String curr){
        if(index == s.length()){
            return 1;
        }
        int pick = countAllSubSequences(s, index+1, curr + s.charAt(index));
        int noPick = countAllSubSequences(s, index+1, curr);
        return pick + noPick;
    }

    public static int countSelectiveSubSequences(String s, int index, String curr){
        if(index == s.length()){
            if(curr.startsWith("a")){
                return 1;
            }
            return 0;
        }
        int pick = countSelectiveSubSequences(s, index+1, curr + s.charAt(index));
        int noPick = countSelectiveSubSequences(s, index+1, curr);
        return pick + noPick;
    }
}

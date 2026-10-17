package Queue.ShashCode.Questions;

public class NumberOfStudentsUnableToEatLunch {
    public static void main(String[] args) {

    }
    public int countStudents(int[] students, int[] sandwiches) {
        int square = 0;
        int circular = 0;
        for(int a : students){
            if(a == 1){
                square++;
            }else{
                circular++;
            }
        }

        for(int s : sandwiches){
            if(s == 1 && square ==0){
                return circular;
            }
            if(s == 0 && circular ==0){
                return square;
            }
            if(s == 0 ){
                circular--;
            }else{
                square--;
            }
        }
        return 0;
    }

}

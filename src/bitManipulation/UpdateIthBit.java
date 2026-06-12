package bitManipulation;

public class UpdateIthBit {
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 0, 1));

    }
    public static int updateIthBit(int number , int i , int newBit){
        number = number & ~(1<<i); // clear ith bit
        return number | (newBit<<i);// then if the newBit is 0 then the number remains same and if it is one then the ith bit will be set
    }
}

package arrays.arrays2d;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        // Declaration of 2d Array
        int [][] matrix = new int[3][3];

        Scanner input = new Scanner(System.in);
        for(int row = 0 ; row < matrix.length ; row++){
            for(int col =0 ;  col < matrix[0].length; col++){
                System.out.print("Enter the value on the position ("+row+","+col+") -> ");
                matrix[row][col] = input.nextInt();
            }
        }
        for(int row = 0 ; row < matrix.length ; row++){
            for(int col =0 ;  col < matrix[0].length; col++){
                System.out.print(matrix[row][col] +" ");

            }
            System.out.println();
        }


    }
}

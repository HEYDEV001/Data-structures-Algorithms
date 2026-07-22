package LinearSearch;

public class LinearSearch2d {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,5,3,6},
                {2,4,7,8},
                {9,2,8,6}};
        linearSearch2dFirst(matrix, 11);
        linearSearch2dAll(matrix, 11);
        linearSearch2dLast(matrix, 11);
    }
    public static void linearSearch2dFirst(int[][] matrix, int target) {

        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("The target is Sitting at index: ("+ i +"," + j + ")");
                    found = true;
                    return;
                }
            }
        }
        if (!found) {
            System.out.println("The target is not found");
        }

    }

    public static void linearSearch2dAll(int[][] matrix, int target) {
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("The target is Sitting at index: ("+ i +"," + j + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("The target is not found");
        }

    }
    public static void linearSearch2dLast(int[][] matrix, int target) {

        int outer=-1;
        int inner=-1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    outer=i;
                    inner=j;
                }
            }
        }
        System.out.println("The target is Sitting at index: ("+ outer +"," + inner + ")");

    }
}

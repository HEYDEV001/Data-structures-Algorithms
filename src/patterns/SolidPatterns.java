package patterns;

public class SolidPatterns {
    public static void main(String[] args) {
        square(4);
        rectangle(4,5);
        rightAngleTriangle(5);
        rightAngleTriangleWithNumbers(5);
        rightAngleTriangleWithChars(5);
        invertedRightAngleTriangle(5);
        mirroredRightAngleTriangle(5);
        EquilateralTriangle(5);
        diamond(7);
        floydTriangle(4);

    }
    public static void square(int n ) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void rectangle(int rows, int cols) {
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightAngleTriangle(int n ){
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightAngleTriangleWithNumbers(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void rightAngleTriangleWithChars(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <=i; j++) {
                System.out.print((char)(j + 65)+" ");
            }
            System.out.println();
        }
    }

    public static void invertedRightAngleTriangle(int n) {
        for(int i  = n; i >= 1; i--) {
            for(int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void mirroredRightAngleTriangle(int n) {
        for(int i = 1; i <= n; i++) {
            //Spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = n-i+1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void EquilateralTriangle(int n) {
        for(int i = 1; i <= n; i++) {
            //space
            if(i%2==0){
                continue;
            }
            for(int j = 1; j <= (n-i)/2; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for(int i = 1; i <= n; i++) {
            //space
            if(i%2==0){
                continue;
            }
            for(int j = 1; j <= (n-i)/2; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--) {
            //space
            if(i%2==0){
                continue;
            }
            for(int j = (n-i)/2; j >=1 ; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void floydTriangle(int n ){
        int num =1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}

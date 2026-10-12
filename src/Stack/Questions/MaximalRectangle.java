package Stack.Questions;

public class MaximalRectangle {
    public static void main(String[] args) {

    }
    public int maximalRectangle(char[][] matrix) {
        int[] heights = new int[matrix[0].length];
        int max = 0;
        if(matrix.length==0){
            return 0;
        }
        for( int i=0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length; j++){
                if(matrix[i][j] == '1'){
                    heights[j] += (matrix[i][j]-'0');
                }else{
                    heights[j] = 0;
                }
            }
            int maxArea = largestRectangleArea(heights);
            if(maxArea > max){
                max = maxArea;
            }
        }
        return max;

    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] stack = new int[n+1];
        int index = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i <=n ; i++){
            int element = (i==n) ? 0 : heights[i];
            while((index!=-1) && heights[stack[index]] > element){
                int h = heights[stack[index--]];
                int prevSmaller = (index == -1) ? -1 : stack[index];
                int width = i - prevSmaller -1;
                max = Math.max(max, h * width);
            }
            stack[++index] = i;
        }
        return (max == Integer.MIN_VALUE) ? 0 : max;
    }
}

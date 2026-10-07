package Stack.Questions;

import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {

    }
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n ; i++){
            if(stack.isEmpty() || asteroids[i]>0){
                stack.push(asteroids[i]);
            }else{
                while(!stack.isEmpty()){
                    int top = stack.peek();
                    if(top<0){
                        stack.push(asteroids[i]);
                        break;
                    }else{
                        if(Math.abs(asteroids[i]) < top){
                            break;
                        }else if(Math.abs(asteroids[i]) > top){
                            stack.pop();
                            if(stack.isEmpty()){
                                stack.push(asteroids[i]);
                                break;
                            }
                        }else{
                            stack.pop();
                            break;
                        }
                    }
                }
            }
        }
        int[] result = new int[stack.size()];
        for(int i  = stack.size() - 1; i>=0 ; i--){
            result[i] = stack.pop();
        }
        return result;
    }
}

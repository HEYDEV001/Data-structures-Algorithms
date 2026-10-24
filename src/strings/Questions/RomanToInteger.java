package strings.Questions;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {

    }
    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        // we will check the pairs if the first value of the first character of the  pair is less.
        // then we will add there difference to the result and move to next pair (LC = 100-50 or IC = 100-1) here the first character hold less value
        // and if the first is bigger. then we'll simply add that to the result and move to the next character
        for (int i = 0; i < s.length(); i++) {
                // here we check for index out of bound and comparison of the character of the pair
            if(i+1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result += (map.get(s.charAt(i+1)) - map.get(s.charAt(i)));
                // to move to next pair
                i++;
            }else{
                result += map.get(s.charAt(i));
            }

        }
        return result;
    }


    public int romanToInt2(String s) {

        int[] characters = new int[128];
        characters['I'] = 1;
        characters['V'] = 5;
        characters['X'] = 10;
        characters['L'] = 50;
        characters['C'] = 100;
        characters['D'] = 500;
        characters['M'] = 1000;
        int result = 0;
        // we will check the pairs if the first value of the first character of the  pair is less.
        // then we will add there difference to the result and move to next pair (LC = 100-50 or IC = 100-1) here the first character hold less value
        // and if the first is bigger. then we'll simply add that to the result and move to the next character
        for (int i = 0; i < s.length(); i++) {
            // here we check for index out of bound and comparison of the character of the pair
            if(i+1 < s.length() && characters[s.charAt(i)] < characters[s.charAt(i+1)]){
                result += (characters[s.charAt(i+1)] - characters[s.charAt(i)]);
                // to move to next pair
                i++;
            }else{
                result +=characters[s.charAt(i)];
            }

        }
        return result;
    }



    public int romanToInt3(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i+1 < s.length() && getCharValue(s.charAt(i)) < getCharValue(s.charAt(i+1))){
                result += (getCharValue(s.charAt(i+1)) - getCharValue(s.charAt(i)));
                i++;
            }else{
                result +=getCharValue(s.charAt(i));
            }

        }
        return result;
    }
    // Switch case is faster than map lookup in java
    private int getCharValue(char c) {
        // Enhanced Switch
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}

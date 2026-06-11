package strings;

public class ShortestDistance {
    public static void main(String[] args) {
        String directions = "WNEENESENNNWN";
        System.out.println(shortestDistance(directions));

    }
    // Question: we are given with a string of actions which tells us the direction we should move 1 unit in.
    // the String can be given as "NWSENNSEWN"
    // where N -> North, S -> South, W -> West, E -> East
    public static float shortestDistance(String directions) {
       int x =0 , y = 0;
        for(int i = 0; i < directions.length(); i++){
            char dir  = directions.charAt(i);
            if(dir == 'N'){
               y++;
            }else if(dir == 'S'){
               y--;
            }else if(dir == 'E'){
                x++;
            }else if(dir == 'W'){
                x--;
            }
        }
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}

package oops;

public class Interfaces {
    public static void main(String[] args) {
Rook r = new Rook();
r.move();


Bear B = new Bear();
B.food();
    }
}
/*
Interfaces is a blueprint of a Class
It is used for :
- Multiple Inheritance
- Total Abstraction
Properties:
-All methods are public, abstract & without implementation
-Used to achieve total abstraction
-Variables in the interface are final, public and static
 */
/*
Interface ko inherit karane ke liye hamm "implements" likhte h
 */

interface ChessPlayer {
    void move();
}

class Queen implements ChessPlayer {
    public void move() {
        System.out.println("Queen can move in all the directions");
    }

}
class Rook implements ChessPlayer {
    public void move() {
        System.out.println("Rook can move in horizontal and vertical directions");
    }
}

// Multiple Inheritance Using Interface

interface Herbivore{
    void food();
}
interface Carnivore{
    void eats();
}
class Bear implements Herbivore, Carnivore {
    public void eats() {
        System.out.println("Bear can eat other animals");
    }

    @Override
    public void food() {
        System.out.println("Bear can eat plants also!");
    }
}
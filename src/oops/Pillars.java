package oops;

public class Pillars {
    public static void main(String[] args) {
//fish shark = new fish();
//shark.eat();// yha eat fun Fish me nhi tha lekin Animals me tha to fish ka obj usse access kr paa rha h
//        Dogs doggy = new Dogs();
//        doggy.eat();
//        System.out.println(doggy.voice);
//        doggy.setLegs(4);
//        System.out.println(doggy.legs);
Fish f1 = new Fish();
f1.eat();

//        Calculator calc = new Calculator();
//        calc.sum(1,2);
//        calc.sum(1,2,3);
//        calc.sum((float) 1.8,(float)2.4);


//        Deer d = new Deer();
//        d.eat(); // Here it will override the eat function of the base class and the function of the derived class will be called


        Horse h = new Horse();
        h.eat();
        h.walk();
        Dog d = new Dog();
        d.eat();
        d.walk();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);
        Mustang M = new Mustang();


    }
}

/* there are four pillar in OOPS
1: Encapsulation : Encapsulation is defined as wrapping up of data and  methods under a single unit . it Also implements data hiding
Ex: Making a Class


2:Inheritance : inheritance of properties and methods of base class to the derived class
Types of Inheritance :
A:single level(Base -> derived)
B:Multi level(Base -> derived -> derived)
C:Hierarchical (Base -> derived1
                     -> derived2 )
D:Hybrid Inheritance(Base -> derived1 ->derived2
                     -> derived3 )


3:Polymorphism:
Two Types:
A: Compile Time(Method Overloading)
B: Run time(Method Overriding)


4: Abstraction:Hiding all the unnecessary details and showing only the important parts to the user
It is implemented by two ways
1: Abstract classes
- Cannot create  an instance of abstract class
- Can have abstract/non-abstract methods
- Can have constructors
2: Interfaces

 */







// Example of Inheritance
// Base baliclass
 class  Animals{
      String Color;
      void eat(){
          System.out.println("Khana");
      }
      void sleep(){
          System.out.println("Sleep 4 hours");
      }
}
// Derived Class : We make derived class by using keyword "extends"

// Single level inheritance
class Fish extends Animals{
int fins;
void setFins(int fins){
        this.fins = fins;
    }
    void swim(){
    System.out.println("Swims in water");
    }
}


// Multilevel Inheritance
//class Mammals extends Animals{
//     int legs;
//     void setLegs(int legs){
//         this.legs = legs;
//     }
//}
//class Dogs extends Mammals{
//     String breed ;
//     String voice ="Bhow Bhow Bhow Bhow Bhow Bhow";
//}

// Hierarchical Inheritance
class Mammals extends Animals{
    void walk(){
        System.out.println("Walks");
    }
}
class fish extends Animals{
     void swim(){
         System.out.println("Swims");
     }
 }
class Birds extends Animals{
    void fly(){
        System.out.println("Flies");
    }
}

// Example Of Polymorphism
// 1: Compile Time
// Method Overloading : Name of function is same but parameters are different
 class Calculator{
     void sum(int a, int b){
         System.out.println(a+b);
     }
     void sum(int a, int b, int c){
         System.out.println(a+b+c);
     }
     void sum(float p, float q){
         System.out.println(p+q);
     }
}



// Method Overriding
class Deer extends Animals {

    void eat() {
        System.out.println("Eats Grass");
    }
}


// Implementation of Abstraction

// Abstract class bass ek idea de deti h ki ye ye baki ki derived class me bhi hona chaiye lekin bo derived pr depend krta h ki kaisa hona chaiye
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal Cons. Called");
        color= "Brown";
    }

     void eat(){
         // Non-abstract method me implementation likh sakte h jaise ki "sout" karaya h apan ne
         System.out.println("Bhojan");
     };
     abstract void walk();// Abstract methods me implementaion nhi likhte
}
// Agar koi bhi class abstract class ko inherit krega to sabse pehle use abstract function (methods ) dene padege
// kyuki abstract method ko implement krna compulsary h derived class me
class Horse extends Animal{
    Horse(){
        System.out.println("Horse Cons. Called");
    }
    void changeColor(){
         color="Dark Brown";
    }

    void walk() {
        System.out.println("Runs on 4 legs");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog Cons. Called");
    }
    void changeColor(){
          color="Black";
    }
     void walk() {
         System.out.println("walks on 5 legs");
     }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Cons. Called");
    }
}

// Note : Agar do class h A and B, B is the child class, to agar B ka obj banaya to sabse pehle A ka cons. Call hoga then B ka





















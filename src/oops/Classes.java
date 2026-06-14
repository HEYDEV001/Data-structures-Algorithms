package oops;

public class Classes {
    public static void main(String[] args) {
//        Pen p1 = new Pen("red",10); // This is an Object of Pen Class called p1
//        Pen() This is called constructor
//        p1.setColor("Yellow");// This will set color of the pen we use "." Operator for accessing the functions from any class
//        System.out.println(p1.color);
//        p1.setColor("Red");
//        System.out.println(p1.color);
//        p1.setTip(9);
//        System.out.println(p1.tip);
//        p1.color = "green"; // directly var. ko access krke change kr diya
//        System.out.println(p1.color);
        Student s1 = new Student();
        s1.setName("Azhar");
//        System.out.println(s1.name);
         String name = s1.getName();
        System.out.println(name);
        BankAccount myAcc =     new BankAccount(); // Here myAcc is the Name of the object of the class BankAccount
        myAcc.userName = " Dev Pathak";// This we can do because it is public
//        myAcc.password = "Hello"; // This we cannot access here because it is private
        myAcc.setPass("Hello");
//        System.out.println(myAcc.userName);
        System.out.println( myAcc.getPass());


    }
}



class Pen {
String color;
int tip;

    public Pen() {
        System.out.println("This is the default constructor");
    }

    public Pen(String color, int tip) {
        System.out.println("This is the not the default constructor");
        this.color = color;
        this.tip = tip;
        System.out.println("color "+color+" tip "+tip);
    }

    void setColor(String color) {// Setter
    this.color = color;
}
void setTip(int tip) {//setter
    this.tip = tip;  // this keyword is used to refer the current object
}
}
class Student {
    String name;
    int age;
    float per;
    void setName(String name) {
        this.name = name;
    }
    void setAge(int newAge) {
        age = newAge;
    }

    public String getName() {
        return name;
    }

    void calcPer(int maths, int phy, int chem) {
      per = (float) (maths + phy + chem) /3 ;
    }
}
// Class is blueprint of an object

// Access Specifiers

class BankAccount{
     public String userName;
     private String password;

     // Setter
public void  setPass(String newPass) {
    password = newPass;
}
// Getter
    public String getPass() {
    return password;
    }
}
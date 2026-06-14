package oops;

public class Estatic {
    public static void main(String[] args) {

        Students s10=new Students();
        s10.name = "dev";
        System.out.println(s10.name);
        Students s20=new Students();
        System.out.println(s20.name);


    }
}
/*
 Static Keyword:Static keyword in java is used to share the same variable or method of a given class
 we can make Static :
 -Properties
 -Functions
 -Blocks
 -Nested classes
 */


class Students {
   static int returnPercentage(int phy,int maths,int chem){
        return (maths+chem+phy)/3;
    }

     static String name;
     int age;
    void setName(int age) {
        this.age = age;
    }
    int getName() {
        return this.age;
    }
}

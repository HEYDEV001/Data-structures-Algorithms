package oops;

public class Constructor {
    public static void main(String[] args) {
Person p1  = new Person("Dev",18);
Person p2  = new Person("Yuvraj",21);
System.out.println(p1.name);
System.out.println(p2.name);
        Person p3 = new Person();
        p3.name="raj";
        p3.age = 21;
        p3.marks[0]=100;
        p3.marks[1]=90;
        p3.marks[2]=98;
        /* yha hamne do type ke constructor banaye h or parameter ke acc cons. call ho jaye to isko ham cons. overloading kehte h
        & This is an Example of polymorphism */

        Person p4 = new Person(p3);// iss line par p3 copy ho gya tha p4 me
        p3.marks[1]=95 ;
        for(int i  =0 ; i<p3.marks.length; i++){
            System.out.println(p3.marks[i]);
        }
        for(int i  =0 ; i<p4.marks.length; i++){
            System.out.println(p4.marks[i]);
        }
    }
}
class Person {
    String name;
    int age;
    int[] marks;
    // This is Parameterised Constructor (It has Two parameter)
    public Person(String name, int age) {
        marks = new int[3];
        this.name = name;
        this.age = age;
   }

    // This is Non- Parameterised Constructor (Which Do not have any parameter)
    public Person() {
        marks = new int[3];
        System.out.println("Constructor is called... ");
    }

    // Shallow Copy Constructor
//    Person(Person p3) {
//        marks = new int[3];
//        this.marks = p3.marks;
//      this.name = p3.name;
//      this.age = p3.age;
//    }


//  Deep Copy Constructor
Person(Person p3) {
    marks = new int[3];
    this.name = p3.name;
    this.age = p3.age;
    for(int i=0 ; i<marks.length; i++){
        this .marks[i] = p3.marks[i];
    }
}
}

/*
Constructor is a special method which is invoked at the time of object creation.
 - Constructors have the same name as class or structure.
 - Constructors don't have a return type. (Not even void)
 - Constructors are only called once, at object creation.
 - Memory allocation happens when constructor is called.

  or agar ham constructor ko creat na bhi kare to default cons. khud hi ban jata h jo ki non parameterised hota h

   There are Some types of constructor
   1: Non- Parameterised
   2: Parameterised
   3: Copy Constructor
 */


/*
Shallow Copy : When we change the original object those changes reflect in its copy
(the new Object(obj2) that we've created by copying the original object (obj1))
This happens because in shallow copy new objects are not created, They just point to the old objects.
suppose we have an array marks[] in the object
Now we create new Object by copying the existing object.
the marks[] of new object will start pointing to the marks[] of original object
new Array is not created
so when we make changes in the original object, they reflect in its copy
 */

/*
Deep Copy :When we change the original object those changes do not reflect in its copy
because in deep copy new object is created same as the original object  ,
but they are created  in the memory
so changes do not reflect when made in the original object
 */

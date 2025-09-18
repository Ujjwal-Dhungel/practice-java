// Design a Java program that demonstrates the concepts of class, object, method overloading, and the use of the this keyword. 
//In the same program, create a static variable to count how many objects have been created from the class. Also include a constructor
//to initialize the object, and use recursion inside one of the methods to compute factorial of a given number.
import java.util.Scanner;
class Person{
    String name;
    int age;
    static int count=0;
    
    Person(String name,int age){
        this.name=name;
        this.age=age;
        count++;
    }
    void display(){
        System.out.println("Person Name is :"+name);
        System.out.println("Person Age is :"+age);
    }
    void display(String role){
        System.out.println(role+" Person Name :"+name);
        System.out.println(role+" Person age :"+age);
    }
    double fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1);
    }   
}
class Doctor extends Person{
    String specification;

    Doctor(String name,int age,String specification){
        super(name, age);
        this.specification=specification;
    
    }
    @Override
    void display(){
        System.out.println("Doctor name :"+name);
        System.out.println("Specification At :"+specification);
    }
}
class Staff extends Person{
    String duty;

    Staff(String name,int age,String duty){
        super(name, age);
        this.duty=duty;
    }
    @Override
    void display(){
        System.out.println("Staff Name :"+name);
        System.out.println("Staff Age :"+age);
        System.out.println("Staff duty :"+duty);
    }
}
public class Practice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for factorial");
        int n=sc.nextInt();
        Person p=new Person("ujjwal", 15);
        System.out.println(p.fact(n));
        Doctor d=new Doctor("Hari prasad", 50, "Dermetologist");
        Staff s=new Staff("samragi", 18, "Helper");
        p.display();
        d.display();
        s.display();
    }
}
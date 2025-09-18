//Write a Java program that demonstrates inheritance by creating a base class Person with attributes like name and age, and a 
//subclass Student that adds roll number and marks. Use the super keyword to call the constructor of the base class and override a
//method displayDetails().Also include a nested class in Student named Address that stores and displays the student's location.
class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayDetails(){
        System.out.println("Name is :"+name);
        System.out.println("Age is :"+age);
    }
}
class Student extends Person{
    int roll;
    int marks;

    Student(String name,int age,int roll,int marks){
        super(name,age);
        this.roll=roll;
        this.marks=marks;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Roll Number is :"+roll);
        System.out.println("Marks of Student :"+marks);
    }
class Address{
    String location;

        Address(String location) {
            this.location = location;
        }
    void display(){
        System.out.println("  :"+location);
    }
    }
}
public class Studentt{
    public static void main(String[] args) {
       // Person p=new Person("ujjwal", 18);
        Student s=new Student("ujjwal",18,66,53);
        s.displayDetails();
        Student.Address add=s.new Address("buddhabare");
        add.display();
    }
}
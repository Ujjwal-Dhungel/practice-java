//Explain and demonstrate dynamic method dispatch using a superclass Animal and subclasses Dog and Cat, each overriding the makeSound() 
//method. Additionally, define an interface Eater with a method eat(),and implement it in both subclasses. Also, apply the final
//keyword in an appropriate way to restrict method or class inheritance.
interface Eater{
    void eat();
}
class Animal{
    String sound;

    Animal(String sound){
        this.sound=sound;
    }
    void eat(){
        System.out.println("All animal make different sound");
    }
}
class Dog extends Animal{
    Dog(String sound){
        super(sound);
    }
    void makeSound(){
        System.out.println("Dog make sound :"+sound);
    }
  final  void eat(){
        System.out.println("Dog eat meat");
    }
}
class cat extends Animal{
    cat(String sound){
        super(sound);
    }
    void makeSound(){
        System.out.println("Cat have different sound :"+sound);
    }
   final void eat(){
        System.out.println("Cat eat milk and rice ");
    }
}
public class Main{
    public static void main(String[] args) {
        Animal c=new Animal("");
        c.eat();
        Dog a=new Dog("bow bow");
        cat b=new cat("mew mew");
        a.makeSound();
        b.makeSound();
        a.eat();
        b.eat();

    }
}
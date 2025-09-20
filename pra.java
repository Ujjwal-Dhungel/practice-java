class Person<T>{
    //attributes
    private T name;
    private T age;
//constructor
    Person(T name,T age){
        this.name=name;
        this.age=age;
    }
    //getter
    public T getname(){
        return name;
    }
    //setter
    public void setname(T name){
        this.name=name;
    }
    //getter
    public T getage(){
        return age;
    }
    //setter
    public void setage(T age){
        this.age=age;
    }
} 
//maiin class
public class pra{
    public static void main(String[] args) {
        Box<String>strbox=new Box<>("ujjwal");
        System.out.println("Value :"+strbox.getContent());
        Box<Integer>intbox=new Box<>(45);
        System.out.println("Value is :"+intbox.getContent());

    }
}
class <T,k> Person{
    private T name;
    private T age;

    public  void setname(String name){
        this.name=name;
     }
    public String getname(){
        return name;
    }
    public  void setage(int age){
        this.age;
    }
    public  int getage(){
        return age;
    }
}
public class Generic{
    public static void main(String[]args){
        Person<String,Integer> str=new Person<>();
        str.setname("ujjwal");
        str.setage(16);
        System.out.println("Name is :"+str.getname());
        System.out.Println("Age is :"+str.getage());
    }
}
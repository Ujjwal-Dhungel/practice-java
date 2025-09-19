class Box<T>{
    private T content;
    public Box(T content){
        this.content=content;
    }
    public T getContent(){
        return content;
    }
    public T setContent(T Content){
        this.content=content;
    }
    public void showType(){
        System.out.println("Type of T is "+content.getClass().getName());
    }
}
public class Generic{
public static void main(String[] args) {
    Box<Integer>intbox=new Box<>(100);
    intbox.showType();
    System.out.println("Value :"+intbox.getContent());

    Box<String>strBox=new Box<>("Hello Genirics");
    strBox.showType();
    System.out.println("Value :"+strBox.getContent());

    Box<Double>doubleBox=new Box<>(13.14);
    doubleBox.showType();
    System.out.println("Value :"+doubleBox.getContent());
}
}
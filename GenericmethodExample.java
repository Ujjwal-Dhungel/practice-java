public class GenericmethodExample {
    public static<T>void PrintArray(T[]arr){
        for(T element : arr){
            System.out.print(element);
        }
        System.out.println();
    }

public static void main(String[]args){
    String []str={"ujjwal\n","Ram\n","Shyam\n"};
    PrintArray(str);
    Integer []integer={1  ,2   ,3};
    PrintArray(integer);
    Double []doub={1.2,3.2,4.2};
    PrintArray(doub);
    // System.out.println(PrintArray(str));
    // System.out.println(PrintArray(integer));
    // System.out.println(PrintArray(doub));
}
}
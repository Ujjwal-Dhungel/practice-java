//Create a class BankAccount that has private member variables such as account number, holder name, and balance. Include appropriate
//access control using getter and setter methods. Write overloaded constructors for different initialization needs.Then,implement a subclass
//SavingsAccount that extends BankAccount and overrides a method calculateInterest().Also, demonstrate garbage collection by overriding the 
//finalize() method and explain how memory is managed in Java.
class BankAccount{
    private String accountnumber;
    private String holdername;
    double balance;

    public BankAccount(String accountnumber, String holdername, double balance) {
        this.accountnumber = accountnumber;
        this.holdername = holdername;
        this.balance = balance;
    }
    public void setacconum(String accountnumber){
        this.accountnumber=accountnumber;
    }
    public String getaccnum(){
        return accountnumber;
    }
    public void setholdername(String holdername){
        this.holdername=holdername;
    }
    public String getholdername(){
        return holdername;
    }
    public void setbalance(double balance){
        this.balance=balance;
    }
    public double getbalance(){
        return balance;
    }
    @Override
    protected void finalize(){
        System.out.println("Bankaccount object with Account no:"+accountnumber);
    }
}
class SavingsAccount extends BankAccount{
    double rate;
    int time;

    public SavingsAccount(String accountnumber, String holdername, double balance,double rate, int time) {
        super(accountnumber, holdername, balance);
        this.rate = rate;
        this.time = time;
    }
   public double calculateInterest(){
    return (getbalance()*rate*time);
   }
   @Override
   protected void finalize(){
    System.out.println("SavingAccount object for "+getholdername());
   } 
}
public class Memorymangt{
    public static void main(String[] args) {
        BankAccount b=new BankAccount("123839498324","UjjwalDhungel",5000);
        SavingsAccount a=new SavingsAccount("111111","ujjwal",20000,5.50,2);
        System.out.println(b.getholdername());
        System.out.println(b.getbalance());
        System.out.println(a.calculateInterest());
        b=null;
        System.gc();
    }
}
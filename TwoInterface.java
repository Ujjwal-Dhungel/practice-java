//Write a program to demonstrate multiple inheritance using interfaces. Create two interfaces Printable andScannable both having a method info(). 
//Create a class Machine that implements both interfaces and resolves any ambiguity. Use static methods and static blocks in the same class to initialize
//class-level data. Additionally, show how recursive methods can be used to solve mathematical problems like computing power or GCD.
// Interface 1
interface Printable {
    void info();
}

// Interface 2
interface Scannable {
    void info();
}

class Machine implements Printable, Scannable {
    private static String machineType;

    static {
        machineType = "Multi-Function Machine";
        System.out.println("Static block executed: Machine Type set to " + machineType);
    }

    @Override
    public void info() {
        System.out.println("This is a " + machineType + " that can print and scan.");
    }

    // Static method
    public static void showMachineType() {
        System.out.println("Machine Type: " + machineType);
    }

    public int power(int base, int exp) {
        if (exp == 0)return 1;  
        return base * power(base, exp - 1);
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

// Main class
public class TwoInterface {
    public static void main(String[] args) {
     
        Machine m1 = new Machine();

        m1.info();

        Machine.showMachineType();

        System.out.println("Power(2, 5): " + m1.power(2, 5)); 
        System.out.println("GCD(48, 18): " + m1.gcd(48, 18)); 
    }
}

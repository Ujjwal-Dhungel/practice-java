class Person {
    // Inner class Student
    class Student {
        String name;
        int age;
        Student(String name, int age) {
            // Refers to outer class fields
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name of Student is: " + name);
            System.out.println("Roll number of Student is: " + age);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Person p = new Person();
        Person.Student p1 = p.new Student("Ujjwal", 15);
        p1.display();
    }
}

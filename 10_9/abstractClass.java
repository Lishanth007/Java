//Apstract class
abstract class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void display();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Manager extends Employee {
    private int salary;

    public Manager(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
    public void display(){
        System.out.println("Employee Name: "+getName());
        System.out.println("Employee Age: "+getAge());
        System.out.println("Employee Salary: "+salary);
    }
}
public class abstractClass {
    public static void main(String[] args) {
        Employee meg = new Manager("Barbie",20,33000);
        meg.display();
    }
}

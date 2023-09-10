//Method Overloading in three ways.
public class MethodOverLoading {
    // Difference in parameters
    public void a(int num) {
        System.out.println("Integer: " + num);
    }

    public void a(double num) {
        System.out.println("Double: " + num);
    }

    public void a(String txt) {
        System.out.println("String: " + txt);
    }

    //Different in data type of parameters
    public void b(int num) {
        System.out.println("Integer: " + num);
    }

    public void b(double num) {
        System.out.println("Double: " + num);
    }

    public void b(String txt) {
        System.out.println("String: " + txt);
    }

    //Different Order of Parameters
    public void c(int num, String txt) {
        System.out.println("Integer: " + num);
    }

    public void c(String txt, int num) {
        System.out.println("String: " + txt);
    }
    public static void main(String[] args) {
        MethodOverLoading mo = new MethodOverLoading();
        System.out.println("Different in parameters.");
        mo.a(1);
        mo.a(2);
        mo.a("Barbie");
        System.out.println("Different in data type of parameters.");
        mo.b(1);
        mo.b(2);
        mo.b("Barbie Doll");
        System.out.println("Different Order of Parameters.");
        mo.c(10, "Barbie");
        mo.c("Barbie", 10);
    }
}

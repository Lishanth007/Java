interface one{
    void method1();
}
interface two{
    void method2();
}
class MultipleInhertance implements one,two{
    public void method1(){
        System.out.println("Hello this is class one");
    }
    public void method2(){
        System.out.println("Hii this is class two");
    }
    public static void main(String[] args) {
        MultipleInhertance mi = new MultipleInhertance();
        mi.method1();;
        mi.method2();
    }
}

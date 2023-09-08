public class ExcThree {
    public static void main(String[] args) {
        try {
            int array[] = { 1, 3, 4, 5, 7, 8 };
            System.out.println(array[34]);
        } catch (IndexOutOfBoundsException n) {
            System.out.println("Index  34 value is not in array");
        }finally{
            System.out.println("this is finally");
        }
    }
}

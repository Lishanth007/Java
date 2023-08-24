public class CloneArray {

    public static void main(String[] args) {
        //Deep copy -->different memori location
        int[] arr = { 1, 2, 3 };
        int[] arra = arr.clone();
        System.out.println(arr == arra);
        for (int i = 0; i < arra.length; i++) {
            System.out.print(arra[i] + " ");
        }
        // Shallow copy---> Same memory location
        int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int duplicate[][] = arr1.clone();
        System.out.println(arr1 == duplicate);
        for(int j=0;j<arr1.length;j++)
        System.out.println(arra[j] + " ");

    }
}
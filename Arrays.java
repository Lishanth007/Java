public class Arrays {
    public static void main(String[] args) {
        int[] RollNuum = { 1, 2, 3, 4, 50 };
        for (int i = 0; i < RollNuum.length; i++) {
            System.out.print(RollNuum[i]);
        }
        System.out.println("               ");
        for (int i = RollNuum.length - 1; i >= 0; i--) {
            System.out.print(RollNuum[i]);
        }
    }
}


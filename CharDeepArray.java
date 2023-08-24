public class CharDeepArray {
    public static void main(String[] args) {
        // Deep copy
        char name[] = { 'L', 'I', 'S', 'H' };
        char dupName[] = name.clone();
                                                  System.out.println(dupName == name);
        System.out.println(dupName[1] == name[1]);

        // Shallow copy
        char name1[][] = { { 'L', 'I', 'S', 'H' }, { 'L', 'I', 'S', 'H' } };
        char dupName1[][] = name1.clone();
        System.out.println(name1 == dupName1);
        System.out.println(name1[1][0] == dupName1[1][0]);

    }
}

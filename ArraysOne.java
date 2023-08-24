public class ArraysOne {
    public static void main(String[] args) {
        int[] myMark = { 65, 69, 55, 80, 35 };
        int total = 0;
        double avg;
        for (int score : myMark) {
            total += score;
        }
        int result = myMark.length;
        avg=((double) total/(double)total);
        System.out.println("Lishanth mark: "+total);
        System.out.println("AVerage is: "+avg);
    }
}

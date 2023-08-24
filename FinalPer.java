public class FinalPer {
    public static void main(String[] args) {
        String name, deg, clg;
        name = "Lishanth";
        deg = "BCA";
        clg = "Sri muthukumarn arts & science collage";
        int[] per = { 85, 80, 88, 86, 80, 90};
        double totaPer = 0;
        for (int mark : per) {
            totaPer += mark;
        }
        //int final = per.length;
        double avg = (totaPer)/6;
        System.out.println("Name ="+name);
        System.out.println("Course="+deg);
        System.out.println("Collage name is= "+clg);
        System.out.println("Avg= "+avg);
        
    }
}

//Remove white space
public class RomoveSpace {
    public static void main(String[] args) {
        String txt = "EDU BRIDGE LEARN ING";
        String outPut1 = txt.replaceAll(" ", "");
        String outPut2 = txt.replaceAll("\\s", "");
        System.out.println(outPut1);
        System.out.println(outPut2);
    }
}

import java.util.ArrayList;
import java.util.List;

class capgemini{
    String name;
    int id;
    String designation;
    double salary;
    String mode;
    public capgemini(String n,int i, String d, double s, String m){
        name=n;
        id=i;
        designation=d;
        salary=s;
        mode=m;
    }
}
public class ListArr{
    public static void main(String[] args) {
        List<capgemini> Emplist = new  ArrayList<capgemini>();
        capgemini  one = new capgemini("Lishanth",1,"Developer",5617.1,"Permanent");
        Emplist.add(one);
        for(capgemini c: Emplist)
        System.out.println(c.name);
    }
}

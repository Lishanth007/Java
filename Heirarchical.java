class TCS {

    double salary = 50000;
}

class Permanent extends TCS {

    double hike = 5000;

    void cal() {

        System.out.println(salary + hike);
    }
}

class Temporary extends TCS {

    double hike = 2000;

    void cal() {

        System.out.println(salary + hike);
    }
}

public class Heirarchical {

    public static void main(String[] args) {

        Permanent per = new Permanent();
        Temporary temp = new Temporary();
        System.out.println(per.hike);
        per.cal();
        System.out.println(temp.hike);
        temp.cal();

    }

}
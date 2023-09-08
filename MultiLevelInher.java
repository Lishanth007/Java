class EduBridge {
    void Edu(){
        System.out.println("EduBridge is a Platform");
    }
    void staff(){
        //System.out.println("EduBridge is a Platform");
    }
    void Student(){
        System.out.println("EduBridge is a Platform");
    }
}

class Teacher extends EduBridge {
    void staff() {
        System.out.println("Praisy mam is one of the staff of Edubridge");
    }
}

class Learns extends Teacher{
    void Student() {
        System.out.println("We are the Student joined in EduBridge");
    }
}

public class MultiLevelInher {
    public static void main(String[] args) {
        Learns L = new Learns();
        L.Edu();
        L.staff();
        L.Student();
    }
}

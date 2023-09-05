class Study {
    public void things() {

    }
}

class coreJava extends Study {
    public void things() {
        System.out.println("Learn Core java");
    }
}

class dataBase extends Study {
    public void things() {
        System.out.println("Learn Sql");
    }
}

class frontEnd extends Study {
    public void things() {
        System.out.println("Learn HTML, CSS, XML");
    }
}

class backEnd extends Study {
    public void things() {
        System.out.println("Learn Java and core");
    }
}

public class JavaFullStack {
    public static void main(String[] args) {
        Study s = new Study();
        s.things();
        coreJava cj = new coreJava();
        cj.things();
        dataBase db = new dataBase();
        db.things();
        frontEnd fe = new frontEnd();
        fe.things();
        backEnd be = new backEnd();
        be.things();
    }
}

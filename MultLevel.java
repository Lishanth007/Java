interface apple {
    void voice();
}

interface bell {
    void sound();
}

class cat implements apple, bell {
    public void voice() {
        System.out.println("Hello");
    }

    public void sound() {
        System.out.println("Ding Ding!!");
    }
}

public class MultLevel {
    public static void main(String[] args) {

        cat c = new cat();
        c.voice();
        c.sound();
    }
}

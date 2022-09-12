package pubsub;

public class Student implements ScheetHandler {

    private final String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void handle(ScheetEvent event) {
        System.out.printf("%s: \"Pfoooooei %s, dat is te erg\"%n", this.name, event.getSourceName());
    }
}

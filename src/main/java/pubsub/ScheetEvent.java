package pubsub;

public class ScheetEvent {
    private String sourceName;

    public ScheetEvent(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceName() {
        return this.sourceName;
    }
}

public abstract class Chordates {
    private final String type;
    protected String getType() {
        return type;
    }
    protected Chordates(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return getType();
    }
}

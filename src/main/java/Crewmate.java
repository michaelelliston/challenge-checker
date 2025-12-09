public class Crewmate {

    private final String name;
    private final boolean isTraitor;

    public Crewmate(String name, boolean isTraitor) {
        this.name = name;
        this.isTraitor = isTraitor;

    }

    public String getName() {
        return name;
    }

    public boolean isTraitor() {
        return isTraitor;
    }
}

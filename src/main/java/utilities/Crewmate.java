package utilities;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Crewmate other = (Crewmate) obj;

        return Objects.equals(this.getName(), other.getName()) &&
                Objects.equals(this.isTraitor(), other.isTraitor());
    }
}

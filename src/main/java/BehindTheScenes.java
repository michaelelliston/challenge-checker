import java.util.ArrayList;

public class BehindTheScenes {

    public static ArrayList<Person> initializePeople() {

        ArrayList<Person> people = new ArrayList<Person>();

        people.add(new Person("Mike", "the Magician", 30));
        people.add(new Person("Frank", "Franklin", 27));
        people.add(new Person("Dave", "Dykes", 173));
        people.add(new Person("Garlic", "Clove", 5020));
        people.add(new Person("Steve", "Minecraft", 16));

        return people;
    }

    public static ArrayList<Crewmate> initializeCrewmates() {

        ArrayList<Crewmate> crewmates = new ArrayList<Crewmate>();

        crewmates.add(new Crewmate("Mike", false));
        crewmates.add(new Crewmate("Frank", true));
        crewmates.add(new Crewmate("Dave", true));
        crewmates.add(new Crewmate("Garlic", false));
        crewmates.add(new Crewmate("Steve", false));

        return crewmates;
    }
}

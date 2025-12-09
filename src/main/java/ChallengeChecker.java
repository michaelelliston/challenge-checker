import java.util.ArrayList;

public class ChallengeChecker {

    public ArrayList<Person> challengeOneAnswer() {

        ArrayList<Person> unfilteredPeople = BehindTheScenes.initializePeople();
        ArrayList<Person> filteredPeople = new ArrayList<Person>();

        for (Person p : unfilteredPeople) {
            if (p.getAge() % 2 == 0) {
                filteredPeople.add(p);
            }
        }

        return filteredPeople;
    }

    public boolean challengeOneVerificationSuccess() {
        System.out.println("\nSuccess! Good work.\n");
        return true;
    }

    public boolean challengeOneVerificationFailure() {
        System.out.println("\nThis did not result in a match! Try again.\n");
        return false;
    }

    public ArrayList<String> challengeTwoAnswer() {

        ArrayList<Person> people = BehindTheScenes.initializePeople();
        ArrayList<String> fullNames = new ArrayList<String>();

        for (Person p : people) {
            String fullName = p.getFirstName() + " " + p.getLastName();
            fullNames.add(fullName);
        }

        return fullNames;
    }

    public boolean challengeTwoVerificationSuccess() {
        System.out.println("\nSuccess! Good work.\n");
        return true;
    }

    public boolean challengeTwoVerificationFailure() {
        System.out.println("\nThis did not result in a match! Try again.\n");
        return false;
    }

    public ArrayList<Crewmate> challengeThreeAnswer() {

        ArrayList<Crewmate> unfilteredCrewmates = BehindTheScenes.initializeCrewmates();
        ArrayList<Crewmate> filteredCrewmates = new ArrayList<Crewmate>();

        for (Crewmate c : unfilteredCrewmates) {
            if (c.isTraitor()) {
                filteredCrewmates.add(c);
            }
        }

        return filteredCrewmates;
    }

    public boolean challengeThreeVerificationSuccess() {
        System.out.println("\nSuccess! Good work.\n");
        return true;
    }

    public boolean challengeThreeVerificationFailure() {
        System.out.println("\nThis did not result in a match! Try again.\n");
        return false;
    }
}

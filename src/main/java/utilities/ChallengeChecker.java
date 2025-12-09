package utilities;

import java.util.ArrayList;

public class ChallengeChecker {

    public static ArrayList<Person> challengeOneAnswer() {

        ArrayList<Person> unfilteredPeople = BehindTheScenes.initializePeople();
        ArrayList<Person> filteredPeople = new ArrayList<Person>();

        for (Person p : unfilteredPeople) {
            if (p.getAge() % 2 == 0) {
                filteredPeople.add(p);
            }
        }

        return filteredPeople;
    }

    public static boolean challengeOneVerificationSuccess() {
        System.out.println("\nSuccess! Good work.\n");
        return true;
    }

    public static boolean challengeOneVerificationFailure() {
        System.out.println("\nThis did not result in a match! Try again.\n");
        return false;
    }

    public static ArrayList<String> challengeTwoAnswer() {

        ArrayList<Person> people = BehindTheScenes.initializePeople();
        ArrayList<String> fullNames = new ArrayList<String>();

        for (Person p : people) {
            String fullName = p.getFirstName() + " " + p.getLastName();
            fullNames.add(fullName);
        }

        return fullNames;
    }

    public static boolean challengeTwoVerificationSuccess() {
        System.out.println("\nSuccess! Good work.\n");
        return true;
    }

    public static boolean challengeTwoVerificationFailure() {
        System.out.println("\nThis did not result in a match! Try again.\n");
        return false;
    }

    public static ArrayList<Crewmate> challengeThreeAnswer() {

        ArrayList<Crewmate> unfilteredCrewmates = BehindTheScenes.initializeCrewmates();
        ArrayList<Crewmate> filteredCrewmates = new ArrayList<Crewmate>();

        for (Crewmate c : unfilteredCrewmates) {
            if (c.isTraitor()) {
                filteredCrewmates.add(c);
            }
        }

        return filteredCrewmates;
    }

    public static boolean challengeThreeVerificationSuccess() {
        System.out.println("\nSuccess! Good work.\n");
        return true;
    }

    public static boolean challengeThreeVerificationFailure() {
        System.out.println("\nThis did not result in a match! Try again.\n");
        return false;
    }
}

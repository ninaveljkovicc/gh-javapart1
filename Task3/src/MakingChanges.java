public class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String tempName = p1.name;
        p1.name = p2.name;
        p2.name = tempName;

        int tempAge = p1.age;
        p1.age = p2.age;
        p2.age = tempAge;

    }
}

public class Main {
    public static void main(String[] args){
        Person p1 = new Person("Nina", 25);
        Person p2 = new Person("Andjela", 30);

        System.out.println("Before change:");
        System.out.println("P1 - Name: " + p1.name + ", Age: " + p1.age);
        System.out.println("P2 - Name: " + p2.name + ", Age: " + p2.age + "\n");

        MakingChanges.changeIdentities(p1, p2);

        System.out.println("After change:");
        System.out.println("P1 - Name: " + p1.name + ", Age: " + p1.age);
        System.out.println("P2 - Name: " + p2.name + ", Age: " + p2.age);
    }
}

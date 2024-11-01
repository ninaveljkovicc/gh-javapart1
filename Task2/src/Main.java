public class Main {
    public static void main(String[] args){
        String stringToReverse = "I'm going to go to school today morning.";

        System.out.println(stringToReverse);
        System.out.println("StringBuilder: " + ReverseStringBuilder.reverse(stringToReverse));
        System.out.println("Recursion: " + ReverseRecursion.reverse(stringToReverse));
        System.out.println("Char Array: " + ReverseCharArray.reverse(stringToReverse));
        System.out.println("Loop: " + ReverseLoop.reverse(stringToReverse));

    }
}

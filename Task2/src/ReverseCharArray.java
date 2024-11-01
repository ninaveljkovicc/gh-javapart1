public class ReverseCharArray {
    public static String reverse(String s){

        char[] charArray = s.toCharArray();

        int first = 0;
        int last = s.length() - 1;

        while(first < last){

            char temp = charArray[first];
            charArray[first] = charArray[last];
            charArray[last] = temp;

            first++;
            last--;
        }
        String str = String.valueOf(charArray);
        return str;
    }
}

package LC;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o',};
        System.out.println(("original is " +Arrays.toString(s)));


        if (s.length == 0)
            System.out.println("null");

        for (int i = 0; i < (s.length/2); i++) {
            char temp  = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }

        System.out.println(("reversed is " +Arrays.toString(s)));
    }
}

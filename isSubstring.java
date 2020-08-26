package LC;
import java.lang.String;

public class isSubstring {


    public static void main(String[] args) {
    }
    public boolean isSubsequence(String s, String t){
             s = "america";
             t = "arc";
            int index_s = 0;
            int index_t = 0;
            while (index_t < t.length()) {
                if (s.charAt(index_s) == t.charAt(index_t)) {
                    index_s++;
                    if (index_s == s.length())
                        return true;
                }
                    index_t++;
                }
                return false;


            }
        }



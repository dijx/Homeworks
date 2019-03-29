package Week1;

import java.lang.reflect.Array;
import java.util.Arrays;
import Week1.*;

public class Anagrams {

    public static void main(String[] args) {

        System.out.println(isAnagram("dabc","abcd"));
          }
    public static boolean isAnagram(String a, String b) {
        char [] aArr=a.toLowerCase().toCharArray();
        char [] bArr=b.toLowerCase().toCharArray();
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        if (Arrays.equals(aArr, bArr)) {
          return true;
        } else {
            return false;
        }
    }
}

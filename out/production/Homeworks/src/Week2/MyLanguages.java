/*
Your task
You are given a dictionary/hash/object containing some languages and your test results in the given languages.
Return the list of languages where your test score is at least 60, in descending order of the results.

Note: There will be no duplicate values.

Examples
{"Java" => 10, "Ruby" => 80, "Python" => 65}  --> ["Ruby", "Python"]
{"Hindi" => 60, "Dutch" => 93, "Greek" => 71} --> ["Dutch", "Greek", "Hindi"]
{"C++" => 50, "ASM" => 10, "Haskell" => 20}   --> []
 */

package Week2;

import java.util.*;
import java.util.Map.Entry;
import java.util.Arrays;


public class MyLanguages {

    public static void main(String[] args) {

        final Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 10);
        map1.put("Ruby", 80);
        map1.put("Python", 65);
        map1.put("F#", 65);
        map1.put("C#", 65);

        System.out.println((myLanguages(map1)));

    }

        Comparator<Entry<String, Integer>> valueComparator = (e1, e2) -> {
            Integer v1 = e1.getValue();
            Integer v2 = e2.getValue();
            return v1-v2;
        };




    public static List<String> myLanguages(final Map<String, Integer> results) {

            final int minimalScore = 60;
            List<String> outRes = new ArrayList<>();
            List<Integer> tempOut = new ArrayList<>();

            Set<Entry<String, Integer>> entries = results.entrySet();

            for (Entry<String, Integer> entry: entries) {
//                System.out.println((entry.getKey() + " " + entry.getValue()));
                if ((Integer)entry.getValue()>=minimalScore) {
                    tempOut.add((Integer)entry.getValue());
                }
            }


        Set<Integer> newTempOut = new HashSet<>();
        newTempOut.addAll(tempOut);
        Collections.reverse(Arrays.asList(newTempOut));

        System.out.println(newTempOut);


        for (Integer integer : newTempOut) {
            for (Entry<String, Integer> entry : entries) {
//                System.out.println((entry.getKey() + " " + entry.getValue()));
                if ((Integer) entry.getValue() == integer) {
                    outRes.add((String) entry.getKey());
                }
            }
        }


/*
            //inny sposob iteracji po hashtable
            Iterator iterator = results.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry pair = (Map.Entry)iterator.next();
                System.out.println((pair.getKey() + " " + pair.getValue()));
                if ( (Integer)pair.getValue() >= minimalScore) {
                     outRes.add((String)pair.getKey());
                }
            }
            Collections.sort(outRes);
            Collections.reverse(outRes);
            return outRes;

*/
        return outRes;
        }
}

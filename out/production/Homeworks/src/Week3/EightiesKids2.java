/*
Late last night in the Tanner household, ALF was repairing his spaceship so he might get back to Melmac.
Unfortunately for him, he forgot to put on the parking brake, and the spaceship took off during repair. Now it's hovering in space.

ALF has the technology to bring the spaceship home if he can lock on to its location.

Given a map:

..........
..........
..........
.......X..
..........
..........
The map will be given in the form of a string with \n separating new lines. The bottom left of the map is [0, 0]. X is ALF's spaceship.

In this expample:

findSpaceship(map) => "[7, 2]"
If you cannot find the spaceship, the result should be

"Spaceship lost forever."
 */

package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EightiesKids2 {

    public static String findSpaceship(String map) {


        List<String> list = new ArrayList<>();
        for (String s : map.split("\n")) {
            list.add(s);
        }
        Collections.reverse(list);


         Integer y = null;
         Integer x = null;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).contains("X")) {
                 y = i;
                 String tmpStr = list.get(i);
                for (int j = 0; j < tmpStr.length(); j++) {
                    if (((Character)tmpStr.charAt(j)).equals('X')) {
                         x = j;
                    }
                }
            }
        }
        String result;

        if (x !=null && y!=null) {
             result = "["+x+","+y+"]";
        } else {
             result = "Spaceship lost forever.";
        }

    return result;
    }

    public static void main(String[] args) {

        String test = "..\nX.";

        System.out.println(findSpaceship(test));
    }
}
package Week2;
import java.util.Collections;
import java.util.List;


public class SortTextbooks {

    public static List<String> sort(List<String> textbooks) {

            Collections.sort(textbooks, String::compareToIgnoreCase);
        return textbooks;
    }

}

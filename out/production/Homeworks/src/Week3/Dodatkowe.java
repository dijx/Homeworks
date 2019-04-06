/*
Dane są słowa: "hello", "academy", "java", "junior"
        Stwórz listę liter występujących w tych słowach, bez powtórzeń
        Zwróć liczbę tych liter
        Wykorzystaj strumienie (Stream, Java 8) - max 2 bloki stream
        Rozwiązanie wyślij razem z rozwiązaniem w/w zadania
        Bonus punktowy +1p.p. do wyniku końcowego kursu
*/

package Week3;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dodatkowe {

    static List<String> result = new ArrayList<>();

    public static int literki(String [] litIn) {

        return (
            Arrays.stream(litIn)
                    .flatMap(str -> Arrays.stream(str.split("")))
                    .sorted()
                    .distinct()
                    .peek(a -> result.add(a))
                    .collect(Collectors.toList())  //lub .collect(Collectors.counting()) i return bez size() - nie wiem jak rozumieć "utwórz listę" listę
                ).size();
    }

    public static void main(String[] args) {
        String[] test = new String[]{"hello", "academy", "java", "junior"};

        System.out.println(literki(test));

        System.out.println(result);
    }
}

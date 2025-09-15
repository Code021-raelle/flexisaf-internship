import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList(
            "hello", "world", "java", "remove", "iterator", "remove", "example"
        ));

        System.out.println("Original list: " + words);

        // Use Iterator to loop through and remove a specific word
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();

            // Remove all occurrences of the word "remove"
            if (word.equalsIgnoreCase("remove") || word.contains("o")) {
                iterator.remove();
            }

        }

        System.out.println("Modified list: " + words);
    }
}

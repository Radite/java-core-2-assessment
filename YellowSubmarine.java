import java.util.*;

public class YellowSubmarine {
    public static void main(String[] args) {
        String lyrics = """
                In the town where I was born
                Lived a man who sailed to sea
                And he told us of his life
                In the land of submarines
                So we sailed on to the sun
                'Til we found the sea of green
                And we lived beneath the waves
                In our yellow submarine
                We all live in a yellow submarine
                Yellow submarine, yellow submarine
                We all live in a yellow submarine
                Yellow submarine, yellow submarine
                And our friends are all aboard
                Many more of them live next door
                And the band begins to play
                We all live in a yellow submarine
                Yellow submarine, yellow submarine
                We all live in a yellow submarine
                Yellow submarine, yellow submarine
                Full steam ahead, Mister Boatswain, full steam ahead
                Full steam ahead it is, Sergeant
                Cut the cable! Drop the cable!
                Aye sir, aye
                Captain! Captain!
                As we live a life of ease (a life of ease)
                Every one of us (every one of us), has all we need (has all we need)
                Sky of blue (sky of blue) and sea of green (sea of green)
                In our yellow (in our yellow) submarine (submarine, ha-ha)
                We all live in a yellow submarine
                Yellow submarine, yellow submarine
                We all live in a yellow submarine
                Yellow submarine, yellow submarine
                We all live in a yellow submarine
                Yellow submarine, yellow submarine
                We all live in a yellow submarine
                Yellow submarine, yellow submarine
                """;

        // Remove commas and newlines and convert to lowercase
        String regexLyrics = lyrics.replaceAll("[,\n()!]", " ").toLowerCase();

        // Create list of words
        List<String> wordsList = new ArrayList<>(Arrays.asList(regexLyrics.split("\\s+")));

        // Count Occurrence of each word
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : wordsList) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // Print word counts
        System.out.println("Word Counts:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Remove duplicate words using a set
        Set<String> uniqueWordsSet = new HashSet<>(wordsList);
        List<String> uniqueWordsList = new ArrayList<>(uniqueWordsSet);

        // Print unique words
        System.out.println("\nUnique Words:");
        for (String word : uniqueWordsList) {
            System.out.println(word);
        }

        // Sort words by their length
        uniqueWordsList.sort(Comparator.comparingInt(String::length));

        // Print sorted words
        System.out.println("\nSorted Words by Length:");
        for (String word : uniqueWordsList) {
            System.out.println(word);
        }

    }
}
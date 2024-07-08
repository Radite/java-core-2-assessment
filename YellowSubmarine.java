import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

class BeatlesException extends Exception {
    public BeatlesException(String message) {
        super(message);
    }
}

public class YellowSubmarine {
    private static final String FILENAME = "beatles_yellow_submarine.txt";

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

        // Save song to file
        saveToFile(lyrics);

        // Read song from file
        String readLyrics = readFromFile();

        // Verify if a random string can be found in the song
        String randomString = "submarine";
        try {
            verifyStringInSong(readLyrics, randomString);
        } catch (BeatlesException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void saveToFile(String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            writer.write(text);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    public static String readFromFile() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        return content.toString();
    }

    public static void verifyStringInSong(String song, String randomString) throws BeatlesException {
        if (!song.contains(randomString)) {
            throw new BeatlesException(randomString + " was not found in the song.");
        } else {
            System.out.println(randomString + " was found in the song.");
        }
    }
}

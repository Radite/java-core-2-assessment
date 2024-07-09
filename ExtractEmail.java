import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static void main(String[] args) {
        String inputString = "test 2667843 (test_email@griddynamics.com) test 67483 some string";
        String email = extractEmail(inputString);
        System.out.println("Email: " + email);
    }

    public static String extractEmail(String inputString) {
        String emailPattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(inputString);

        if (matcher.find()) {
            return matcher.group();
        }
        return null; // return null if no email is found
    }
}

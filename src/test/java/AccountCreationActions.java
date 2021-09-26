import java.util.Random;

public class AccountCreationActions {
    public static String getEmail() {
        Random random = new Random();
        String allowedCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        char[] randomEmailPrefix = new char[15];
        char[] randomEmailSuffix = new char[5];
        for (int i = 0; i < randomEmailPrefix.length; i++) {
            char randomAllowedCharacter = allowedCharacters.charAt(random.nextInt(allowedCharacters.length()));
            randomEmailPrefix[i] = randomAllowedCharacter;
        }
        for (int i = 0; i < randomEmailSuffix.length; i++) {
            char randomAllowedCharacter = allowedCharacters.charAt(random.nextInt(allowedCharacters.length()));
            randomEmailSuffix[i] = randomAllowedCharacter;
        }
        return String.valueOf(randomEmailPrefix) + "@" + String.valueOf(randomEmailSuffix) + ".com";
    }
}
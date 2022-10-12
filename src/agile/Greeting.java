package agile;

import java.util.Arrays;
import java.util.ArrayList;

import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.List;

/**
 *
 * @author Neil Taylor (nst@aber.ac.uk)
 */
public class Greeting {

    private String generalGreeting;

    private String defaultName;

    /**
     * Initialises the general values that are used during the process to
     * create the greeting.
     *
     * @param generalGreeting The greeting that is shown at the start of the message, e.g. "Hello".
     * @param defaultName The default greeting to be used if no names are provided.
     */
    public Greeting(String generalGreeting, String defaultName) {
        this.generalGreeting = generalGreeting;
        this.defaultName = defaultName;
    }

    /**
     *
     * @param names An array of names
     * @return A string that has the requirements for processing the message.
     */
    public String greet(String[] names) {

        if(names == null) {
            return MessageFormat.format("{0}, {1}", generalGreeting, defaultName);
        }

        if(names.length == 1) {

            if(checkCharacters(names[0], CharacterStyle.UPPER_CASE)) {
                return MessageFormat.format("{0}, {1}", generalGreeting.toUpperCase(), names[0]);
            }

            if(checkCharacters(names[0], CharacterStyle.LOWER_CASE)) {
                return MessageFormat.format("{0}, {1}", generalGreeting.toLowerCase(), names[0]);
            }

            return MessageFormat.format("{0}, {1}", generalGreeting, names[0]);
        }

        ArrayList<String> upperCaseNames = new ArrayList<>();
        ArrayList<String> otherNames = new ArrayList<>();

        for (String name : names) {
            if(checkCharacters(name, CharacterStyle.UPPER_CASE)) {
                upperCaseNames.add(name);
            }
            else {
                otherNames.add(name);
            }
        }

        StringBuilder builder = new StringBuilder();
        builder.append(generalGreeting);
        for(int i = 0; i < (otherNames.size() - 1); i++) {
            builder.append(", ");
            builder.append(otherNames.get(i));
        }

        if(otherNames.size() > 1) {
            builder.append(" and ");
        }
        else {
            builder.append(", ");
        }

        builder.append(otherNames.get(otherNames.size() - 1));
        builder.append(".");

        if(upperCaseNames.size() > 0) {
            builder.append(" AND HELLO");
            for(int i = 0; i < (upperCaseNames.size()); i++) {
                builder.append(", ");
                builder.append(upperCaseNames.get(i));
            }
            builder.append("!");
        }

        return builder.toString();
    }

    public boolean checkCharacters(String value, CharacterStyle style) {

        for (char character : value.toCharArray()) {

            if(style == CharacterStyle.LOWER_CASE) {
                if(!Character.isLowerCase(character)) {
                    return false;
                }
            }
            else if(style == CharacterStyle.UPPER_CASE) {
                if (!Character.isUpperCase(character)) {
                    return false;
                }
            }
        }

        return true;
    }
}

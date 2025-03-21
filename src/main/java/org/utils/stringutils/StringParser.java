package org.utils.stringutils;

import org.utils.exceptions.InvalidStringInputException;

import java.util.ArrayList;
import java.util.Arrays;

public class StringParser {

    /**
     * Splits the string based on the separator provided as parameter.
     *
     * @param stringToSplit the string to be split
     * @param separator     a string representing the separator that you want to split the string on
     * @return ArrayList of strings
     */
    public ArrayList<String> splitString(String stringToSplit, String separator)
            throws InvalidStringInputException {

        if (stringToSplit == null) {
            throw new InvalidStringInputException();
        }
        ArrayList<String> stringParts = new ArrayList<>();
        stringParts.addAll(Arrays.asList(stringToSplit.split(separator)));

        return stringParts;
    }

    /**
     * Removes additional spaces in between strings
     * A    Quick   Brown    Fox --> A Quick Brown Fox
     *
     * @param stringToTrim the string to be trimmed
     * @return a string with single space between words
     * @throws org.utils.exceptions.InvalidStringInputException defined in the exception package
     */
    public String trimString(String stringToTrim) throws InvalidStringInputException {
        if (stringToTrim == null) {
            throw new InvalidStringInputException();
        }
        String trimmedString = stringToTrim.replaceAll("\\s+", " ");
        return trimmedString;
    }
}

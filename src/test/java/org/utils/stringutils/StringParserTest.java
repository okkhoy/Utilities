package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringParserTest {

    @Test
    // Test method naming
    // methodBeingtested_conditionBeingTested_expectedOutcome
    // happy path
    void splitString_oneSeparator_expectTwoParts() throws InvalidStringInputException { // happy path
        StringParser sp = new StringParser();
        String separator = "\\|"; //escaping using \\
        String inputString = "Hello|World";
        ArrayList<String> parts = sp.splitString(inputString, separator);
        assertEquals(2, parts.size());
    }

    @Test
    // null string
    // splitString_nullInput_expectException
    void splitString_nullInput_expectException() throws InvalidStringInputException {
        StringParser sp = new StringParser();
        String separator = "\\|"; //escaping using \\
        String inputString = null;
        // ArrayList<String> parts = sp.splitString(inputString, separator);
        // assertEquals(0, parts.size());
        assertThrows(InvalidStringInputException.class,
                () -> sp.splitString(inputString, separator));

    }

    @Test
    void trimString_validInput_expectTrimmed() throws InvalidStringInputException {
        StringParser sp = new StringParser();
        String inputString = "This    string    contains more    spaces     than    needed";
        assertEquals("This string contains more spaces than needed", sp.trimString(inputString));
    }
}


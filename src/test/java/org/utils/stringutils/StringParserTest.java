package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import static org.junit.jupiter.api.Assertions.*;

class StringParserTest {

    @Test
    void trimString_validInput_expectTrimmed() throws InvalidStringInputException {
        StringParser sp = new StringParser();
        String inputString = "This    string    contains more    spaces     than    needed";
        assertEquals("This string contains more spaces than needed", sp.trimString(inputString));
    }
}
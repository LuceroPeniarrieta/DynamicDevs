package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManagerTest {

    @Test
    public void validateTheLetterIsReplacementByTheNextOne()
    {
        StringManager stringManager = new StringManager();
        String expectedValue = "bcdef";

        String actualValue = stringManager.convert("abcde");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void validateZIsReplacementByA()
    {
        StringManager stringManager = new StringManager();
        String expectedValue = "bcdaef";

        String actualValue = stringManager.convert("abczde");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void validateLettersAreReplacementWhenAreMixedByNumbers()
    {
        StringManager stringManager = new StringManager();
        String expectedValue = "123ij7bcd9";

        String actualValue = stringManager.convert("123hi7abc9");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void validateLettersAreReplacementWhenAreMixedBySpecialCharacters()
    {
        StringManager stringManager = new StringManager();
        String expectedValue = "**dbtb";

        String actualValue = stringManager.convert("**casa");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void validateLettersAreReplacementWhenAreMixed()
    {
        StringManager stringManager = new StringManager();
        String expectedValue = "123 bcde*3";

        String actualValue = stringManager.convert("123 abcd*3");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void validateLettersAreReplacementWhenTheyAreInUppercase()
    {
        StringManager stringManager = new StringManager();
        String expectedValue = "**Dbtb";

        String actualValue = stringManager.convert("**Casa");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void validateNotReplacementWhenLettersAreNotPresent()
    {
        StringManager stringManager = new StringManager();
        String expectedValue = "123***";

        String actualValue = stringManager.convert("123***");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void validateNotReplacementWhenStringEmpty()
    {
        StringManager stringManager = new StringManager();
        String expectedValue = " ";

        String actualValue = stringManager.convert(" ");

        assertEquals(expectedValue, actualValue);
    }
}

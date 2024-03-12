package refi;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.regex.*;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class BaseTest
{
    protected Refi refi = new Refi();
    
    public void assertRegexMatchesText(String regex, String text)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text); 
        assertTrue(String.format("Expected %s to match %s", text, regex), matcher.matches());
    }
    
    public void assertRegexDoesntMatchText(String regex, String text)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text); 
        assertFalse(String.format("Expected %s to not match %s", text, regex), matcher.matches());
    }
    
    public void assertRegexIs(String expected, String actual)
    {
        assertEquals(expected, actual, "Wrong Regular Expression created;");
    }


}
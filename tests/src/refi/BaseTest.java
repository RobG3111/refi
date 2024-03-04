package refi;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.regex.*;

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


}
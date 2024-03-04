package refi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFlags extends BaseTest
{

    @Test
    void testCaseInsens()
    {
        String expression = refi.translate("`a` caseIns `a`");
        assertEquals("a(?i)a", expression);
        assertRegexMatchesText(expression, "aa");
        assertRegexMatchesText(expression, "aA");
        assertRegexDoesntMatchText(expression, "AA"); 
    }

    @Test
    void testFlagsVerb()
    {
        String expression = refi.translate("`a` flags { caseIns } `a`");
        assertEquals("a(?i)a", expression);
        assertRegexMatchesText(expression, "aa");
        assertRegexMatchesText(expression, "aA");
        assertRegexDoesntMatchText(expression, "AA"); 
    }
    
    @Test
    void testFlagsVerbOff()
    {
        String expression = refi.translate("`a` flags { caseIns } `a` flags { caseInsOff} `W`");
        assertEquals("a(?i)a(?-i)W", expression);
        assertRegexMatchesText(expression, "aaW");
        assertRegexMatchesText(expression, "aAW");
        assertRegexDoesntMatchText(expression, "aaw"); 
    }
}

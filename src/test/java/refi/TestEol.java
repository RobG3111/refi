package refi;

import org.junit.jupiter.api.Test;

class TestEol extends BaseTest
{

    @Test
    void testEolOnly()
    {
        Refi refi = new Refi();
        String expression = refi.toRegEx("`abc` eol");
        assertRegexIs("abc$", expression);
        assertRegexMatchesText(expression, "abc");
        assertRegexDoesntMatchText(expression, "abcd");
    }
    
    @Test
    void testBolAndEol()
    {
        Refi refi = new Refi();
        String expression = refi.toRegEx("bol `abc` eol");
        assertRegexIs("^abc$", expression);
        assertRegexMatchesText(expression, "abc");
        assertRegexDoesntMatchText(expression, " abc ");
    }
}

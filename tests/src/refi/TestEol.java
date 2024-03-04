package refi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEol extends BaseTest
{

    @Test
    void testEolOnly()
    {
        Refi refi = new Refi();
        String expression = refi.translate("`abc` eol");
        assertEquals("abc$", expression);
        assertRegexMatchesText(expression, "abc");
        assertRegexDoesntMatchText(expression, "abcd");
    }
    
    @Test
    void testBolAndEol()
    {
        Refi refi = new Refi();
        String expression = refi.translate("bol `abc` eol");
        assertEquals("^abc$", expression);
        assertRegexMatchesText(expression, "abc");
        assertRegexDoesntMatchText(expression, " abc ");
    }
}

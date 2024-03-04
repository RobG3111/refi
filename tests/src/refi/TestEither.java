package refi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEither extends BaseTest
{

    @Test
    void testEither()
    {

        String expression = refi.translate("`a` either{`b`, `c`} `d`");
        assertEquals("a[bc]d", expression);
        assertRegexMatchesText(expression, "abd");
        assertRegexMatchesText(expression, "acd");
        assertRegexDoesntMatchText(expression, "ad");
        assertRegexDoesntMatchText(expression, "amd");      
    }
    
    @Test
    void testEitherComplex()
    {
        String expression = refi.translate("`a` either{`b`, `c`, `d`} `e`");
        assertEquals("a[bcd]e", expression);
        assertRegexMatchesText(expression, "abe");
        assertRegexMatchesText(expression, "ace");
        assertRegexMatchesText(expression, "ade");
        assertRegexDoesntMatchText(expression, "ad");
        assertRegexDoesntMatchText(expression, "amd");      
    }


}

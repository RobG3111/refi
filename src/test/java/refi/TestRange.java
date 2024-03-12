package refi;

import org.junit.jupiter.api.Test;

class TestRange extends BaseTest
{

    @Test
    void testSimple()
    {
        String expression = refi.toRegEx("range{`a`:`c`}");
        assertRegexIs("[a-c]", expression);
        assertRegexMatchesText(expression, "a");
        assertRegexMatchesText(expression, "c");
        assertRegexDoesntMatchText(expression, "f");
        assertRegexDoesntMatchText(expression, "2");      
    }
    
    @Test
    void testComplex()
    {
        String expression = refi.toRegEx("range{`a`:`c`, `6`:`9`}");
        assertRegexIs("[a-c6-9]", expression);
        assertRegexMatchesText(expression, "a");
        assertRegexMatchesText(expression, "7");
        assertRegexDoesntMatchText(expression, "f");
        assertRegexDoesntMatchText(expression, "2");      
    }

}

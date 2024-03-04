package refi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestOr extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.translate("or{ `r` | digit}");
        assertEquals("r|\\d", expression);
        assertRegexMatchesText(expression, "r");
        assertRegexMatchesText(expression, "4");
        assertRegexDoesntMatchText(expression, "abcd");
     }
    
    @Test
    void testOrComplex()
    {
        String expression = refi.translate("or{ (wild `a`) | digit}");
        assertEquals("(.a)|\\d", expression);
        assertRegexMatchesText(expression, "wa");
        assertRegexMatchesText(expression, "4");
        assertRegexDoesntMatchText(expression, "abcd");
     }

}

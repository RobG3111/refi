package refi;

import org.junit.jupiter.api.Test;

class TestOr extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.toRegEx("or{ `r` | digit}");
        assertRegexIs("r|\\d", expression);
        assertRegexMatchesText(expression, "r");
        assertRegexMatchesText(expression, "4");
        assertRegexDoesntMatchText(expression, "abcd");
     }
    
    @Test
    void testOrComplex()
    {
        String expression = refi.toRegEx("or{ (wild `a`) | digit}");
        assertRegexIs("(.a)|\\d", expression);
        assertRegexMatchesText(expression, "wa");
        assertRegexMatchesText(expression, "4");
        assertRegexDoesntMatchText(expression, "abcd");
     }

}

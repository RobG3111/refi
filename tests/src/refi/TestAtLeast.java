package refi;

import org.junit.jupiter.api.Test;

class TestAtLeast extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.toRegEx("atleast{2, `q`}");
        assertRegexIs("q{2,}", expression);;
        assertRegexMatchesText(expression, "qq");
        assertRegexMatchesText(expression, "qqqq");
        assertRegexDoesntMatchText(expression, "q");
    }
    
    @Test
    void testComplex()
    {
        String expression = refi.toRegEx("atleast{2, digit}");
        assertRegexIs("\\d{2,}", expression);;
        assertRegexMatchesText(expression, "12");
        assertRegexMatchesText(expression, "1345");
        assertRegexDoesntMatchText(expression, "0");
    }


}

package refi;

import org.junit.jupiter.api.Test;

class TestOptional extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.toRegEx("`a` optional{`b`} `c`");
        assertRegexIs("ab?c", expression);
        assertRegexMatchesText(expression, "abc");
        assertRegexMatchesText(expression, "ac");
        assertRegexDoesntMatchText(expression, "abbc"); 
    }
    
    @Test
    void testComplex()
    {
        String expression = refi.toRegEx("`a` optional{ (`b` digit) } `c`");
        assertRegexIs("a(b\\d)?c", expression);
        assertRegexMatchesText(expression, "ab3c");
        assertRegexMatchesText(expression, "ac");
        assertRegexDoesntMatchText(expression, "abbc"); 
    }


}

package refi;

import org.junit.jupiter.api.Test;

class TestFlagged extends BaseTest
{

    @Test
    void testFlagged()
    {
        String expression = refi.toRegEx("`a` flagged { caseIns , `b` } `c`");
        assertRegexIs("a(?i:b)c", expression);
        assertRegexMatchesText(expression, "aBc");
        assertRegexMatchesText(expression, "abc");
        assertRegexDoesntMatchText(expression, "Axe"); 
    }
    
    @Test
    void testFlaggedComplex()
    {
        String expression = refi.toRegEx("`a` flagged { caseIns , (`b` digit) } `c`");
        assertRegexIs("a(?i:(b\\d))c", expression);
        assertRegexMatchesText(expression, "aB1c");
        assertRegexMatchesText(expression, "ab1c");
        assertRegexDoesntMatchText(expression, "Ax1e"); 
    }
}

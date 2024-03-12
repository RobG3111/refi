package refi;

import org.junit.jupiter.api.Test;

class TestBetween extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.toRegEx("between{2, 4, `q`}");
        assertRegexIs("q{2,4}", expression);;
        assertRegexMatchesText(expression, "qq");
        assertRegexMatchesText(expression, "qqq");
        assertRegexMatchesText(expression, "qqqq");
        assertRegexDoesntMatchText(expression, "q");    
        assertRegexDoesntMatchText(expression, "qqqqq");    
    }
    
    @Test
    void testExpression()
    {
        String expression = refi.toRegEx("between{2, 4, (digit wild)}");
        assertRegexIs("(\\d.){2,4}", expression);;
        assertRegexMatchesText(expression, "2w3e");
        assertRegexMatchesText(expression, "1a3t5j");
        assertRegexMatchesText(expression, "7u4r5c2v");
        assertRegexDoesntMatchText(expression, "1f");    
        assertRegexDoesntMatchText(expression, "2r5c6b7m9l");    
    }

}

package refi;

import org.junit.jupiter.api.Test;

class TestExactly extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.toRegEx("exactly{7, `q`}");
        assertRegexIs("q{7}", expression);
        assertRegexMatchesText(expression, "qqqqqqq");
        assertRegexDoesntMatchText(expression, "qqqqqq");
        assertRegexDoesntMatchText(expression, "qqqqqqqq");
    }

}

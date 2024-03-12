package refi;

import org.junit.jupiter.api.Test;

class TestNonDigit extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.toRegEx("nondigit");
        assertRegexIs("\\D", expression);
        assertRegexMatchesText(expression, "x");
        assertRegexDoesntMatchText(expression, "4");
        
    }

}

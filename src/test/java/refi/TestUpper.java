package refi;

import org.junit.jupiter.api.Test;

class TestUpper extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.toRegEx("upper");
        assertRegexIs("\\p{Upper}", expression);
        assertRegexMatchesText(expression, "A");
        assertRegexDoesntMatchText(expression, "a");
    }

}

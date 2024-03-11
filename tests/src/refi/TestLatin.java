package refi;

import org.junit.jupiter.api.Test;

class TestLatin extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.toRegEx("latin");
        assertRegexIs("\\p{IsLatin}", expression);
        assertRegexMatchesText(expression, "A");
        assertRegexDoesntMatchText(expression, "\\u0393");
    }

}

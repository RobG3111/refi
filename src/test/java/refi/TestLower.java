package refi;

import org.junit.jupiter.api.Test;

class TestLower extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.toRegEx("lower");
        assertRegexIs("\\p{Lower}", expression);
        assertRegexMatchesText(expression, "a");
        assertRegexDoesntMatchText(expression, "A");
    }

}

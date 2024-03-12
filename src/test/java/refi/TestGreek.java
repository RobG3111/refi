package refi;

import org.junit.jupiter.api.Test;

class TestGreek extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.toRegEx("greek");
        assertRegexIs("\\p{InGreek}", expression);
        assertRegexMatchesText(expression, "\u0393");
        assertRegexDoesntMatchText(expression, "4");
        
    }

}

package refi;

import org.junit.jupiter.api.Test;

class TestBol  extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.toRegEx("bol `123`");
        assertRegexIs("^123", expression);
        assertRegexMatchesText(expression, "123");
        assertRegexDoesntMatchText(expression, "4123");    
    }

}
    
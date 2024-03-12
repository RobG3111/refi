package refi;

import org.junit.jupiter.api.Test;

class TestUnion extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.toRegEx("union{`a`:`c` , `5`:`9`}");
        assertRegexIs("[a-c[5-9]]", expression);
        assertRegexMatchesText(expression, "a");
        assertRegexMatchesText(expression, "6");
        assertRegexDoesntMatchText(expression, "f");
        assertRegexDoesntMatchText(expression, "2");      
    }

}

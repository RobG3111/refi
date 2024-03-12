package refi;

import org.junit.jupiter.api.Test;

class TestAny extends BaseTest
{

    @Test
    void testAny()
    {
        String expression = refi.toRegEx("`a` any{`b`} `c`");
        assertRegexIs("ab*c", expression);
        assertRegexMatchesText(expression, "abc");
        assertRegexMatchesText(expression, "abbbc");
        assertRegexMatchesText(expression, "ac");
        assertRegexDoesntMatchText(expression, "asc");       
    }

}

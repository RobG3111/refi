package refi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSome extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.translate("`a` some{`b`} `c`");
        assertEquals("ab+c", expression);
        assertRegexMatchesText(expression, "abc");
        assertRegexMatchesText(expression, "abbbc");
        assertRegexDoesntMatchText(expression, "ac");
        assertRegexDoesntMatchText(expression, "asc");      }

}

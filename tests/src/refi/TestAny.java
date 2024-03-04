package refi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAny extends BaseTest
{

    @Test
    void testAny()
    {
        String expression = refi.translate("`a` any{`b`} `c`");
        assertEquals("ab*c", expression);
        assertRegexMatchesText(expression, "abc");
        assertRegexMatchesText(expression, "abbbc");
        assertRegexMatchesText(expression, "ac");
        assertRegexDoesntMatchText(expression, "asc");       
    }

}

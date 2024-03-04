package refi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class TestOptional extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.translate("`a` optional{`b`} `c`");
        assertEquals("ab?c", expression);
        assertRegexMatchesText(expression, "abc");
        assertRegexMatchesText(expression, "ac");
        assertRegexDoesntMatchText(expression, "abbc"); 
    }

}

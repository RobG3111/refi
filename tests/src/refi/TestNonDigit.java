package refi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestNonDigit extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.translate("nondigit");
        assertEquals("\\D", expression);
        assertRegexMatchesText(expression, "x");
        assertRegexDoesntMatchText(expression, "4");
        
    }

}

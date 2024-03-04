package refi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBol  extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.translate("bol `123`");
        assertEquals("^123", expression);
        assertRegexMatchesText(expression, "123");
        assertRegexDoesntMatchText(expression, "4123");    
    }

}

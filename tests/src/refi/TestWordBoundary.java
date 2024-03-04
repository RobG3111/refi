package refi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestWordBoundary extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.translate("` ` wordboundary `word`");
        assertEquals(" \\bword", expression);
        assertRegexMatchesText(expression, " word");
        assertRegexDoesntMatchText(expression, "4");       
    }

}

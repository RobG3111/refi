package refi;

import org.junit.jupiter.api.Test;

class TestWordBoundary extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.toRegEx("` ` wordboundary `word`");
        assertRegexIs(" \\bword", expression);
        assertRegexMatchesText(expression, " word");
        assertRegexDoesntMatchText(expression, "4");       
    }

}

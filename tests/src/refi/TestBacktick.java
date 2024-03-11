package refi;

import org.junit.jupiter.api.Test;

class TestBacktick extends BaseTest
{

    @Test
    void testOneBacktick()
    {
        String expression = refi.toRegEx("backtick");
        assertRegexIs("`", expression);;
    }
    
    @Test
    void testManyBacktick()
    {
        String expression = refi.toRegEx("backtick `green` backtick");
        assertRegexIs("`green`", expression);;
    }
    

}

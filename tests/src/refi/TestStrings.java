package refi;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestStrings extends BaseTest
{

    @Test
    void testString()
    {
        String expression = refi.toRegEx("`ab`");
        assertRegexIs("ab", expression);
        
        expression = refi.toRegEx("`!`");
        assertRegexIs("!", expression);
        
        expression = refi.toRegEx("`!` `the` ` cat`");
        assertRegexIs("!the cat", expression);
        
        expression = refi.toRegEx("(`!` `the` ` cat`)");
        assertRegexIs("(!the cat)", expression);
    }
    
    @Test
    void testUnenclosedString()
    {
        Exception exception = assertThrows(RuntimeException.class, () ->
            (new Refi()).toRegEx("ab"));  
        assertTrue(exception.getMessage().contains("token recognition error at: 'ab'"));
    }

}

package refi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStrings extends BaseTest
{

    @Test
    void testString()
    {
        String translated = refi.translate("`ab`");
        assertEquals("ab", translated);
        
        translated = refi.translate("`!`");
        assertEquals("!", translated);
        
        translated = refi.translate("`!` `the` ` cat`");
        assertEquals("!the cat", translated);
        
        translated = refi.translate("(`!` `the` ` cat`)");
        assertEquals("(!the cat)", translated);
    }
    
    @Test
    void testUnenclosedString()
    {
        Exception exception = assertThrows(RuntimeException.class, () ->
            (new Refi()).translate("ab"));  
        assertTrue(exception.getMessage().contains("token recognition error at: 'ab'"));
    }

}

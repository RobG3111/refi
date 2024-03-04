package refi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBacktick extends BaseTest
{

    @Test
    void testOneBacktick()
    {
        String translated = refi.translate("backtick");
        assertEquals("`", translated);
    }
    
    @Test
    void testManyBacktick()
    {
        String translated = refi.translate("backtick `green` backtick");
        assertEquals("`green`", translated);
    }
    
    @Test
    void testManyBacktickError()
    {
        Exception exception = assertThrows(RuntimeException.class, () ->       
            refi.translate("green"));
        assertTrue(exception.getMessage().contains("token recognition error at: 'g'"));
    }


}

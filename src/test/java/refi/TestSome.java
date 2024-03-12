package refi;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.jupiter.api.Test;

class TestSome extends BaseTest
{

    @Test
    void test()
    {
        String expression = refi.toRegEx("`a` some{`b`} `c`");
        assertRegexIs("ab+c", expression);
        assertRegexMatchesText(expression, "abc");
        assertRegexMatchesText(expression, "abbbc");
        assertRegexDoesntMatchText(expression, "ac");
        assertRegexDoesntMatchText(expression, "asc");      
    }
    
    @Test
    void testPosses()
    {
        String expression = refi.toRegEx("`a` some{`b`, posses} `c`");
        assertRegexIs("ab++c", expression);
        assertRegexMatchesText(expression, "abc");
        assertRegexMatchesText(expression, "abbbc");
        assertRegexDoesntMatchText(expression, "ac");
        assertRegexDoesntMatchText(expression, "asc");      
    }
    
    @Test
    void testReluct()
    {
        String expression = refi.toRegEx("`a` some{`b`, reluct} `c`");
        assertRegexIs("ab+?c", expression);
        assertRegexMatchesText(expression, "abc");
        assertRegexMatchesText(expression, "abbbc");
        assertRegexDoesntMatchText(expression, "ac");
        assertRegexDoesntMatchText(expression, "asc");      
    }
    
    @Test
    void testBadExpression()
    {
       Exception exception = assertThrows(ParseCancellationException.class, () -> refi.toRegEx("`a` some{`b` digit} `c`"));
       assertTrue(exception.getMessage().contains("extraneous input 'digit'") );
    }



}

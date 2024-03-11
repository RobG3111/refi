package refi;

import org.junit.jupiter.api.Test;

class TestCapture extends BaseTest
{

    @Test
    void testCapture()
    {
        String expression = refi.toRegEx("capture{ wild }");
        assertRegexIs("(.)", expression);
    }
    
    @Test
    void testCaptureComplex()
    {
        String expression = refi.toRegEx("capture{ wild `123` }");
        assertRegexIs("(.123)", expression);
    }
    
    @Test
    void testCaptureNamed()
    {
        String expression = refi.toRegEx("capture{ wild , `sam` }");
        assertRegexIs("(?<sam>.)", expression);
    }
    
    @Test
    void testCaptureNamedComplex()
    {
        String expression = refi.toRegEx("capture{ wild `animals` , `sam` }");
        assertRegexIs("(?<sam>.animals)", expression);
    }


}

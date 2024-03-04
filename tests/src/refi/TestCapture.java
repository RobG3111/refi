package refi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCapture extends BaseTest
{

    @Test
    void testCapture()
    {
        String expression = refi.translate("capture{ wild }");
        assertEquals("(.)", expression);
    }
    
    @Test
    void testCaptureComplex()
    {
        String expression = refi.translate("capture{ wild `123` }");
        assertEquals("(.123)", expression);
    }
    
    @Test
    void testCaptureNamed()
    {
        String expression = refi.translate("capture{ wild , `sam` }");
        assertEquals("(?<sam>.)", expression);
    }
    
    @Test
    void testCaptureNamedComplex()
    {
        String expression = refi.translate("capture{ wild `animals` , `sam` }");
        assertEquals("(?<sam>.animals)", expression);
    }


}

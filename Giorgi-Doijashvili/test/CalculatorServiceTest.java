import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorServiceTest {

    @Test
    public void sumTest(){
        CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

        assertEquals(10,calculatorServiceImpl.sum(5, 5));
        assertEquals(8,calculatorServiceImpl.prod(2, 4));
        assertEquals(13.0,calculatorServiceImpl.sum(6.5, 6.5), 0);
        assertEquals(36.0,calculatorServiceImpl.prod(6.0, 6.0), 0);
    }
}
package ca.vanier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {

    // -------Sum Tests-------//
    @Test
    public void testSumExecute() throws Exception {

        String args[] = new String[3];
        args[0] = "sum";
        args[1] = "2";
        args[2] = "3";
        CalculatorResponse response = Calculator.execute(args);

        assertNotNull(response);
        assertTrue("Test if is equal to 5", response.getResult() == 5);
        assertEquals("TestEquals", 5, response.getResult(), 0);
    }

    // -------Multiplication Tests-------//

    @Test
    public void testMultExecute() throws Exception {

        String args[] = new String[3];
        args[0] = "mult";
        args[1] = "2";
        args[2] = "3";
        CalculatorResponse response = Calculator.execute(args);

        assertNotNull(response);
        assertTrue("Test if is equal to 6", response.getResult() == 6);
        assertEquals("TestEquals", 6, response.getResult(), 0);
    }

    // -------Division Tests-------//

    @Test
    public void testDivExecute() throws Exception {

        String args[] = new String[3];
        args[0] = "div";
        args[1] = "8";
        args[2] = "2";
        CalculatorResponse response = Calculator.execute(args);

        assertNotNull(response);
        assertTrue("Test if is equal to 4", response.getResult() == 4);
        assertEquals("TestEquals", 4, response.getResult(), 0);
    }
    // -------Rest Tests-------//

    @Test
    public void testRestExecute() throws Exception {

        String args[] = new String[3];
        args[0] = "rest";
        args[1] = "6";
        args[2] = "3";
        CalculatorResponse response = Calculator.execute(args);

        assertNotNull(response);
        assertTrue("Test if is equal to 3", response.getResult() == 3);
        assertEquals("TestEquals", 3, response.getResult(), 0);
    }

    // -------Exception Tests-------//

    @Test(expected = Exception.class)
    public void testExecuteException() throws Exception {

        String args[] = new String[3];
        args[0] = "k";
        args[1] = "2";
        args[2] = "3";

        Calculator.execute(args);
    }
}

package ca.vanier;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorResponseTest {

    CalculatorResponse response = new CalculatorResponse();

    @Test
    public void testGetAndSetOperation() {
        response.setOperation("sum");
        assertEquals("sum", response.getOperation());
    }

    @Test
    public void testGetAndSetValue1() {
        response.setValue1(10.0);
        assertEquals(10.0, response.getValue1(), 0.001);
    }

    @Test
    public void testGetAndSetValue2() {
        response.setValue2(5.0);
        assertEquals(5.0, response.getValue2(), 0.001);
    }

    @Test
    public void testGetAndSetResult() {
        response.setResult(15.0);
        assertEquals(15.0, response.getResult(), 0.001);
    }

    @Test
    public void testGetAndSetDetailMessage() {
        response.setDetailMessage("Calculation successful");
        assertEquals("Calculation successful", response.getDetailMessage());
    }

    @Test
    public void testGetAndSetStatus() {
        response.setStatus("Success");
        assertEquals("Success", response.getStatus());
    }

    @Test
    public void testToString() {
        response.setOperation("mult");
        response.setValue1(20);
        response.setValue2(2);
        response.setResult(40);
        response.setDetailMessage("mult operation executed successfully");
        response.setStatus("Success");

        String expectedString = "CalculatorResponse [operation=mult, value1=20.0, value2=2.0, result=40.0, detailMessage=mult operation executed successfully, Status=Success]";
        assertEquals(expectedString, response.toString());
    }
}

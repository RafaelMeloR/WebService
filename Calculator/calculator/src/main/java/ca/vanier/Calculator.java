package ca.vanier;

public class Calculator {

    public static CalculatorResponse execute(String[] args) throws Exception {
        String operation = args[0];
        Double value1 = Double.valueOf(args[1]);
        Double value2 = Double.valueOf(args[2]);

        if (operation.equalsIgnoreCase("sum")) {
            return sum(value1, value2);
        } else if (operation.equalsIgnoreCase("mult")) {
            return mult(value1, value2);
        } else if (operation.equalsIgnoreCase("div")) {
            return div(value1, value2);
        } else if (operation.equalsIgnoreCase("rest")) {
            return rest(value1, value2);
        }

        throw new Exception("Invalid operation");
    }

    public static CalculatorResponse sum(Double value1, Double value2) {
        CalculatorResponse response = new CalculatorResponse();
        response.setOperation("sum");
        response.setValue1(value1);
        response.setValue2(value2);
        response.setResult(value1 + value2);
        response.setStatus("Success");
        response.setDetailMessage("Sum operation executed successfully");
        return response;
    }

    public static CalculatorResponse mult(Double value1, Double value2) {
        CalculatorResponse response = new CalculatorResponse();
        response.setOperation("mult");
        response.setValue1(value1);
        response.setValue2(value2);
        response.setResult(value1 * value2);
        response.setStatus("Success");
        response.setDetailMessage("Mult operation executed successfully");
        return response;
    }

    public static CalculatorResponse div(Double value1, Double value2) {
        CalculatorResponse response = new CalculatorResponse();
        response.setOperation("div");
        response.setValue1(value1);
        response.setValue2(value2);
        response.setResult(value1 / value2);
        response.setStatus("Success");
        response.setDetailMessage("Division operation executed successfully");
        return response;
    }

    public static CalculatorResponse rest(Double value1, Double value2) {
        CalculatorResponse response = new CalculatorResponse();
        response.setOperation("rest");
        response.setValue1(value1);
        response.setValue2(value2);
        response.setResult(value1 - value2);
        response.setStatus("Success");
        response.setDetailMessage("Rest operation executed successfully");
        return response;
    }
}

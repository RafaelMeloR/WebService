package ca.vanier;

public class Main {
    public static void main(String[] args) {

        CalculatorResponse response = null;
        try {
            response = Calculator.execute(args);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println(response);
    }
}

package calculator.controller;

import calculator.model.Calculator;
import calculator.view.CalculatorView;

public class CalculatorController {
    private Calculator model;
    private CalculatorView view;

    public CalculatorController(Calculator model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void processUserInput() {
        double num1 = view.getNumberInput("Enter the first number");
        String operator = view.getOperatorInput();
        double num2 = view.getNumberInput("Enter the second number");

        try {
            double result = model.calculate(num1, num2, operator);
            view.displayResult(result);
        } catch (Exception e) {
            view.displayError(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Calculator model = new Calculator();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        controller.processUserInput();
    }
}

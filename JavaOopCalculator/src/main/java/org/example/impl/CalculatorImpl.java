package org.example.impl;

import org.example.Utility.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalculatorImpl implements ActionListener {
    private double num1 = 0.0;
    private double num2 = 0.0;
    double result =0.0;
    char operator;

    private JTextField textField;

    private JButton[] functionButtons = new JButton[9];
    private  JButton[] numberButtons = new JButton[10];

    private final Calculator calculator;

    public CalculatorImpl(Calculator calculator) {
        this.calculator = calculator;
        this.textField = calculator.getTextField();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        for(int i = 0; i<9; ++i){
            this.functionButtons[i] = calculator.getFunctionButtons()[i];
        }
        for(int i = 0; i<10; ++i){
            this.numberButtons[i] = calculator.getNumberButtons()[i];
        }

        for(int i = 0; i < 10; ++i) {
            if (e.getSource() == calculator.getNumberButtons()[i]) {
                calculator.getTextField().setText(calculator.getTextField().getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == calculator.getDecButton()) {
            this.textField.setText(calculator.getTextField().getText().concat("."));
        }

        if (e.getSource() == calculator.getAddButton()) {
            this.num1 = Double.parseDouble(calculator.getTextField().getText());
            this.operator = '+';
            calculator.getTextField().setText("");
        }

        if (e.getSource() == calculator.getSubButton()) {
            this.num1 = Double.parseDouble(calculator.getTextField().getText());
            this.operator = '-';
            calculator.getTextField().setText("");
        }

        if (e.getSource() == calculator.getMulButton()) {
            this.num1 = Double.parseDouble(calculator.getTextField().getText());
            this.operator = '*';
            calculator.getTextField().setText("");
        }

        if (e.getSource() == calculator.getDivButton()) {
            this.num1 = Double.parseDouble(calculator.getTextField().getText());
            this.operator = '/';
            calculator.getTextField().setText("");
        }

        if (e.getSource() == calculator.getEquButton()) {
            this.num2 = Double.parseDouble(calculator.getTextField().getText());
            switch (this.operator) {
                case '*':
                    this.result = this.num1 * this.num2;
                    break;
                case '+':
                    this.result = this.num1 + this.num2;
                case ',':
                case '.':
                default:
                    break;
                case '-':
                    this.result = this.num1 - this.num2;
                    break;
                case '/':
                    this.result = this.num1 / this.num2;
            }

            this.textField.setText(String.valueOf(this.result));
            this.num1 = this.result;
        }

        if (e.getSource() == calculator.getClrButton()) {
            calculator.getTextField().setText("");
        }

        if (e.getSource() == calculator.getDelButton()) {
            String string = calculator.getTextField().getText();
            calculator.getTextField().setText("");

            for(int i = 0; i < string.length() - 1; ++i) {
                JTextField var10000 = calculator.getTextField();
                String var10001 = calculator.getTextField().getText();
                var10000.setText(var10001 + string.charAt(i));
            }
        }

        if (e.getSource() == calculator.getNegButton()) {
            double temp = Double.parseDouble(calculator.getTextField().getText());
            temp *= -1.0;
            calculator.getTextField().setText(String.valueOf(temp));
        }
    }
}

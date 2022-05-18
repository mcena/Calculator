package org.example.impl;

import org.example.Utility.Calculator;
import org.example.Utility.CalculatorUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalculatorImpl implements ActionListener {
    private double num1 = 0.0;
    private double num2 = 0.0;
    double result =0.0;
    char operator;

    private JTextField textField;

    private JButton[] functionButtons;
    private  JButton[] numberButtons;
    @Override
    public void actionPerformed(ActionEvent e) {
        Calculator calculator = initActionListener();

        for(int i = 0; i < 10; ++i) {
            if (e.getSource() == calculator.getNumberButtons()[i]) {
                this.textField.setText(calculator.getTextField().getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == calculator.getDecButton()) {
            this.textField.setText(calculator.getTextField().getText().concat("."));
        }

        if (e.getSource() == calculator.getAddButton()) {
            this.num1 = Double.parseDouble(calculator.getTextField().getText());
            this.operator = '+';
            this.textField.setText("");
        }

        if (e.getSource() == calculator.getSubButton()) {
            this.num1 = Double.parseDouble(calculator.getTextField().getText());
            this.operator = '-';
            this.textField.setText("");
        }

        if (e.getSource() == calculator.getMulButton()) {
            this.num1 = Double.parseDouble(calculator.getTextField().getText());
            this.operator = '*';
            this.textField.setText("");
        }

        if (e.getSource() == calculator.getDivButton()) {
            this.num1 = Double.parseDouble(calculator.getTextField().getText());
            this.operator = '/';
            this.textField.setText("");
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
            this.textField.setText("");
        }

        if (e.getSource() == calculator.getDelButton()) {
            String string = calculator.getTextField().getText();
            this.textField.setText("");

            for(int i = 0; i < string.length() - 1; ++i) {
                JTextField var10000 = calculator.getTextField();
                String var10001 = calculator.getTextField().getText();
                var10000.setText(var10001 + string.charAt(i));
            }
        }

        if (e.getSource() == calculator.getNegButton()) {
            double temp = Double.parseDouble(calculator.getTextField().getText());
            temp *= -1.0;
            this.textField.setText(String.valueOf(temp));
        }
    }

    private Calculator initActionListener(){
        CalculatorUI calculatorUI = new CalculatorUI();
        Calculator calculator = calculatorUI.getCalculator();
        functionButtons = calculator.getFunctionButtons();
        numberButtons = calculator.getNumberButtons();
        textField = calculator.getTextField();

        for(int i = 0; i<9; ++i){
            functionButtons[i].addActionListener(this);
            System.out.println(functionButtons [i].getName());
        }
        for(int i = 0; i<10; ++i){
            numberButtons[i].addActionListener(this);
        }
        return calculator;
    }
}

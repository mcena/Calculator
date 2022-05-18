package org.example.Utility;

import org.example.impl.CalculatorImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class CalculatorUI {
    private JFrame frame = new JFrame("Calculator");
    private JTextField textField;
    private JButton[] numberButtons = new JButton[10];
    private JButton[] functionButtons = new JButton[9];
    private JButton addButton;
    private JButton subButton;
    private JButton mulButton;
    private JButton divButton;
    private JButton decButton;
    private JButton equButton;
    private JButton delButton;
    private JButton clrButton;
    private JButton negButton;
    private JPanel panel;
    private Font myFont = new Font("Castellar", 1, 30);



    public void initUserInterface(){
        this.frame.setDefaultCloseOperation(3);
        this.frame.setSize(420, 550);
        this.frame.setLayout((LayoutManager)null);
        this.textField = new JTextField();
        this.textField.setBounds(50, 25, 300, 50);
        this.textField.setFont(this.myFont);
        this.textField.setEditable(false);
        this.addButton = new JButton("+");
        this.subButton = new JButton("-");
        this.mulButton = new JButton("*");
        this.divButton = new JButton("/");
        this.decButton = new JButton(".");
        this.equButton = new JButton("=");
        this.delButton = new JButton("DEL");
        this.clrButton = new JButton("CLR");
        this.negButton = new JButton("(-)");
        this.functionButtons[0] = this.addButton;
        this.functionButtons[1] = this.subButton;
        this.functionButtons[2] = this.mulButton;
        this.functionButtons[3] = this.divButton;
        this.functionButtons[4] = this.decButton;
        this.functionButtons[5] = this.equButton;
        this.functionButtons[6] = this.delButton;
        this.functionButtons[7] = this.clrButton;
        this.functionButtons[8] = this.negButton;

        Calculator calculator = initButtons();
        initFont();

        this.negButton.setBounds(50, 430, 110, 50);
        this.delButton.setBounds(150, 430, 110, 50);
        this.clrButton.setBounds(250, 430, 110, 50);
        this.panel = new JPanel();
        this.panel.setBounds(50, 100, 300, 300);
        this.panel.setLayout(new GridLayout(4, 4, 10, 10));
        this.panel.add(this.numberButtons[1]);
        this.panel.add(this.numberButtons[2]);
        this.panel.add(this.numberButtons[3]);
        this.panel.add(this.addButton);
        this.panel.add(this.numberButtons[4]);
        this.panel.add(this.numberButtons[5]);
        this.panel.add(this.numberButtons[6]);
        this.panel.add(this.subButton);
        this.panel.add(this.numberButtons[7]);
        this.panel.add(this.numberButtons[8]);
        this.panel.add(this.numberButtons[9]);
        this.panel.add(this.mulButton);
        this.panel.add(this.decButton);
        this.panel.add(this.numberButtons[0]);
        this.panel.add(this.equButton);
        this.panel.add(this.divButton);
        this.frame.add(this.panel);
        this.frame.add(this.negButton);
        this.frame.add(this.delButton);
        this.frame.add(this.clrButton);
        this.frame.add(this.textField);
        this.frame.setVisible(true);

        ActionListener actionListener = new CalculatorImpl(calculator);
        for(int i = 0; i<9; ++i){
            functionButtons[i].addActionListener(actionListener);
        }
        for(int i = 0; i<10; ++i){
            numberButtons[i].addActionListener(actionListener);
        }
    }

    private void initFont(){
        int i;
        for(i = 0; i < 9; ++i) {
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        for(i = 0; i < 10; ++i) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }
    }

    private Calculator initButtons(){
        Calculator calculator = new Calculator();
        calculator.setTextField(textField);
        calculator.setAddButton(addButton);
        calculator.setSubButton(subButton);
        calculator.setDivButton(divButton);
        calculator.setMulButton(mulButton);
        calculator.setClrButton(clrButton);
        calculator.setDelButton(delButton);
        calculator.setDecButton(decButton);
        calculator.setEquButton(equButton);
        calculator.setNegButton(negButton);
        calculator.setFunctionButtons(functionButtons);
        calculator.setNumberButtons(numberButtons);

        return calculator;
    }
}

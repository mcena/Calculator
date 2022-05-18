package org.example.Utility;

import javax.swing.*;

public class Calculator {
    private JButton[] functionButtons = new JButton[9];
    private JButton[] numberButtons = new JButton[10];
    private JButton addButton;
    private JButton subButton;
    private JButton mulButton;
    private JButton divButton;
    private JButton decButton;
    private JButton equButton;
    private JButton delButton;
    private JButton clrButton;
    private JButton negButton;

    public JButton getAddButton() {
        return addButton;
    }

    public void setAddButton(JButton addButton) {
        this.addButton = addButton;
    }

    public JButton getSubButton() {
        return subButton;
    }

    public void setSubButton(JButton subButton) {
        this.subButton = subButton;
    }

    public JButton getMulButton() {
        return mulButton;
    }

    public void setMulButton(JButton mulButton) {
        this.mulButton = mulButton;
    }

    public JButton getDivButton() {
        return divButton;
    }

    public void setDivButton(JButton divButton) {
        this.divButton = divButton;
    }

    public JButton getDecButton() {
        return decButton;
    }

    public void setDecButton(JButton decButton) {
        this.decButton = decButton;
    }

    public JButton getEquButton() {
        return equButton;
    }

    public void setEquButton(JButton equButton) {
        this.equButton = equButton;
    }

    public JButton getDelButton() {
        return delButton;
    }

    public void setDelButton(JButton delButton) {
        this.delButton = delButton;
    }

    public JButton getClrButton() {
        return clrButton;
    }

    public void setClrButton(JButton clrButton) {
        this.clrButton = clrButton;
    }

    public JButton getNegButton() {
        return negButton;
    }

    public void setNegButton(JButton negButton) {
        this.negButton = negButton;
    }


    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    private JTextField textField;


    public JButton[] getFunctionButtons() {
        return functionButtons;
    }

    public void setFunctionButtons(JButton[] functionButtons) {
        this.functionButtons = functionButtons;
    }

    public JButton[] getNumberButtons() {
        return numberButtons;
    }

    public void setNumberButtons(JButton[] numberButtons) {
        this.numberButtons = numberButtons;
    }
}

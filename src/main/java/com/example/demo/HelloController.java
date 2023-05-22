package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {



    @FXML
    private TextField txtField;

    private  String firstNumber="";
    private String currentNumber="";
    private String calculationType;
    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnDivide;

    @FXML
    private Button btnDot;

    @FXML
    private Button btnEqual;

    @FXML
    private Button btnNegative;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnTimes;

    @FXML
    private Label lblResult;

    @FXML
    private Text savedNumber;

    @FXML
    void btnNegativeHandler(ActionEvent event) {
        calculationSetup("-");
    }

    @FXML
    void btnPlusHandler(ActionEvent event) {
        calculationSetup("+");

    }

    @FXML
    void btnTimesHandler(ActionEvent event) {
        calculationSetup("*");
    }
    @FXML
    void btnDivideHandler(ActionEvent event) {
        calculationSetup("/");
    }

    public void calculationSetup(String calculationType){
        this.calculationType=calculationType;
        firstNumber=currentNumber;
        currentNumber="";
        savedNumber.setText(firstNumber+" "+calculationType);

    }

    @FXML
    void btnEqualHandler(ActionEvent event){
        int firstNumberInt=Integer.parseInt(firstNumber);
        int secondNumberInt=Integer.parseInt(currentNumber);

        switch (calculationType){
            case "+"->{
                int calculatedNumber=firstNumberInt+secondNumberInt;
                savedNumber.setText(firstNumber+" + "+currentNumber + " = "+ calculatedNumber);
                txtField.setText(String.valueOf(calculatedNumber));
            }
            case "-"->{
                int calculatedNumber=firstNumberInt-secondNumberInt;
                savedNumber.setText(firstNumber+" - "+currentNumber + " = "+ calculatedNumber);
                txtField.setText(String.valueOf(calculatedNumber));
            }

            case "*"->{
                int calculatedNumber=firstNumberInt*secondNumberInt;
                savedNumber.setText(firstNumber+" * "+currentNumber + " = "+ calculatedNumber);
                txtField.setText(String.valueOf(calculatedNumber));
            }

            case "/"->{
                double calculatedNumber=firstNumberInt/(double)secondNumberInt;
                savedNumber.setText(firstNumber+" / "+currentNumber + " = "+ calculatedNumber);
                txtField.setText(String.valueOf(calculatedNumber));
            }
        }
    }

    @FXML
    void clearTextField(ActionEvent event){
        currentNumber="";
        txtField.setText("");
        savedNumber.setText("");
    }





    @FXML
    void btn0Handler(ActionEvent event) {
        if (currentNumber.equals("")){
            addNumber("0");
        }

    }

    @FXML
    void btn1Handler(ActionEvent event) {
        addNumber("1");
    }

    @FXML
    void btn2Handler(ActionEvent event) {
        addNumber("2");
    }

    @FXML
    void btn3Handler(ActionEvent event) {
        addNumber("3");
    }

    @FXML
    void btn4Handler(ActionEvent event) {
        addNumber("4");
    }

    @FXML
    void btn5Handler(ActionEvent event) {
        addNumber("5");
    }

    @FXML
    void btn6Handler(ActionEvent event) {
        addNumber("6");
    }

    @FXML
    void btn7Handler(ActionEvent event) {
        addNumber("7");
    }

    @FXML
    void btn8Handler(ActionEvent event) {
        addNumber("8");
    }

    @FXML
    void btn9Handler(ActionEvent event) {
        addNumber("9");
    }
    public void updateTextField(){
        txtField.setText(currentNumber);
    }
    public void addNumber(String number){
        currentNumber+=number;
        updateTextField();

    }



    @FXML
    void btnDotHandler(ActionEvent event) {
        calculationSetup("");
        firstNumber= String.valueOf(0);
        txtField.setText("");
        savedNumber.setText("");
    }

//    @FXML
//    void btnEqualHandler(ActionEvent event) {
//
//
//    }




}

package org.demo3.javafxdemo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    public TextField resultado ;

    int resposta;
    int numAtual;
    int numAnt;
    String operador;

    public void btn1Clicked(ActionEvent actionEvent) {
        String resultado = this.resultado.getText();

        if(resultado.equals("0")) {
            this.resultado.setText("1");
        } else {
            this.resultado.setText(resultado + "1");
        }

    }

    public void btn0Clicked(ActionEvent actionEvent) {
        String resultado = this.resultado.getText();

        if(!resultado.equals("0")) {
            this.resultado.setText(resultado + "0");
        }
    }

    public void btn2Clicked(ActionEvent actionEvent) {
        String resultado = this.resultado.getText();

        if(resultado.equals("0")) {
            this.resultado.setText("2");
        } else {
            this.resultado.setText(resultado + "2");
        }
    }

    public void btn3Clicked(ActionEvent actionEvent) {
        String resultado = this.resultado.getText();

        if(resultado.equals("0")) {
            this.resultado.setText("3");
        } else {
            this.resultado.setText(resultado + "3");
        }
    }

    public void btn4Clicked(ActionEvent actionEvent) {
        String resultado = this.resultado.getText();

        if(resultado.equals("0")) {
            this.resultado.setText("4");
        } else {
            this.resultado.setText(resultado + "4");
        }
    }

    public void btn5Clicked(ActionEvent actionEvent) {
        String resultado = this.resultado.getText();

        if(resultado.equals("0")) {
            this.resultado.setText("5");
        } else {
            this.resultado.setText(resultado + "5");
        }
    }

    public void btn6Clicked(ActionEvent actionEvent) {
        String resultado = this.resultado.getText();

        if(resultado.equals("0")) {
            this.resultado.setText("6");
        } else {
            this.resultado.setText(resultado + "6");
        }
    }

    public void btn7Clicked(ActionEvent actionEvent) {
        String resultado = this.resultado.getText();

        if(resultado.equals("0")) {
            this.resultado.setText("7");
        } else {
            this.resultado.setText(resultado + "7");
        }
    }

    public void btn8Clicked(ActionEvent actionEvent) {
        String resultado = this.resultado.getText();

        if(resultado.equals("0")) {
            this.resultado.setText("8");
        } else {
            this.resultado.setText(resultado + "8");
        }
    }

    public void btn9Clicked(ActionEvent actionEvent) {
        String resultado = this.resultado.getText();

        if(resultado.equals("0")) {
            this.resultado.setText("9");
        } else {
            this.resultado.setText(resultado + "9");
        }
    }

    public void btnACClicked(ActionEvent actionEvent) {
        String resultado = this.resultado.getText();

        this.resultado.setText("0");

        resposta = 0;
        numAtual = 0;
        numAnt = 0;
        operador = "";

    }

    public void btnPointClicked(ActionEvent actionEvent) {
        String resultado = this.resultado.getText();

        if (!resultado.isEmpty()) {
            if (!resultado.contains(".")) {
                this.resultado.setText(resultado + ".");
            }
        }
    }

    public void btnMultiplicacaoClicked(ActionEvent actionEvent) {
        numAnt = Integer.parseInt(resultado.getText());

        operador = "*";

        resultado.setText("");
    }

    public void btnSomaClicked(ActionEvent actionEvent) {
        numAnt = Integer.parseInt(resultado.getText());

        operador = "+";

        resultado.setText("");
    }

    public void btnSubtracaoClicked(ActionEvent actionEvent) {
        numAnt = Integer.parseInt(resultado.getText());

        operador = "-";

        resultado.setText("");
    }

    public void btnDivisaoClicked(ActionEvent actionEvent) {
        numAnt = Integer.parseInt(resultado.getText());

        operador = "/";

        resultado.setText("");
    }

    public void btnEqualsClicked(ActionEvent actionEvent) {
        numAtual = Integer.parseInt(resultado.getText());

        switch (operador) {
            case "+":
                resposta = numAnt + numAtual;
                break;

            case "-":
                resposta = numAnt - numAtual;
                break;

            case "/":
                if (numAtual == 0) {
                    resultado.setText("Erro");
                    return;
                } else {
                    resposta = numAnt/numAtual;
                }
                break;

            case "*":
                resposta = numAnt * numAtual;
                break;
        }

        resultado.setText(String.valueOf(resposta));

    }

}
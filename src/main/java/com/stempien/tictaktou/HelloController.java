package com.stempien.tictaktou;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    boolean czyX = false;
    int tura = 0;
    int punktyO = 0;
    int punktyX = 0;
    public Button btn1;
    public Button btn4;
    public Button btn7;
    public Button btn2;
    public Button btn3;
    public Button btn5;
    public Button btn6;
    public Button btn8;
    public Button btn9;
    public Button btnGrajJeszczeRaz;
    public Label lblWygraneO;
    public Label lblWygraneX;
    public Label lblKogoTura;
    public Label lblWygrywa;

    public void btn9click(ActionEvent actionEvent) {
        if (czyX == false)
            btn9.setText("O");
        else
            btn9.setText("X");
        czyX = !czyX;
        tura++;
        btn9.setDisable(true);
        czyWygral();
    }

    public void btn8click(ActionEvent actionEvent) {
        if (czyX == false)
            btn8.setText("O");
        else
            btn8.setText("X");
        czyX = !czyX;
        tura++;
        btn8.setDisable(true);
        czyWygral();
    }

    public void btn6click(ActionEvent actionEvent) {
        if (czyX == false)
            btn6.setText("O");
        else
            btn6.setText("X");
        czyX = !czyX;
        tura++;
        btn6.setDisable(true);
        czyWygral();
    }

    public void btn5click(ActionEvent actionEvent) {
        if (czyX == false)
            btn5.setText("O");
        else
            btn5.setText("X");
        czyX = !czyX;
        tura++;
        btn5.setDisable(true);
        czyWygral();
    }

    public void btn3click(ActionEvent actionEvent) {
        if (czyX == false)
            btn3.setText("O");
        else
            btn3.setText("X");
        czyX = !czyX;
        tura++;
        btn3.setDisable(true);
        czyWygral();
    }

    public void btn2click(ActionEvent actionEvent) {
        if (czyX == false)
            btn2.setText("O");
        else
            btn2.setText("X");
        czyX = !czyX;
        tura++;
        btn2.setDisable(true);
        czyWygral();
    }

    public void btn7click(ActionEvent actionEvent) {
        if (czyX == false)
            btn7.setText("O");
        else
            btn7.setText("X");
        czyX = !czyX;
        tura++;
        btn7.setDisable(true);
        czyWygral();
    }

    public void btn4click(ActionEvent actionEvent) {
        if (czyX == false)
            btn4.setText("O");
        else
            btn4.setText("X");
        czyX = !czyX;
        tura++;
        btn4.setDisable(true);
        czyWygral();
    }

    public void btn1click(ActionEvent actionEvent) {
        if (czyX == false)
            btn1.setText("O");
        else
            btn1.setText("X");
        czyX = !czyX;
        tura++;
        btn1.setDisable(true);
        czyWygral();
    }

    public void btnGrajJeszczeRazClick(ActionEvent actionEvent) {
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(false);
        btn5.setDisable(false);
        btn6.setDisable(false);
        btn7.setDisable(false);
        btn8.setDisable(false);
        btn9.setDisable(false);
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

    }

    public void czyWygral() {
        if(czyX == false)
            lblKogoTura.setText("Teraz tura: O");
        else
            lblKogoTura.setText("Teraz tura: X");
if(btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O") || btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O") || btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O") ||
        btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O") || btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O") ||
        btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O") || btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O") || btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")){
    punktyO ++;
    lblWygraneO.setText("" + punktyO);
    lblWygrywa.setText("Wygrywa: O");
    btn1.setDisable(true);
    btn2.setDisable(true);
    btn3.setDisable(true);
    btn4.setDisable(true);
    btn5.setDisable(true);
    btn6.setDisable(true);
    btn7.setDisable(true);
    btn8.setDisable(true);
    btn9.setDisable(true);
    tura = 0;
}
       else if(btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X") || btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X") || btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X") ||
                btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X") || btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X") ||
                btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X") || btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X") || btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")){
            punktyX ++;
            lblWygraneX.setText("" + punktyX);
            lblWygrywa.setText("Wygrywa: X");
            btn1.setDisable(true);
            btn2.setDisable(true);
            btn3.setDisable(true);
            btn4.setDisable(true);
            btn5.setDisable(true);
            btn6.setDisable(true);
            btn7.setDisable(true);
            btn8.setDisable(true);
            btn9.setDisable(true);
    tura = 0;
        }
else if (tura ==9) {
    lblWygrywa.setText("Remis");
    tura = 0;
}
    }
}
package fr.boxcheck.boxcheck;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;

import java.lang.reflect.Field;

public class CheckBoxControll {
    public javafx.scene.control.TextField TextField;

    public TitledPane TextBox;
    public CheckBox CouleurF;
    public CheckBox CouleurT;
    public CheckBox CasseC;
    public RadioButton BtnRF;
    public ToggleGroup Fond;
    public RadioButton BtnVF;
    public RadioButton BtnBF;
    public RadioButton BtnRT;
    public ToggleGroup Texte;
    public RadioButton BtnBT;
    public RadioButton BtnMinC;
    public ToggleGroup Casse;
    public RadioButton BtnMajC;
    public javafx.scene.control.Label Label;
    public TitledPane Field1;
    public TitledPane Field3;
    public TitledPane Field2;
    public RadioButton BtnNT;

    private String Text;

    public void TextEnter(ActionEvent actionEvent) {                    //Function de TexteField
        String text = TextField.getText();

        Label.setText(text);

    }

    public void Test(KeyEvent keyEvent) {
        if(TextField.getText().isEmpty()){
            TextBox.setDisable(true);

        }else{
            TextBox.setDisable(false);

        }

    }

    public void BoxCheck(ActionEvent actionEvent) {                     //Function des CheckBox
        Field1.setDisable(!CouleurF.isSelected());
        Field2.setDisable(!CouleurT.isSelected());
        Field3.setDisable(!CasseC.isSelected());

    }

    public void ActionClickFond(ActionEvent actionEvent) {              //Function pour la fieldFond
       if(BtnRF.isSelected()){
           Label.setStyle("-fx-background-color: red");

       } else if (BtnVF.isSelected()) {
           Label.setStyle("-fx-background-color: green");

       } else if (BtnBF.isSelected()) {
           Label.setStyle("-fx-background-color: blue");

       }

    }

    public void ActionClickTexte(ActionEvent actionEvent) {             //Function pour le fieldTexte
        if(BtnRT.isSelected()){
            Label.setStyle("-fx-text-fill: red");

        } else if (BtnBT.isSelected()) {
            Label.setStyle("-fx-text-fill: white");

        } else if (BtnNT.isSelected()) {
            Label.setStyle("-fx-text-fill: black");

        }

    }

    public void ActionClickCasse(ActionEvent actionEvent) {             //Function pour le fieldCasse
        String text = TextField.getText();
        if(BtnMinC.isSelected()){
            Label.setText(text.toLowerCase());

        } else if (BtnMajC.isSelected()) {
            Label.setText(text.toUpperCase());

        }
    }

}
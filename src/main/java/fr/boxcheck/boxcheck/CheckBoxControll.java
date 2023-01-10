package fr.boxcheck.boxcheck;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;

import java.lang.reflect.Field;

public class CheckBoxControll {
    public javafx.scene.control.TextField TextField;
    public javafx.scene.control.Label Label;

    //CheckBox
    public CheckBox CouleurF;
    public CheckBox CouleurT;
    public CheckBox CasseC;

    //Groupe des RadioButton
    public ToggleGroup Casse;
    public ToggleGroup Fond;
    public ToggleGroup Texte;

    //Bouton et BoxCheck
    public RadioButton BtnRF;
    public RadioButton BtnVF;
    public RadioButton BtnBF;
    public RadioButton BtnRT;

    public RadioButton BtnBT;
    public RadioButton BtnMinC;
    public RadioButton BtnMajC;
    public RadioButton BtnNT;

    //Box contenant les check
    public TitledPane TextBox;
    public TitledPane Field1;
    public TitledPane Field3;
    public TitledPane Field2;

//Valeur fantome
    private String Text;
    String style = "";
    String txtStyle = "";

    //Fonction code Action

    public void TextEnter(ActionEvent actionEvent) {                    //Function de TexteField
        String text = TextField.getText();

        Label.setText(text);

    }

    public void Test(KeyEvent keyEvent) {
        if(TextField.getText().isEmpty()){
            TextBox.setDisable(true);
            Field1.setDisable(CouleurF.isSelected());
            Field2.setDisable(CouleurT.isSelected());
            Field3.setDisable(CasseC.isSelected());

        }else{
            TextBox.setDisable(false);
            Field1.setDisable(!CouleurF.isSelected());
            Field2.setDisable(!CouleurT.isSelected());
            Field3.setDisable(!CasseC.isSelected());

        }

    }

    public void BoxCheck(ActionEvent actionEvent) {                     //Function des CheckBox
        Field1.setDisable(!CouleurF.isSelected());
        Field2.setDisable(!CouleurT.isSelected());
        Field3.setDisable(!CasseC.isSelected());

    }

    public void ActionClickFond(ActionEvent actionEvent) {              //Function pour la fieldFond
       if(BtnRF.isSelected()){
           style = "-fx-background-color: red;";

       } else if (BtnVF.isSelected()) {
           style = "-fx-background-color: green;";

       } else if (BtnBF.isSelected()) {
           style = "-fx-background-color: blue;";

       }
       ChangeStyle();

    }

    public void ActionClickTexte(ActionEvent actionEvent) {             //Function pour le fieldTexte

        if(BtnRT.isSelected()){
             txtStyle = "-fx-text-fill: red;";

        } else if (BtnBT.isSelected()) {
             txtStyle = "-fx-text-fill: white;";

        } else if (BtnNT.isSelected()) {
             txtStyle = "-fx-text-fill: black;";

        }
        ChangeStyle();
    }

    public void ChangeStyle(){
        Label.setStyle(txtStyle + style);

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
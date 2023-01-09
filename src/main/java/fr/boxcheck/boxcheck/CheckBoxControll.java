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

    private String Text;

    public void TextEnter(ActionEvent actionEvent) {                    //Function de TexteField
        String Text = TextField.getText();

        Label.setText(Text);

    }

    public void Test(KeyEvent keyEvent) {
        if(TextField.getText().isEmpty()){
            TextBox.setDisable(true);

        }else{
            TextBox.setDisable(false);

        }

    }

    public void BoxCheck(ActionEvent actionEvent) {                     //Function des CheckBox
        CheckBox Check = (CheckBox)actionEvent.getSource();


        if(Check.setSelected(true)){
            Check.setSelected(true);

        }else{
            Check.setSelected(false);
        }

    }

    public void ActionClickFond(ActionEvent actionEvent) {              //Function pour la fieldFond

        CheckBox Check = (CheckBox) actionEvent.getSource();


        if(Check.isSelected()){
            Check.setSelected(true);

        }else{
            Check.setSelected(false);
        }


    }

    public void ActionClickTexte(ActionEvent actionEvent) {             //Function pour le fieldTexte


    }

    public void ActionClickCasse(ActionEvent actionEvent) {             //Function pour le fieldCasse

    }

}
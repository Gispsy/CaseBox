package fr.boxcheck.boxcheck;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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

    public void BoxCheck(ActionEvent actionEvent) {                     //Function des CheckBox
        if(TextField.getText().equals("")){

        }else{
            
        }

    }

    public void ActionClickFond(ActionEvent actionEvent) {              //Function pour la fieldFond


    }

    public void ActionClickTexte(ActionEvent actionEvent) {             //Function pour le fieldTexte


    }

    public void ActionClickCasse(ActionEvent actionEvent) {             //Function pour le fieldCasse


    }
}
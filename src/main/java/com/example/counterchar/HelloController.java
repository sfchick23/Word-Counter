package com.example.counterchar;

import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;

public class HelloController {
    private String result;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonMain;

    @FXML
    private RadioButton counterWhitespace;

    @FXML
    private RadioButton counterWord;

    @FXML
    private AnchorPane mainPain;

    @FXML
    private TextField textInput;

    @FXML
    private Text textOutput;

    @FXML
    void initialize() {
        buttonMain.setOnAction(event -> {
            System.out.println("click");
            if (!textInput.getText().equals("")) {

                int countChar = textInput.getText().length();
                result = String.valueOf(countChar);

                if (counterWord.isSelected()) {
                    int countWord = textInput.getText().split(" ").length;
                    result = countChar + " " + countWord;
                }


                textOutput.setText(result);
            }else {
                textOutput.setText("Please enter text");
            }

        });
    }

}






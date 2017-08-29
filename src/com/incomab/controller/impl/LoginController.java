/*
 * Developed by: Alexis Peralta Holyoak.
 */
package com.incomab.controller.impl;

import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author peral
 */
public class LoginController implements Initializable {

    @FXML
    private MaterialDesignIconView btnClose;
    @FXML
    private MaterialDesignIconView btnMinimize;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleClose(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void handleMinimize(MouseEvent event) {
        Stage stage = (Stage)((MaterialDesignIconView)event.getSource()).getScene().getWindow();
        // is stage minimizable into task bar. (true | false)
        stage.setIconified(true);
    }
    
    
}

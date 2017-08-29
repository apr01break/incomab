/*
 * Developed by: Alexis Peralta Holyoak.
 */
package com.incomab.controller.impl;

import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author peral
 */
public class LoginController implements Initializable {
   private final double IMG_WIDTH = 900;
    private final double IMG_HEIGHT = 600;
    Image imgCajamarca;
    Image imgChiclayo;
    Image imgLoro;
    private final int NUM_OF_IMGS = 3;
    private final int SLIDE_FREQ = 4; // in secs
    @FXML
    private MaterialDesignIconView btnClose;
    @FXML
    private MaterialDesignIconView btnMinimize;
    private ImageView bckLogin;
    @FXML
    private HBox hbxLogin;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // load url of images
            FileInputStream inImgChiclayo=new FileInputStream("src/com/incomab/view/images/chiclayo.png");
            FileInputStream inImgCajamarca=new FileInputStream("src/com/incomab/view/images/cajamarca.png");
            FileInputStream inImgLoro=new FileInputStream("src/com/incomab/view/images/loro.png");
            //define image
            imgChiclayo=new Image(inImgChiclayo);
            imgCajamarca=new Image(inImgCajamarca);
            imgLoro=new Image(inImgLoro);
            //create imageview
            ImageView vwChiclayo=new ImageView(imgChiclayo);
            ImageView vwCajamarca=new ImageView(imgCajamarca);
            ImageView vwLoro=new ImageView(imgLoro);
            //fil the HBox
            hbxLogin.getChildren().addAll(vwChiclayo,vwCajamarca,vwLoro);
            //transition
            EventHandler<ActionEvent> slideAction = (ActionEvent t) -> {
                TranslateTransition trans = new TranslateTransition(Duration.seconds(1.5), hbxLogin);           
                trans.setByX(-IMG_WIDTH);
                trans.setInterpolator(Interpolator.EASE_BOTH);
                trans.play();
            };
            //eventHandler
            EventHandler<ActionEvent> resetAction = (ActionEvent t) -> {
                TranslateTransition trans = new TranslateTransition(Duration.seconds(1), hbxLogin);
                trans.setByX((NUM_OF_IMGS - 1) * IMG_WIDTH);
                trans.setInterpolator(Interpolator.EASE_BOTH);
                trans.play();
            };
            //handle frames of animation
            List<KeyFrame> keyFrames = new ArrayList<>();
            for (int i = 1; i <= NUM_OF_IMGS; i++) {
                if (i == NUM_OF_IMGS) {
                    keyFrames.add(new KeyFrame(Duration.seconds(i * SLIDE_FREQ), resetAction));
                } else {
                    keyFrames.add(new KeyFrame(Duration.seconds(i * SLIDE_FREQ), slideAction));
                }
            }
            //add timeLine
            Timeline anim = new Timeline(keyFrames.toArray(new KeyFrame[NUM_OF_IMGS]));
            anim.setCycleCount(Timeline.INDEFINITE);
            anim.playFromStart();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }       
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

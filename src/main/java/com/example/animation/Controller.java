package com.example.animation;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ImageView myImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // translate - move image on scene
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(myImage); // add image to translate object
        translate.setDuration(Duration.millis(1000)); // duration time
        translate.setCycleCount(TranslateTransition.INDEFINITE); // cycle time
        translate.setByX(400); // translate along x axis
        translate.setByY(-250); // translate along y axis (to move up negative argument, to move down positive argument)
        translate.setAutoReverse(true); // allows image to reverse at end of translation (by default it's false)
        translate.play(); // allows us to start the program with current configuration

        // rotate
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(myImage); // add image to rotate object
        rotate.setDuration(Duration.millis(200)); // duration time
        rotate.setCycleCount(TranslateTransition.INDEFINITE); // cycle time
        rotate.setInterpolator(Interpolator.LINEAR); // makes a smoother transition towards the end of a cycle
        rotate.setByAngle(360); // rotates image 360 degrees
        rotate.setAxis(Rotate.Z_AXIS); // rotates along z axis (default)
        rotate.play(); // allows us to start the program with current configuration

        // fade
        FadeTransition fade = new FadeTransition();
        fade.setNode(myImage); // add image to translate object
        fade.setDuration(Duration.millis(500)); // duration time
        fade.setCycleCount(TranslateTransition.INDEFINITE); // cycle time
        fade.setInterpolator(Interpolator.LINEAR); // makes a smoother transition towards the end of a cycle
        fade.setFromValue(1); // beginning opacity
        fade.setToValue(0.7); // ending opacity
        fade.play();

        // scale - changes dimension of image
        ScaleTransition scale = new ScaleTransition();
        scale.setNode(myImage); // add image to translate object
        scale.setDuration(Duration.millis(500)); // duration time
        scale.setCycleCount(TranslateTransition.INDEFINITE); // cycle time
        scale.setInterpolator(Interpolator.LINEAR); // makes a smoother transition towards the end of a cycle
        scale.setByX(0.5); // image stretches twice as large horizontally if set to 2 (if set less than 1, it shrinks)
        scale.setByY(0.5); // image stretches twice as large vertically if set to 2
        scale.setAutoReverse(true);
        scale.play();
    }
}
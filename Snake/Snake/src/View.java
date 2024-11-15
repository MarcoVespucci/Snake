
    import javafx.scene.control.Label;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class View extends BorderPane{
    Rectangle snake;
    Stage stage;
    double sceneHeight = 200, sceneWidth = 500;
    Pane centerPane = new Pane();
    HBox bottomPane = new HBox();
    int fruiteaten = 0;

    public View(Stage stage,double centerX, double centerY, double radius){
        this.stage = stage;
        displaySetup(centerX, centerY, radius);
    }
    public void displaySetup(double centerX, double centerY, double radius){
        ball = new Circle(centerX, centerY, radius);
        centerPane.getChildren().add(ball);

        
        Label my_label = new Label("Total Bounces" + bounceCount);
        bottomPane.getChildren().add(my_label);
        
        setCenter(centerPane);
        setBottom(bottomPane);
    
        Scene scene = new Scene(this, sceneWidth, sceneHeight);
        stage.setScene(scene);
        stage.setResizable(false);
        
    }
    public void show(){
        stage.show();
        requestFocus();
    }
    public void updatePos(double centerX, double centerY){
        ball.setCenterX(centerX);
        ball.setCenterY(centerY);
    }
    public double getSceneWidth(){
        return this.sceneWidth;
    }
    public double getSceneHeight(){
        return this.sceneHeight;
    }

    public void setLabel(int bounceCount){
        Label my_label = (Label) bottomPane.getChildren().get(0);
        my_label.setText("Total Bounces: "+bounceCount);
    }
}


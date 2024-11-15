import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SnakeGame extends GridPane {


    public SnakeGame(int size){



        //to add the tiles
        for(int row = 0; row < size; row++){
            for(int column = 0; column < size; column++){
 
            }
        }

        Pane pane = new Pane();
        pane.setStyle("-fx-background-color: black;");
        pane.setPrefSize(size, size);
        Rectangle snake = new Rectangle(10, 10, Color.GREEN);
        pane.getChildren().addAll(snake);
        ArrayList<Rectangle> list = new ArrayList<>();
        


    }
    
    
}

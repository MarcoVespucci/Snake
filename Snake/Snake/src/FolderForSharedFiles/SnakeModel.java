import java.util.ArrayList;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class SnakeModel {
    double topEdge, bottomEdge, leftEdge, rightEdge;    
    double speed = 1;
    int dirX = 1, dirY = 0;
    Rectangle snake;

    public SnakeModel(int size){
        /*ArrayList<Rectangle> body = new ArrayList<>();
        for(int i = 0; i<size; i++){
            Rectangle snake = new Rectangle(10, 10, Color.GREEN);
            body.add(snake);
        }*/
        snake = new Rectangle(size, size, Color.GREEN);
        topEdge = 0;
        leftEdge = 0;
        rightEdge = size;
        bottomEdge = size;
    }

    public void moveSnake(double sceneWidth, double sceneHeight, Circle ball, Rectangle paddle){

        //kill the snake when it hits a wall
        /*if(topEdge >= sceneHeight || bottomEdge >= sceneHeight || leftEdge >= sceneHeight || rightEdge >= sceneHeight || topEdge <= 0 || bottomEdge <= 0 || leftEdge <= 0 || rightEdge <= 0 ){
            end();///create an end method.
        }
        if(centerX >= sceneWidth-radius || centerX <= radius){
            
        }*/
        if(leftEdge < 0 || topEdge < 0 || rightEdge > sceneWidth || bottomEdge > sceneHeight) {
            System.out.println("game over");
        }

        leftEdge = leftEdge + dirX*speed;
        rightEdge = rightEdge + dirX*speed;
        topEdge = topEdge + dirY*speed;
        bottomEdge = bottomEdge + dirY*speed;
    }
}

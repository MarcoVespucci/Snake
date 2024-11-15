import javafx.scene.input.KeyCode;

public class Controler {
    public SnakeGame snake;
    public View view;

    public Controler(View view, SnakeGame snake){
        this.snake = snake;
        this.view = view;
        setUpControls();
    }

    public void setUpControls(){
        view.setOnKeyPressed(e->{
            if(e.getCode() == KeyCode.UP){
                
            }
            if(e.getCode() == KeyCode.DOWN){
                
            }
            if(e.getCode() == KeyCode.LEFT){
                
            }
            if(e.getCode() == KeyCode.RIGHT){
                
            }
        });
    }
}

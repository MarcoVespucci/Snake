import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class View extends BorderPane {
    ArrayList<Rectangle> tiles = new ArrayList<>();
    Stage stage;
    GridPane tileGrid = new GridPane();
    HBox bottomPane = new HBox();
    HBox upperPane = new HBox();
    double sceneWidth = 600, sceneHeight = 600;
    int time = 0, score = 0;
    int rows = 9, columns = 9; // Adjust grid size for the Snake game

    /**
     * Setting up the view of the game
     * @param stage
     */
    public View(Stage stage) {
        this.stage = stage;
        displaySetup();
        setGrid();
    }

    /**
     * Displaying the setup of the game
     */
    public void displaySetup() {
        setCenter(tileGrid);
        setBottom(bottomPane);
        setTop(upperPane);

        tileGrid.setAlignment(Pos.CENTER);

        Label myLabel = new Label("Time elapsed: " + time + " s");
        bottomPane.getChildren().add(myLabel);
        bottomPane.setAlignment(Pos.CENTER);
        Label newLabel = new Label("Score: " + score + " 🍎");
        upperPane.getChildren().add(newLabel);
        upperPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(this, sceneWidth, sceneHeight);
        stage.setScene(scene);
        stage.setResizable(false);
    }

    /**
     * Setting the tile grid with a checkerboard pattern
     */
    public void setGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Rectangle tile = new Rectangle(60, 60);
                
                // Checkerboard pattern: alternate between dark and light green
                if ((i + j) % 2 == 0) {
                    tile.setFill(Color.GREEN); // Dark green tile
                } else {
                    tile.setFill(Color.LIGHTGREEN); // Light green tile
                }
                
                tiles.add(tile);
                tileGrid.add(tile, j, i); // Note: GridPane uses (column, row)
            }
        }
    }

    /**
     * Returning a specific tile
     * @param index - index of the tile
     * @return - the tile at the given index
     */
    public Rectangle getTile(int index) {
        return tiles.get(index);
    }

    /**
     * Showing the setup
     */
    public void show() {
        stage.show();
        // this will ensure that the methods of the listener will actually work
        stage.requestFocus();
    }

    /**
     * Showing the elapsed time
     * @param timeElapsed - the time elapsed
     */
    public void setLabel(int timeElapsed) {
        Label my_label = (Label) bottomPane.getChildren().get(0);
        my_label.setText("Elapsed time: " + timeElapsed + " s");
    }
}

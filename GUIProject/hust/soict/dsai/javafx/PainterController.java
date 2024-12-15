package hust.soict.dsai.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class PainterController {
    @FXML
    private Pane drawingAreaPane;

    private boolean isEraserMode = false;

    @FXML
    void clearButtonPressed(ActionEvent event){
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void toggleEraserMode(ActionEvent event) {
        isEraserMode = !isEraserMode;
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event){
        if (isEraserMode) {
            for (int i = 0; i < drawingAreaPane.getChildren().size(); i++) {
                Shape shape = (Shape) drawingAreaPane.getChildren().get(i);
                if (shape.contains(event.getX(), event.getY())) {
                    drawingAreaPane.getChildren().remove(shape);
                    break;
                }
            }
        } else {
            Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
            drawingAreaPane.getChildren().add(newCircle);
        }
    }
}
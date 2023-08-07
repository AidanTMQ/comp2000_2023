// Author: Aidan Taylor

import java.awt.Color;

public class Bird extends Actor {
    public Bird(Cell cell) {
        super(cell);
        super.setImg("src\\Assets\\bird.png");
        cell.bgColor = Color.green;
    }
}

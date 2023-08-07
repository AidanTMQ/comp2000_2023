// Author: Aidan Taylor

import java.awt.Color;

public class Mouse extends Actor {
    public Mouse(Cell cell) {
        super(cell);
        super.setImg("src\\Assets\\mouse.png");
        cell.bgColor = Color.red;
    }
}

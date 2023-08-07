// Author: Aidan Taylor

import java.awt.Color;

public class Cat extends Actor {
    public Cat(Cell cell) {
        super(cell);
        super.setImg("src\\Assets\\cat.png");
        cell.bgColor = Color.blue;
    }
}

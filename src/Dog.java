// Author: Aidan Taylor

import java.awt.Color;

public class Dog extends Actor {
    public Dog(Cell cell){
        super(cell);
        super.setImg("src\\Assets\\dog.png");
        cell.bgColor = Color.yellow;
    }
}

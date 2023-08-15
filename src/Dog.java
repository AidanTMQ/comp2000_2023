// Author: Aidan Taylor

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;


public class Dog extends Actor {
    public Dog(Cell cell){
        super(cell);
        super.setImg("src\\Assets\\dog.png");
        cell.bgColor = Color.yellow;
    }

    @Override
    public void paint(Graphics g) {
        Polygon ear1 = new Polygon();
        ear1.addPoint(cell.x + 5, cell.y + 5);
        ear1.addPoint(cell.x + 15, cell.y + 5);
        ear1.addPoint(cell.x + 5, cell.y + 15);
        Polygon ear2 = new Polygon();
        ear2.addPoint(cell.x + 20, cell.y + 5);
        ear2.addPoint(cell.x + 30, cell.y + 5);
        ear2.addPoint(cell.x + 30, cell.y + 15);
        Polygon face = new Polygon();
        face.addPoint(cell.x + 8, cell.y + 7);
        face.addPoint(cell.x + 27, cell.y + 7);
        face.addPoint(cell.x + 27, cell.y + 25);
        face.addPoint(cell.x + 8, cell.y + 25);

        g.setColor(new Color(232, 207, 81));
        g.fillPolygon(face);
        g.setColor(Color.black);
        g.drawPolygon(face);
        g.setColor(new Color(232, 207, 81));
        g.fillPolygon(ear1);
        g.fillPolygon(ear2);
        g.setColor(Color.black);
        g.drawPolygon(ear1);
        g.drawPolygon(ear2);
    }
}

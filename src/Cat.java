// Author: Aidan Taylor

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Cat extends Actor {
    public Cat(Cell cell) {
        super(cell);
        super.setImg("src\\Assets\\cat.png");
        cell.bgColor = Color.blue;
    }


    @Override
    public void paint(Graphics g) {
        Polygon ear1 = new Polygon();
        ear1.addPoint(cell.x + 11, cell.y + 5);
        ear1.addPoint(cell.x + 15, cell.y + 15);
        ear1.addPoint(cell.x + 7, cell.y + 15);
        Polygon ear2 = new Polygon();
        ear2.addPoint(cell.x + 22, cell.y + 5);
        ear2.addPoint(cell.x + 26, cell.y + 15);
        ear2.addPoint(cell.x + 18, cell.y + 15);
        Polygon face = new Polygon();
        face.addPoint(cell.x + 5, cell.y + 15);
        face.addPoint(cell.x + 29, cell.y + 15);
        face.addPoint(cell.x + 17, cell.y + 30);
        
        g.setColor(Color.white);
        g.fillPolygon(face);
        g.setColor(Color.black);
        g.drawPolygon(face);
        g.setColor(Color.orange);
        g.fillPolygon(ear1);
        g.setColor(Color.black);
        g.fillPolygon(ear2);
        g.drawPolygon(ear1);
        g.drawPolygon(ear2);      
    }

}
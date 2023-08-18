// Author: Aidan Taylor

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.HashMap;


public class Dog extends Actor {
    public Dog(Cell cell){
        super(cell);
        super.setImg("src\\Assets\\dog.png");
        cell.bgColor = Color.yellow;
        polygons = new HashMap<String,Polygon>();
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
        polygons.put("ear1", ear1);
        polygons.put("ear2", ear2);
        polygons.put("face", face);
    }

    @Override
    public void paint(Graphics g) {


        g.setColor(new Color(232, 207, 81));
        g.fillPolygon(this.polygons.get("face"));
        g.setColor(Color.black);
        g.drawPolygon(this.polygons.get("face"));
        g.setColor(new Color(232, 207, 81));
        g.fillPolygon(this.polygons.get("ear1"));
        g.fillPolygon(this.polygons.get("ear2"));
        g.setColor(Color.black);
        g.drawPolygon(this.polygons.get("ear1"));
        g.drawPolygon(this.polygons.get("ear2"));
    }
}

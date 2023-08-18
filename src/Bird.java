// Author: Aidan Taylor

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.HashMap;

public class Bird extends Actor {
    public Bird(Cell cell) {
        super(cell);
        super.setImg("src\\Assets\\bird.png");
        cell.bgColor = Color.green;
        this.polygons = new HashMap<String,Polygon>();
        Polygon wing1 = new Polygon();
            wing1.addPoint(cell.x + 5, cell.y + 5);
            wing1.addPoint(cell.x + 15, cell.y + 17);
            wing1.addPoint(cell.x + 5, cell.y + 17);
        this.polygons.put("wing1", wing1);
        Polygon wing2 = new Polygon();
            wing2.addPoint(cell.x + 30, cell.y + 5);
            wing2.addPoint(cell.x + 20, cell.y + 17);
            wing2.addPoint(cell.x + 30, cell.y + 17);
        this.polygons.put("wing2", wing2);
        Polygon body = new Polygon();
            body.addPoint(cell.x + 15, cell.y + 10);
            body.addPoint(cell.x + 20, cell.y + 10);
            body.addPoint(cell.x + 20, cell.y + 25);
            body.addPoint(cell.x + 15, cell.y + 25);
        polygons.put("body", body);
    }
    
    @Override
    public void paint(Graphics g) {

    g.fillPolygon(this.polygons.get("body"));
    g.fillPolygon(this.polygons.get("wing1"));
    g.fillPolygon(this.polygons.get("wing2"));

    g.drawPolygon(this.polygons.get("body"));
    g.drawPolygon(this.polygons.get("wing1"));
    g.drawPolygon(this.polygons.get("wing2"));

    }
}

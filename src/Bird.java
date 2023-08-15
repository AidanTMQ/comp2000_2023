// Author: Aidan Taylor

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Bird extends Actor {
    public Bird(Cell cell) {
        super(cell);
        super.setImg("src\\Assets\\bird.png");
        cell.bgColor = Color.green;
    }
    
    @Override
    public void paint(Graphics g) {
      Polygon wing1 = new Polygon();
      wing1.addPoint(cell.x + 5, cell.y + 5);
      wing1.addPoint(cell.x + 15, cell.y + 17);
      wing1.addPoint(cell.x + 5, cell.y + 17);
      Polygon wing2 = new Polygon();
      wing2.addPoint(cell.x + 30, cell.y + 5);
      wing2.addPoint(cell.x + 20, cell.y + 17);
      wing2.addPoint(cell.x + 30, cell.y + 17);
      Polygon body = new Polygon();
      body.addPoint(cell.x + 15, cell.y + 10);
      body.addPoint(cell.x + 20, cell.y + 10);
      body.addPoint(cell.x + 20, cell.y + 25);
      body.addPoint(cell.x + 15, cell.y + 25);

      g.fillPolygon(body);
      g.fillPolygon(wing1);
      g.fillPolygon(wing2);

      g.drawPolygon(body);
      g.drawPolygon(wing1);
      g.drawPolygon(wing2);
    }
}

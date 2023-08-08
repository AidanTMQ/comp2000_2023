// Author: Aidan Taylor
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
public class Cell extends Rectangle{
  // fields
  int x;
  int y;
  static int size = 200;
  Actor actor;
  Color bgColor = Color.WHITE;
  // constructors
  public Cell(int inX, int inY) {
    super(inX, inY,size,size);
    x = inX;
    y = inY;
  }

  // methods
  public void paint(Graphics g, Point mousePos) {
    if(contains(mousePos)) {
      g.setColor(Color.GRAY);
    } else {
      g.setColor(this.bgColor);
    }
    g.fillRect(x, y, size, size);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, size, size);
    if (actor != null) {
      actor.paint(g);
    }
  }


  @Override
  public boolean contains(Point p) {
    if(p != null) {
      return super.contains(p);
    } else {
      return false;
    }
  }
}

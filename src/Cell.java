import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
class Cell {
    protected int x;
    protected int y;
    protected Dimension dim;
    public Cell(int x , int y , Dimension dim){
        this.dim = dim;
        this.x = x;
        this.y = y;
    }
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(this.x, this.y, this.dim.width,this.dim.height);
        g.setColor(Color.BLACK);
        g.drawRect(this.x, this.y, this.dim.width,this.dim.height);
   
    }
}
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;
class Cell {
    protected int x;
    protected int y;
    protected int xl;
    protected int yl;
    protected Dimension dim;
    public Cell(int x , int y , Dimension dim,Point addr){
        this.dim = dim;
        this.x = x;
        this.y = y;
        this.xl = addr.x;
        this.yl = addr.y;
    }
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(this.x, this.y, this.dim.width,this.dim.height);
        g.setColor(Color.BLACK);
        g.drawRect(this.x, this.y, this.dim.width,this.dim.height);
        g.drawString(this.xl+","+this.yl,this.x+5,this.y+dim.height/2);
    }

    
}
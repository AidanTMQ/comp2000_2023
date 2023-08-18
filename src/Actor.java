import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashMap;
import java.awt.Polygon;
public class Actor {
    protected Cell cell;
    protected Image img;
    protected HashMap<String,Polygon> polygons;
    
    public Actor(Cell cell){
        setCell(cell);
    }
    public Actor(Actor actor) {
        this.cell = actor.cell;
        this.img = actor.img;
    }

    
    public void setCell(Cell cell) {
        this.cell = cell;
        if (cell.actor != this){
            cell.actor = this;
        }
    }
    public void paint(Graphics g) {
            g.drawImage(this.img, this.cell.x, this.cell.y,this.cell.width,this.cell.height, null);
    }
    public void setImg(String path){
        this.img = Toolkit.getDefaultToolkit().getImage(path);
    }
}


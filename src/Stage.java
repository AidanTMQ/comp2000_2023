import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Point;
public class Stage {
    protected Grid grid;
    protected ArrayList<Actor> actors;
    public Stage(Grid grid,ArrayList<Actor> actors){
        this.grid = grid;
        this.actors = actors;
    }
    
    public void paint(Graphics g, Point mousePos) {
        grid.paint(g, mousePos);
    }
    public void addActor(Actor actor,Point gridPos){
        grid.cells[gridPos.x][gridPos.y].actor = actor;
        actor.setCell(grid.cells[gridPos.x][gridPos.y]);
        actors.add(actor);
    }
}

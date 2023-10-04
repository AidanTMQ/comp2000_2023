import java.awt.Color;
import java.awt.Graphics;

public class Horse extends Actor {
  protected Motif motif;
  public Horse(Cell inLoc, boolean isHuman) {
    super(inLoc, new Color(0), isHuman,3);
    this.strat = new KnightsMove();
    motif = new Motif("assets/Chess_tile_nl.png");
  }
  @Override
  public void paint(Graphics g){
    this.motif.draw(g,this.loc.x,this.loc.y,this.color);
  }
  @Override
  public void setLocation(Cell inLoc) {
    loc = inLoc;
  }
  @Override
  protected void setPoly() {
  }
}
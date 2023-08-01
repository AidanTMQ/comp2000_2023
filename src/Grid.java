import java.awt.*;

class Grid {
    protected Dimension dim;
    protected Dimension cellD;
    Cell [][] cells;

    public Grid (Dimension dim,Dimension cellD){
        this.dim = dim;
        this.cellD=cellD;

        int rows = dim.width/cellD.width;
        int cols = dim.height/cellD.height;
        this.cells = new Cell[cols][rows];
        int xi = 0;
        int yi = 0;
        for (int y = 0; y < dim.height; y += cellD.height) {
            xi=0;
            for (int x = 0; x < dim.height; x += cellD.width) {
            if (xi < cols && yi < rows){
                    this.cells[xi][yi] = new Cell(x,y,cellD);
                }
                
                xi++;
            }
            yi++;
            
        }
    }

    public void paint(Graphics g){
        for(Cell[] cols:this.cells){
            for (Cell c:cols){
                c.paint(g);
                // System.out.println(c.x+" "+c.y);
            }
        }
    }
}
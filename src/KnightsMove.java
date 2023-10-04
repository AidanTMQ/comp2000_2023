import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class KnightsMove implements MoveStrategy {
  @Override
  public Cell chooseNextLoc(List<Cell> possibleLocs) {
    List<Cell> legalMoves = new ArrayList<Cell>();
    Cell currLM = possibleLocs.get(0);
    for(Cell pl:possibleLocs){
        if (pl.equals(currLM))legalMoves.add(pl);
        if (pl.col >2||pl.row >2)continue;
        if (Math.floor(Math.abs(currLM.col-pl.col)+Math.abs(currLM.row-pl.row))==3);
    }
    int i = (new Random()).nextInt(legalMoves.size());
    return legalMoves.get(i);
  }

  public String toString() {
    return "Knights Movement (L Shaped)";
  }
}

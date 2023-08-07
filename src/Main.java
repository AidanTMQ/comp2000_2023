import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.util.ArrayList;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

    class Canvas extends JPanel {
      Grid grid = new Grid();
      ArrayList<Actor> actors = new ArrayList<Actor>();
      Stage stage;
      
      public Canvas() {
        setPreferredSize(new Dimension(720, 720));
        actors.add(new Bird(grid.getCell(0, 0)));
        actors.add(new Dog(grid.getCell(1, 0)));
        actors.add(new Cat(grid.getCell(2, 0)));
        actors.add(new Mouse(grid.getCell(3, 0)));

        stage = new Stage(grid,actors);
      }

      @Override
      public void paint(Graphics g) {
        stage.paint(g, getMousePosition());
      }
    }

    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
    }

    public void run() {
      while(true) {
        repaint();
      }
    }
}

import java.awt.*;
import javax.swing.*;


public class Main extends JFrame{
    public static void main(String[] args) throws Exception{
        Main window = new Main();
    }
    

    class Canvas extends JPanel{
        public Canvas(){
            setPreferredSize(new Dimension(720,720));

        }
        @Override
        public void paint(Graphics g){
            // for(int y = 0;y<this.getHeight()-10;y+=35){
            //     for(int x = 0;x<this.getWidth()-10;x+=35){
            //         g.drawRect(x,y,35,35);
            //     }
            // }
            for(int y = 0;y<710;y+=35){
                for(int x = 0;x<710;x+=35){
                    g.setColor(Color.WHITE);
                    g.fillRect(x,y,35,35);
                    g.setColor(Color.BLACK);
                    g.drawRect(x,y,35,35);
                    
                }
            }
            
        }
    }

    private Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }
}
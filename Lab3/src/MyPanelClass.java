import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
                        int centerWidth = (getWidth() / 2) - 27;
                        int centerHeight = (getHeight() / 2) - 27;
 
                        //Paint the background
                        g.setColor(Color.BLUE);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
//                        //Draw a border
//                        g.setColor(Color.RED);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw another border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1 + 20, y1 + 20, width - 40, height - 40);
                        
//                        //Draw diagonal lines
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        //Draw diagonal lines
//                        g.setColor(Color.GRAY);
//                        g.drawLine(x2, y1, x1, y2);
//                        
                        //Draw an oval
                        g.setColor(Color.LIGHT_GRAY);
                        g.drawOval(centerWidth, centerHeight, 55, 55);
                        
                        
            }
}
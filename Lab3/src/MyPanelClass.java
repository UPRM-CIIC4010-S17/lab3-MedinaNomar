import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;

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
                        g.setColor(Color.RED);
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
//                        //Draw an oval
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.drawOval(centerWidth, centerHeight, 55, 55);
//                        
//                          Polygon p = new Polygon();
//                          p.addPoint(x1 + 5, y1 + 25);
//                          p.addPoint(x1 + 20, y1 + 10);
//                          p.addPoint(x1 + 35, y1 + 25);
//                          p.addPoint(x1 + 25, y1 + 25);
//                          p.addPoint(x1 + 25, y1 + 45);
//                          p.addPoint(x1 + 15, y1 + 45);
//                          p.addPoint(x1 + 15, y1 + 25);
//                          g.setColor(Color.YELLOW);
//                          g.fillPolygon(p);
                        //Fill in rectangles
                        Rectangle r = new Rectangle();
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1 + 32, getWidth(), 32);
                        
                        r.translate(x1, y1 + 32);
                        g.fillRect(x1, y1 + 96, getWidth(), 32);
                            //Fill the triangle
                        	Polygon p = new Polygon();
                        	p.addPoint(x1, y1);
                        	p.addPoint(x1 + 118, y1 + 80);
                        	p.addPoint(x1 , y2);
                        	g.setColor(Color.BLUE);
                        	g.fillPolygon(p);
                        	
                            
                            //Draw a star
                            Polygon p2 = new Polygon();
                            p2.addPoint(x1 + 25, y1 + 73);
                            p2.addPoint(x1 + 41, y1 + 73);
                            p2.addPoint(x1 + 47, y1 + 58);
                            p2.addPoint(x1 + 53, y1 + 73);
                            p2.addPoint(x1 + 69, y1 + 73);
                            p2.addPoint(x1 + 56, y1 + 83);
                            p2.addPoint(x1 + 61, y1 + 98);
                            p2.addPoint(x1 + 47, y1 + 88);
                            p2.addPoint(x1 + 34, y1 + 98);
                            p2.addPoint(x1 + 38, y1 + 83);
                            g.setColor(Color.WHITE);
                            g.fillPolygon(p2);
                            
                        
            }
}
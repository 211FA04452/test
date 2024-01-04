import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.geom.Path2D;
import javax.swing.JFrame;

public class Drawing extends Canvas{
    public static void main(String[] args) {
	    JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(800,800);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
       }
      public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillArc(200,80,150,100,0,180);
		g.setColor(new Color(245,222,179));
		g.fillArc(200,50,150,145,180,180);
		g.fillArc(228,65,90,75,180,180);
		g.fillArc(212,102,49,36,90,150);
		g.fillArc(307,103,29,40,0,270);
		g.setColor(new Color(220,20,60));
		g.fillArc(207,151,150,120,145,270);
		g.fillArc(300,158,170,54,140,170);
		g.fillArc(105,165,170,54,220,180);
		g.setColor(new Color(245,222,179));
		g.fillArc(195,135,143,85,135,270);
		g.fillArc(280,135,80,45,270,160);
		g.fillArc(420,198,20,20,0,360);
		g.fillArc(124,201,20,20,0,360);
		g.setColor(Color.black);
		g.fillArc(201,113,22,38,90,180);
		g.fillArc(326,112,24,36,270,180);
		g.fillArc(229,142,27,27,0,360);
		g.fillArc(284,142,27,27,0,360);
		g.setColor(Color.black);
		g.drawArc(230,129,21,15,0,180);
		g.drawArc(286,129,21,15,0,180);
		g.setColor(new Color(210,105,30));
		g.fillArc(235,194,18,20,0,360);
		Graphics2D g2=(Graphics2D)g;
		g2.setColor(new Color(245,222,179));
		g2.fillRoundRect(238,260,23,90,20,20);
		g2.fillRoundRect(310,257,23,90,20,20);
		g2.setColor(new Color(255,215,0));
		g2.fillRoundRect(220,269,63,50,15,15);
		g2.fillRoundRect(284,269,63,50,15,15);
		g2.setColor(new Color(220,20,60));
		g2.fillRoundRect(210,221,145,60,10,10);
		g.setColor(new Color(255,215,0));
        g.fillOval(239,339,22,19);
		g.fillOval(230,343,20,14);
		g.fillOval(306,338,22,19);
	    g.fillOval(320,342,20,15);
		try{
	    for(int i=0;i<50;i++){
		Thread.sleep(2000);
		g.setColor(Color.white);
		g.fillArc(236,150,11,10,0,360);
		g.fillArc(291,150,11,10,0,360);
		Thread.sleep(2000);
		g.setColor(Color.black);
		g.fillArc(236,150,11,10,0,360);
		g.fillArc(291,150,11,10,0,360);
		}
		}
		catch(Exception e){}
	  }
}
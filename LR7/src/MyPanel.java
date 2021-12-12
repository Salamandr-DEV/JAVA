import java.awt.*;
import javax.swing.JPanel;

public class MyPanel extends JPanel{ 
	public static enum Figure {LINE,OVAL,RECT,ROUNDRECT,SURNAME,CLEAR};
	private Figure vibor = Figure.CLEAR; 
	
	public MyPanel() { } 
	public void ris(String s) {
		vibor = Figure.valueOf(s);
		repaint();
	}
	public void paintComponent(Graphics gr){ 
		super.paintComponent(gr);
		Graphics2D g = (Graphics2D)gr;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
		BasicStroke pen;
		switch (vibor){
			case LINE: g.drawLine(20, 20, 100, 100); break;
			case OVAL: g.drawOval(20, 20, 100, 100); break;
			case RECT: g.drawRect(20, 20, 100, 100); break;
			case ROUNDRECT: g.drawRoundRect(20, 20, 100, 100,60,60); break;
			case SURNAME: 
				float[] dash = {10, 30};
				
				g.setColor(Color.red); 
				
				g.drawLine(20, 20, 50, 100); // V
				g.drawLine(80, 20, 50, 100); // V
				
				g.setColor(Color.green); 
				
				g.drawLine(110, 20, 80, 100); // A
 				g.drawLine(110, 20, 140, 100); // A
				g.drawLine(95, 60, 125, 60); // A
				
				g.setColor(Color.blue); 
				
				g.drawLine(170, 40, 155, 20); // S
				g.drawLine(155, 20, 140, 40); // S
				g.drawLine(140, 40, 170, 80); // S
				g.drawLine(170, 80, 155, 100); // S
				g.drawLine(155, 100, 140, 80); // S
				
				g.setPaint(new GradientPaint(30, 30, Color.red, 50, 50, Color.green, true));
				
				g.drawLine(200, 20, 200, 100); // I
				
				g.drawLine(230, 20, 230, 100); // L
				g.drawLine(230, 100, 260, 100); // L
				
				g.setPaint(new GradientPaint(30, 30, Color.CYAN, 50, 50, Color.gray, true));
				
				g.drawLine(275, 20, 275, 100); // E
				g.drawLine(275, 20, 305, 20); // E
				g.drawLine(275, 60, 305, 60); // E
				g.drawLine(275, 100, 305, 100); // E
				
				g.drawLine(320, 20, 320, 100); // N
				g.drawLine(320, 20, 350, 100); // N
				g.drawLine(350, 20, 350, 100); // N
				
				g.setPaint(new GradientPaint(30, 30, Color.MAGENTA, 50, 50, Color.ORANGE, true));
				
				g.drawLine(365, 20, 365, 100); // K
				g.drawLine(395, 20, 365, 60); // K
				g.drawLine(365, 60, 395, 100); // K
				
				g.drawLine(425, 20, 410, 60); // O
				g.drawLine(410, 60, 425, 100); // O
				g.drawLine(425, 20, 440, 60); // O
				g.drawLine(440, 60, 425, 100); break;
			case CLEAR: g.clearRect(0, 0, getSize().width, getSize().height);break;
		}
	}
}
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class LR7 extends JFrame implements ActionListener{
	private MyPanel myPanel = new MyPanel();
	
	public static void main(String[] args) {
		new LR7("Окно с графикой");
		}
	
	public LR7(String s){
		super(s);
		Box myBox = new Box(BoxLayout.X_AXIS);
		JButton[] figs = new JButton[6];
		for (int i = 0; i < 6; i++){
			figs[i] = new JButton(MyPanel.Figure.values()[i].toString()); figs[i].addActionListener(this); 
			myBox.add(figs[i]);
			if (i != 5){ 
				myBox.add(Box.createHorizontalGlue());
			}
		}
		myBox.setAlignmentX(CENTER_ALIGNMENT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); add(myBox,BorderLayout.NORTH); add(myPanel,BorderLayout.CENTER);
		Dimension size = getSize();
		size.setSize(size.width, size.height+200);
		setMinimumSize(size); pack(); setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		myPanel.ris(e.getActionCommand());
	} 
}
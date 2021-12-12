import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Panel;
import javax.swing.JSlider;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.JTree;
import javax.swing.JTextField;
import java.awt.Checkbox;
import java.awt.Color;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;

public class LR6 {
	private JFrame frame;
	private JTextField textField_8;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private Checkbox checkbox;
	private JRadioButton RadioButton;
	private JTree tree;
	private JButton btnNewButton;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LR6 window = new LR6();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LR6() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_top = new JPanel();
		frame.getContentPane().add(panel_top, BorderLayout.NORTH);
		panel_top.setLayout(new BoxLayout(panel_top, BoxLayout.X_AXIS));
		
		Box verticalBox_1 = Box.createVerticalBox();
		verticalBox_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_top.add(verticalBox_1);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		verticalBox_1.add(horizontalBox_1);
		
		Component horizontalStrut_17 = Box.createHorizontalStrut(20);
		horizontalBox_1.add(horizontalStrut_17);
		
		JLabel lblNewLabel = new JLabel("Метка 0");
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		horizontalBox_1.add(lblNewLabel);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalBox_1.add(horizontalStrut);
		
		JLabel lblNewLabel_1 = new JLabel("Метка 1");
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		horizontalBox_1.add(lblNewLabel_1);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalBox_1.add(horizontalStrut_1);
		
		JLabel lblNewLabel_2 = new JLabel("Метка 2");
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		horizontalBox_1.add(lblNewLabel_2);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalBox_1.add(horizontalStrut_2);
		
		JLabel lblNewLabel_3 = new JLabel("Метка 3");
		lblNewLabel_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		horizontalBox_1.add(lblNewLabel_3);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalBox_1.add(horizontalStrut_3);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_2);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setAlignmentX(Component.LEFT_ALIGNMENT);
		verticalBox_1.add(horizontalBox);
		
		Component horizontalStrut_16 = Box.createHorizontalStrut(20);
		horizontalBox.add(horizontalStrut_16);
		
		JLabel lblNewLabel_4 = new JLabel("Метка 4");
		lblNewLabel_4.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		horizontalBox.add(lblNewLabel_4);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalBox.add(horizontalStrut_4);
		
		JLabel lblNewLabel_5 = new JLabel("Метка 5");
		lblNewLabel_5.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		horizontalBox.add(lblNewLabel_5);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		horizontalBox.add(horizontalStrut_5);
		
		JLabel lblNewLabel_6 = new JLabel("Метка 6");
		lblNewLabel_6.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		horizontalBox.add(lblNewLabel_6);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		horizontalBox.add(horizontalStrut_6);
		
		Panel panel_center = new Panel();
		frame.getContentPane().add(panel_center, BorderLayout.EAST);
		panel_center.setLayout(new BoxLayout(panel_center, BoxLayout.X_AXIS));
		
		Box verticalBox = Box.createVerticalBox();
		panel_center.add(verticalBox);
		
		textField = new JTextField("Текстовое поле 1");
		textField.setColumns(10);
		verticalBox.add(textField);
		
		textField_1 = new JTextField("Текстовое поле 2");
		textField_1.setColumns(10);
		verticalBox.add(textField_1);
		
		textField_2 = new JTextField("Текстовое поле 3");
		textField_2.setColumns(10);
		verticalBox.add(textField_2);
		
		textField_3 = new JTextField("Текстовое поле 4");
		textField_3.setColumns(10);
		verticalBox.add(textField_3);
		
		textField_4 = new JTextField("Текстовое поле 5");
		textField_4.setColumns(10);
		verticalBox.add(textField_4);
		
		textField_5 = new JTextField("Текстовое поле 6");
		textField_5.setColumns(10);
		verticalBox.add(textField_5);
		
		textField_6 = new JTextField("Текстовое поле 7");
		textField_6.setColumns(10);
		verticalBox.add(textField_6);
		
		textField_7 = new JTextField("Текстовое поле 8");
		textField_7.setColumns(10);
		verticalBox.add(textField_7);
		

		JPanel panel_south = new JPanel();
		frame.getContentPane().add(panel_south, BorderLayout.SOUTH);
		panel_south.setLayout(new BoxLayout(panel_south, BoxLayout.X_AXIS));
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		panel_south.add(verticalStrut_1);
		
		Box panel_south_box = Box.createHorizontalBox();
		panel_south.add(panel_south_box);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		panel_south_box.add(horizontalStrut_7);
		
		checkbox = new Checkbox("Выбор 1");
		panel_south_box.add(checkbox);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		panel_south_box.add(horizontalStrut_8);
		
		RadioButton = new JRadioButton("Выбор 2");
		RadioButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_south_box.add(RadioButton);
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		panel_south_box.add(horizontalStrut_9);
		
		btnNewButton = new JButton("Кнопка");
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_south_box.add(btnNewButton);
		
		Component horizontalStrut_10 = Box.createHorizontalStrut(20);
		panel_south_box.add(horizontalStrut_10);
		
		textField_8 = new JTextField();
		textField_8.setText("Текстовое поле");
		textField_8.setColumns(10);
		panel_south_box.add(textField_8);
		
		Component horizontalStrut_11 = Box.createHorizontalStrut(20);
		panel_south_box.add(horizontalStrut_11);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		panel_south.add(verticalStrut);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		
		JSlider slider = new JSlider();
		slider.setOrientation(SwingConstants.VERTICAL);
		panel.add(slider);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		tree = new JTree();
		panel_1.add(tree);
		
		checkbox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				textField_8.setText("Выбор 1 = " + checkbox.getState());	
			}
		});
		
		RadioButton.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				textField_8.setText("Выбор 2 = " + RadioButton.getText());	
			}
		});
		
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			@Override
			public void valueChanged(TreeSelectionEvent e) {
				textField.setText("Дерево - " + tree.getLastSelectedPathComponent());
			}
		});
		
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				textField_1.setText("Слайдер - " + slider.getValue());
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int x = randInt(0, 255);
				int y = randInt(0, 255);
				int z = randInt(0, 255);
				tree.setBackground(new Color(x, y ,z));
			}
		});
	}	
	public static int randInt(int min, int max) {
        Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
}

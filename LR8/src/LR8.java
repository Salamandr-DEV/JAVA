import java.awt.*; 
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class LR8 extends JFrame{ 
	static File f1;
	private static HashMap<String, String> myHash = new HashMap<String, String>();
	static JPopupMenu myPopup;
	DefaultListModel<String> myListModel_2;
	
	public static void main(String[] args) {
		LR8 window= new LR8("Работа со списком"); window.setVisible(true);
		window.pack(); window.setMinimumSize(window.getSize());
	}
	
	public LR8(String s){
		super(s); 
		final DefaultListModel<String> myListModel = new DefaultListModel<String>(); 
		myListModel_2 = new DefaultListModel<String>(); 
		
		final JList<String> myList = new JList<String>();
		JScrollPane myScroll = new JScrollPane(myList);
		myList.setModel(myListModel);
		
		JList<String> myList_2 = new JList<String>();
		JScrollPane myScroll_2 = new JScrollPane(myList_2);
		myList_2.setModel(myListModel_2);
		
		myPopup = new JPopupMenu();
		JMenuItem myItem1 = new JMenuItem("Связать с файлом");
		myItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				loadFromFile(myList.getSelectedValue().toString());
			}
		});
		myPopup.add(myItem1);
		myList.setComponentPopupMenu(myPopup);
		
		myList.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) { 
				myList.setSelectedIndex(myList.locationToIndex(e.getPoint()));
			}
		});
		
		myList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String path = myHash.get(myList.getSelectedValue().toString()); 
				readDataFromFile(path);
			}
		});
		
		Box myBox1 = new Box(BoxLayout.Y_AXIS);
			final JTextField myText = new JTextField();
			myBox1.add(myText);
			Box box1 = new Box(BoxLayout.X_AXIS);
				JButton button1=new JButton("Добавить в список");
					box1.add(button1);
					button1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							myListModel.addElement(myText.getText()); 
						}		
				});
	
				JButton button2 = new JButton("Убрать из списка"); 
				button2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						while (myListModel.contains(myText.getText())){ 
							myListModel.removeElement(myText.getText());
						}
					}
				});
				
				box1.add(button2);
				JButton buttonClear = new JButton("Очистить список");
				buttonClear.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) { 
						myListModel.clear();
					}
				});
				box1.add(buttonClear);
				myBox1.add(box1);
				add(myScroll,BorderLayout.CENTER);
				add(myBox1,BorderLayout.NORTH); 	
				Box myBox2 = new Box(BoxLayout.X_AXIS);
		JButton button3=new JButton("Сохранить...");
		myBox2.add(button3);
		final FileDialog fdlg=new FileDialog(this, "");
		button3.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				fdlg.setMode(FileDialog.SAVE); 
				fdlg.setTitle("Сохранить файл"); 	
				fdlg.setVisible(true); 
				FileWriter myWriter = null;
				try { 
					myWriter=new FileWriter(fdlg.getDirectory()+fdlg.getFile());
					BufferedWriter myBWriter = new BufferedWriter(myWriter);
					for(int i=0;i<myListModel.getSize();i++){ 
						myBWriter.write(""+myListModel.getElementAt(i));
						myBWriter.newLine();
					}
					myBWriter.close();
					myWriter.close();
				} 
				catch (IOException e1) {
					e1.printStackTrace(); 
				}
			}
		});
		myBox2.add(Box.createHorizontalGlue()); 
		JButton button4=new JButton("Загрузить...");
		button4.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				fdlg.setMode(FileDialog.LOAD); 
				fdlg.setTitle("Загрузить файл");
				fdlg.setVisible(true); 
				FileReader myReader = null;
				try { 
					myReader=new FileReader(fdlg.getDirectory()+fdlg.getFile()); 
					myListModel.clear(); 
					BufferedReader myBReader=new BufferedReader(myReader);
					String s; 
					while ((s=myBReader.readLine())!=null){
						myListModel.addElement(s);
					}
					myBReader.close();
					myReader.close();
				} 
				catch (IOException e1) { 
					e1.printStackTrace();
				}
			}
		});
		myBox2.add(button4);
		add(myBox2,BorderLayout.SOUTH);
		
		Box centerBox=new Box(BoxLayout.X_AXIS);
		centerBox.add(myScroll); 
		centerBox.add(myScroll_2);
		add(centerBox,BorderLayout.CENTER);
	}
	
	public void readDataFromFile(String path)
	{
		try {
			if (path != null) {
				FileReader myReader =new FileReader(path); 
				myListModel_2.clear(); 
				BufferedReader myBReader=new BufferedReader(myReader);
				String s; 
				while ((s=myBReader.readLine())!=null){
					myListModel_2.addElement(s);
				}
				myBReader.close();
				myReader.close();
			}
			else 
				throw new IOException();
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void loadFromFile(String s){
		FileDialog fdlg = new FileDialog(this, "Загрузить данные",FileDialog.LOAD); 
		fdlg.setVisible(true);
		myHash.put(s, fdlg.getDirectory() + fdlg.getFile()); 
		readDataFromFile(fdlg.getDirectory() + fdlg.getFile());
	}
}
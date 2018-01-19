package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton addName;
	JButton viewNames;
	
	ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.start();
	}
	void start() {
		frame=new JFrame();
		panel=new JPanel();
		addName= new JButton("Add Name");
		viewNames = new JButton("View Names");
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		panel.add(addName);
		panel.add(viewNames);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed==addName) {
			String NameInput = JOptionPane.showInputDialog("Enter your name.");
			names.add(NameInput);
		}
		else if(buttonPressed==viewNames){
			String ViewName = "";
			for(int i=0; i<names.size(); i++) {
				System.out.println("for loop accessed");
				ViewName+= "Guest #"+(i+1)+ ": " + names.get(i)+"\n";
				if(names.size()>1) {
				if(i>0) {
					JOptionPane.showMessageDialog(null, ViewName);
				}
				}
				else {
					JOptionPane.showMessageDialog(null, ViewName);
				}
		}
		
	}
	}}

package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener{
JFrame frame;
JPanel panel;
JButton button1;
JButton button2;
JButton button3;
JButton button4;
int id;
String Name;
HashMap<Integer, String> peopleIDs = new HashMap<>();
public static void main(String[] args) {
	LogSearch logSearch = new LogSearch();
	logSearch.start();
}
/* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
void start() {
	frame = new JFrame();
	panel = new JPanel();
	button1 = new JButton("Add Entry");
	button2 = new JButton("Search Via ID");
	button3 = new JButton("View List");
	button4 = new JButton("Remove Entry");
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	frame.add(panel);
	frame.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed == button1) {
		String ID = JOptionPane.showInputDialog("Enter a number");
		Name = JOptionPane.showInputDialog("Enter a name");
		id = Integer.parseInt(ID);
		peopleIDs.put(id, Name);
	}
	else if(buttonPressed == button2) {
		String Id = JOptionPane.showInputDialog("Enter an ID");
		int ID = Integer.parseInt(Id);
		String InHashMapOrNot = peopleIDs.get(ID);
		if(InHashMapOrNot==null) {
			JOptionPane.showMessageDialog(null, "This ID is not in the list");
		}
		else {
			JOptionPane.showMessageDialog(null, InHashMapOrNot);
		}
		
	}
	else if(buttonPressed==button3) {
		String viewName = "";
		for(int d: peopleIDs.keySet()) {
			viewName+= "ID"+ d + ": " + peopleIDs.get(d) + "\n";
		}
		JOptionPane.showMessageDialog(null, viewName);
	}else if(buttonPressed == button4) {
		String E = JOptionPane.showInputDialog("Enter an ID");
		int InMapOrNO = Integer.parseInt(E);
		if(peopleIDs.get(InMapOrNO)!=null) {
			peopleIDs.remove(InMapOrNO);
			JOptionPane.showMessageDialog(null, "Removed.");
		}
		else {
			JOptionPane.showMessageDialog(null, "This ID is not in the list.");
		}
	}
	// TODO Auto-generated method stub
	
}
}

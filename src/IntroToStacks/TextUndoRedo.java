package IntroToStacks;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	Stack<Character>charactersuno = new Stack<>();
	Stack<Character>charactersdos = new Stack<>();
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 *
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	void start() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		frame.addKeyListener(this);
		panel.add(label);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
		
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		char c= e.getKeyChar();
		
		String s = "";
		if(e.getKeyCode()!=KeyEvent.VK_BACK_SPACE&&e.getKeyCode()!=KeyEvent.VK_Z){
			
			charactersuno.push(c);
		
			frame.repaint();
			
		}
		else if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
			char deleted = charactersuno.pop();
			charactersdos.push(deleted);
			
			frame.repaint();
		}
		else {
			char undid = charactersdos.pop();
			charactersuno.push(undid);
			
			frame.repaint();
			
		}
		Iterator<Character> t = charactersdos.iterator();
		
		Iterator<Character> i = charactersuno.iterator();
		while(i.hasNext()) {
			s+=i.next();
		}
		label.setText(s);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		TextUndoRedo undo = new TextUndoRedo();
		undo.start();
	}
}

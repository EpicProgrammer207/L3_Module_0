package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		Stack<Double> decimals = new Stack<>();
		for(int i=0; i<100; i++) {
			double random = new Random().nextDouble();
			random = random*100;
			decimals.push(random);
		}
		String StringOne = JOptionPane.showInputDialog("Enter a number in between 0 and 100 inclusive");
		String StringTwo = JOptionPane.showInputDialog("Enter another number in between 0 and 100 inclusive");
	    int NumberOne = Integer.parseInt(StringOne);
	    int NumberTwo = Integer.parseInt(StringTwo);
		int smaller = Math.min(NumberOne, NumberTwo);
		int bigger = Math.max(NumberOne, NumberTwo);
	    System.out.println("NUM 1: "+NumberOne);
		System.out.println("NUM 2: "+NumberTwo);
	    System.out.println("Popping stuff");
		for(int i=0; i<100; i++) {
	    double j = decimals.pop();
	    if(j>smaller && j<bigger) {
	    	System.out.println(j);
	    }
	    }
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}

package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> list = new ArrayList<String>();
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		list.add("cat");
		list.add("dog");
		list.add("bird");
		list.add("Programming");
		list.add("The League");
		//3. Print all the Strings using a standard for-loop
	for(int i=list.size()-1; i>=0; i--) {
			String s= list.get(i);
			if(s.contains("e")) {
				System.out.println(s);
			}
				
			
				
			
		}
		//4. Print all the Strings using a for-each loop
		/*for(String s: list) {
			System.out.println(s);
		}*/
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.

	}
}

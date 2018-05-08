package tutorial;

import java.util.Scanner;

public class Main {

	public static void main(String[]args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Benvenuto \nScrivi 'Ciao'");
		
		String Input = in.nextLine();
		
		if(Input.equals("Ciao")){
			System.out.println("Hey!");
		}
		
		
	}
	
}

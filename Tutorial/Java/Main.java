package tutorial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	private static FileOutputStream Output;
	private static PrintStream Print;
	private static FileReader ReadFile;
	private static BufferedReader BufferRead;
	
	public static void main(String[]args){
		
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Benvenuto \nScrivi 'Ciao'");
		
		String Input = in.nextLine();
		
		if(Input.equals("Ciao")){
			System.out.println("Hey!");
		}
		
		
		if(Input.equals("Scrivi")){
			try {
				Output = new FileOutputStream("Text.txt");
				Print = new PrintStream(Output);
			}catch(IOException e){
				System.out.println(e);
			}
			
			System.out.println("Scrivi quello che vuoi");
			String s = in.nextLine();
			Print.println(s);
		}
		if(Input.equals("Leggi")){
			if(new File("Text.txt").exists()){
				try {
					ReadFile = new FileReader("Text.txt");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				BufferRead = new BufferedReader(ReadFile);
				try {
					String l = BufferRead.readLine();
					System.out.println(l);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println("Nessun File trovato usa: 'Scrivi' per crearlo");
			}
			
		}
		
		
	}
	
}

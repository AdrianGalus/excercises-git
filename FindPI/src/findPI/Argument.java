package findPI;

import java.io.*;
import java.lang.IllegalArgumentException;

public class Argument {
	
	private int number;
	
	public void getDataFromUser() {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		boolean isCorrect = false; 
		do {
			try {
				number = Integer.parseInt(input.readLine());
				if(number < 0)
					throw new IllegalArgumentException();
				isCorrect = false;
				input.close();
			}
			
			catch(NumberFormatException e) {
				System.out.println("Niepoprawne dane!");
				isCorrect = true;
			}
			
			catch(IllegalArgumentException e) {
				System.out.println("Liczba musi być dodatnia!");
				isCorrect = true;
			}
			catch(IOException e) {
				System.out.println("Błąd odczytu danych!");
				isCorrect = true;
			}
		}while(isCorrect);
	}
	
	public int getNumber() {
		
		return number;
	}
}

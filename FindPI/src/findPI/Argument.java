package findPI;

import java.io.*;

public class Argument {
	
	private int number;
	
	public void getDataFromUser() {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		boolean isCorrect = true; 
		do {
			try {
				number = Integer.parseInt(input.readLine());
				if(number < 0)
					throw new IllegalArgumentException();
				isCorrect = true;
				input.close();
			}
			
			catch(NumberFormatException e) {
				System.out.println("Niepoprawne dane!");
				isCorrect = false;
			}
			
			catch(IllegalArgumentException e) {
				System.out.println("Liczba musi być dodatnia!");
				isCorrect = false;
			}
			catch(IOException e) {
				System.out.println("Błąd odczytu danych!");
				isCorrect = false;
			}
		}while(!isCorrect);
	}
	
	public int getNumber() {
		
		return number;
	}
}

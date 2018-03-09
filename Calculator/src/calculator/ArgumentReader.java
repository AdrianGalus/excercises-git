package calculator;

import java.io.*;

public class ArgumentReader {
	
	private boolean isActive = true;
	private boolean validInput = true;
	
	public Argument getDataFromUser() {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int number = 0;
		do {
			try {
				number = Integer.parseInt(input.readLine());
				validInput = true;
				checkNumber(number);
			}
			catch(NumberFormatException e) {
				System.out.println("Niepoprawne dane!");
				validInput = false;
			}
			catch(IOException e) {
				System.out.println("Błąd odczytu danych!");
				validInput = false;
			}
		}while(!validInput);
		
		return new Argument(number);
	}
	
	private void checkNumber(int number) throws IllegalArgumentException {
		
		if(number < 0) {
			System.out.println("Liczba musi być dodatnia!");
			validInput = false;
		}
		if(number == 0) {
			isActive = false;
		}
	}
	
	public boolean isActive() {
		
		return isActive;
	}
}
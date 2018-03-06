package calculator;

import java.io.*;

public class ArgumentReader {
	
	private boolean isActive = true;
	
	public Argument getDataFromUser() {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int number = 0;
		boolean isCorrect = true;
		do {
			try {
				number = Integer.parseInt(input.readLine());
				checkNumber(number);
				isCorrect = true;
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
		
		return new Argument(number);
	}
	
	private void checkNumber(int number) throws IllegalArgumentException {
		if(number < 0) {
			throw new IllegalArgumentException();
		}
		if(number == 0) {
			isActive = false;
		}
	}
	
	public boolean isActive() {
		return isActive;
	}
}
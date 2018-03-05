package calculator;

import java.io.*;

public class ArgumentReader {
	
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
		if(number < 1) {
			throw new IllegalArgumentException();
		}
	}
}
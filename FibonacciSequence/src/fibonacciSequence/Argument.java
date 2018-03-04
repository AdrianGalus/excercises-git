package fibonacciSequence;

import java.io.*;

public class Argument {
	
	private int number;
	
	public void getDataFromUser() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		boolean isCorrect = true;
		do {
			try {
				number = Integer.parseInt(input.readLine());
				checkNumber(number);
				isCorrect = true;
				input.close();
			}
			catch(NumberFormatException e) {
				System.out.println("Niepoprawne dane!");
				isCorrect = false;
			}
			catch(IllegalArgumentException e) {
				System.out.println("Podana liczba musi być większa od 0!");
				isCorrect = false;
			}
			catch(IOException e) {
				System.out.println("Błąd odczytu danych!");
				isCorrect = false;
			}
		}while(!isCorrect);
	}
	
	private void checkNumber(int number) throws IllegalArgumentException {
		if(number < 1) {
			throw new IllegalArgumentException();
		}
	}
	
	public int getNumber() {
		return number;
	}
}

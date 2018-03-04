package findPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Argument {
	
	private int number;
	
	public void getAndSetData() {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Program wyświetla liczbę PI. Wybierz, ile miejsc po przecinku ma zostać wyświetlonych.");
		boolean isCorrect = false; 
		do {
			try {
				number = Integer.parseInt(input.readLine());
				isCorrect = false;
			}
			catch(NumberFormatException e) {
				System.out.println("Niepoprawne dane!");
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

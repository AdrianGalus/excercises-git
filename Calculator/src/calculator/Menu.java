package calculator;

import java.util.*;

public class Menu {
	
	Map<Integer, MyFormulas> functions;
	
	public void showMenu() {
		
		System.out.println("Co chcesz zrobić? \"0\" kończy działanie programu.");
		System.out.println("1. Wyświetlić Ciąg Fibonacciego");
		System.out.println("2. Wyświetlić liczbę PI");
		System.out.println("3. Coś innego");
	}
	
	public void select(Argument argument1) {
		
		setFormulas();
		
		if(functions.containsKey(argument1.getNumber())) {
			MyFormulas function = functions.get(argument1.getNumber());
			function.showYourActivity();
			ArgumentReader reader2 = new ArgumentReader();
			argument1 = reader2.getDataFromUser();
			function.showResults(argument1);
		}
		else if(argument1.getNumber() == 3) {
			System.out.println("A pomożesz mi to okodować? ;)\n");
		}
		else if(argument1.getNumber() == 0) {
			System.out.println("Koniec programu.");
		}
		else {
			System.out.println("Niepoprawny wybór!");
		}
	}
	
	private void setFormulas() {
		
		functions = new HashMap<Integer, MyFormulas>();
		functions.put(1, new FibonacciSequence());
		functions.put(2, new PI_Number());
	}
}
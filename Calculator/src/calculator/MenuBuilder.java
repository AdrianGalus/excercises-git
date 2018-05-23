package calculator;

import java.util.*;

public class MenuBuilder {

	private Map<Integer, MathematicalFormulas> functions;
	
public void getArgument(Argument argument1) {
		
		setFormulas();
		select(argument1);
	}
	
	private void setFormulas() {
		
		functions = new HashMap<Integer, MathematicalFormulas>();
		functions.put(1, new FibonacciSequence());
		functions.put(2, new PI_Number());
	}
	
	private void select(Argument argument1) {
		
		if(functions.containsKey(argument1.getNumber())) {
			
			MathematicalFormulas function = functions.get(argument1.getNumber());
			function.showYourActivity();
			ArgumentReader reader2 = new ArgumentReader();
			argument1 = reader2.getDataFromUser();
			function.showResults(argument1);
		}
		else if(argument1.getNumber() == 3) {
			
			System.out.println("A pomożesz mi to okodować? ;)");
		}
		else if(argument1.getNumber() == 0) {
			
			System.out.println("Koniec programu.");
		}
		else {
			
			System.out.println("Niepoprawny wybór");
		}
	}
}

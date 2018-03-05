package calculator;

public class Menu {
	
	public void showMenu() {
		
		System.out.println("Co chcesz zrobić?");
		System.out.println("1. Wyświetlić Ciąg Fibonacciego");
		System.out.println("2. Wyświetlić liczbę PI");
		System.out.println("3. Coś innego");
	}
	
	public void select(Argument argument1) {
		
		ArgumentReader reader2 = new ArgumentReader();
		int number = argument1.getNumber();
		switch(number) {
		case 1: {
			System.out.println("Ile początkowych liczb z Ciągu Fibonacciego chcesz wyświetlić?");
			argument1 = reader2.getDataFromUser();
			FibonacciSequence fibSeq = new FibonacciSequence();
			fibSeq.showResults(argument1);
			break;
		}
		case 2: {
			System.out.println("Ile miejsc po przecinku ma zostać wyświetlonych?");
			argument1 = reader2.getDataFromUser();
			PI_Number pi = new PI_Number();
			pi.showResults(argument1);
			break;
		}
		case 3: {
			System.out.println("A pomożesz mi to okodować? ;)\n");
			break;
		}
		default: {
			System.out.println("Niepoprawny wybór");
		}
		}
	}
}
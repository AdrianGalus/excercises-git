package fibonacciSequence;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("Ile początkowych liczb z Ciągu Fibonacciego chcesz wyświetlić?");
		ArgumentReader reader = new ArgumentReader();
		Argument argument = reader.getDataFromUser();	
		FibonacciSequence fibSeq = new FibonacciSequence();
		fibSeq.showFibonacciSequence(argument);
	}

}

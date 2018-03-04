package fibonacciSequence;

public class FibonacciSequenceCalculator {

	public static void main(String[] args) {
		
		System.out.println("Ile początkowych liczb z Ciągu Fibonacciego chcesz wyświetlić?");
		Argument argument = new Argument();
		argument.getDataFromUser();
		FibonacciSequence fibSeq = new FibonacciSequence();
		fibSeq.showFibonacciSequence(argument.getNumber());
	}

}

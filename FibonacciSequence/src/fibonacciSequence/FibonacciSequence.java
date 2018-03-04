package fibonacciSequence;

public class FibonacciSequence {
	
	long[] sequence;
	
	public void showFibonacciSequence(int number) {
		
		if(number == 1) {
			System.out.print(0);
		}
		else if(number < 94) {
			calculateFibonacciSequence(number);
			showResults();
		}
		else {
			showWarning();
		}
	}
	
	private void calculateFibonacciSequence(int number) {
		
		sequence = new long[number];
		sequence[0] = 0;
		sequence[1] = 1;
		for(int i = 2; i < sequence.length; i++) {
			sequence[i] = sequence[i-1] + sequence[i-2];
		}
	}
	
	private void showResults() {
		
		System.out.println("Indeks\tWartość");
		for(int i = 0; i < sequence.length; i++) {
			System.out.format("%d \t%,d\n", i+1, sequence[i]);
		}
	}
	
	private void showWarning() {
		System.out.println("To zbyt duży zakres - ostatnie liczby nie będą poprawnie obliczone.");
		System.out.println("Wybierz poprawny zakres (maksymalnie 93 liczby).");
	}
}

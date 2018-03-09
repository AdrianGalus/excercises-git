/*
 * Wyświetla Ciąg Fibonacciego, zaczynając od 0.
 */

package calculator;

public class FibonacciSequence implements MathematicalFormulas {
	
	long[] sequence;
	
	@Override
	public void showYourActivity() {
		System.out.println("Ile początkowych liczb z Ciągu Fibonacciego chcesz wyświetlić?");
	}
	
	@Override
	public void showResults(Argument argument) {
		
		int number = argument.getNumber();
		if(number == 0) {
			System.out.println();
		}
		else if(number == 1) {
			calculateDefaultFibonacciSequence();
			showFibonacciSequence();
		}
		else if(number < 94) {
			calculateFibonacciSequence(number);
			showFibonacciSequence();
		}
		else {
			showWarning();
		}
	}
	
	private void calculateDefaultFibonacciSequence( ) {
		
		sequence = new long[1];
		sequence[0] = 0; 
	}
	
	private void calculateFibonacciSequence(int number) {
		
		sequence = new long[number];
		sequence[0] = 0;
		sequence[1] = 1;
		for(int i = 2; i < sequence.length; i++) {
			sequence[i] = sequence[i-1] + sequence[i-2];
		}
	}
	
	private void showFibonacciSequence() {
		
		System.out.println("Indeks\tWartość");
		for(int i = 0; i < sequence.length; i++) {
			System.out.format("%d \t%,d\n", i+1, sequence[i]);
		}
	}
	
	private void showWarning() {
		
		System.out.println("To zbyt duży zakres - ostatnie liczby nie będą poprawnie obliczone.");
		System.out.println("Wybierz poprawny zakres (maksymalnie 93 liczby).\n");
	}
}
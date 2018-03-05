package calculator;

public class PI_Number implements MyFunctions {

	@Override
	public void showResults(Argument argument) {
		
		int number = argument.getNumber();
		showPI(number);
	}
	
	private void showPI(int number) {
		System.out.println("[Tymczasowa implementacja z klasy Math]");
		String text = "Liczba PI z dokładnością do %d miejsc po przecinku: %.";
		StringBuilder strB = new StringBuilder(text);
		strB.append(number + "f\n\n");
		System.out.format(strB.toString(), number, Math.PI);
	}
}
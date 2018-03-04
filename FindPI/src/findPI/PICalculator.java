package findPI;

public class PICalculator {
	
	public void useNumber(int number) {
		
		showPI(number);
	}
	
	private void showPI(int number) {
		String text = "Liczba PI z dokładnością do %d miejsc po przecinku: %.";
		StringBuilder strB = new StringBuilder(text);
		strB.append(number + "f");
		System.out.format(strB.toString(), number, Math.PI);
	}
}

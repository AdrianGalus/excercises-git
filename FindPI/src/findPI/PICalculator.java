package findPI;

public class PICalculator {
	
	public void showPI(Argument argument) {
		
		String text = "Liczba PI z dokładnością do %d miejsc po przecinku: %.";
		StringBuilder strB = new StringBuilder(text);
		strB.append(argument.getNumber() + "f.");
		System.out.format(strB.toString(), argument.getNumber(), Math.PI);
	}
}

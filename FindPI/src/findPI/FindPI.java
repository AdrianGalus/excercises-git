package findPI;

public class FindPI {

	public static void main(String[] args) {
		
		Argument argument = new Argument();
		argument.getAndSetData();
		PICalculator calculator = new PICalculator();
		calculator.showPI(argument);
	}
}

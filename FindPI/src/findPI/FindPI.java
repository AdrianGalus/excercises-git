package findPI;

public class FindPI {

	public static void main(String[] args) {
		
		System.out.println("Program wyświetla liczbę PI. Wybierz, ile miejsc po przecinku ma zostać wyświetlonych.");
		Argument argument = new Argument();
		argument.getDataFromUser();
		PICalculator calculator = new PICalculator();
		calculator.useNumber(argument.getNumber());
	}
}

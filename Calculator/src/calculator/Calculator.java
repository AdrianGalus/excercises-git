package calculator;

public class Calculator {

	public static void main(String[] args) {
			
		Menu menu = new Menu();
		menu.showMenu();
		ArgumentReader reader = new ArgumentReader();
		Argument argument1 = reader.getDataFromUser();	
		menu.select(argument1);
	}
}
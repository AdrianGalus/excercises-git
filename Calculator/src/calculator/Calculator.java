package calculator;

public class Calculator {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		ArgumentReader reader = new ArgumentReader();
		while(reader.isActive()) {
			menu.showMenu();
			Argument argument1 = reader.getDataFromUser();	
			menu.select(argument1);
		}
	}
}
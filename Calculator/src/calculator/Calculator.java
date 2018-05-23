package calculator;

public class Calculator {

	public static void main(String[] args) {
		
		MainMenu main = new MainMenu();
		MenuBuilder selector = new MenuBuilder();
		ArgumentReader reader = new ArgumentReader();
		while(reader.isActive()) {
			main.showMainMenu();
			Argument argument1 = reader.getDataFromUser();	
			selector.getArgument(argument1);
		}
		reader.closeStream();
	}
}
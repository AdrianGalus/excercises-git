package changeLetters;

import java.io.IOException;

public class Text {
	
	private int changes = 0;
	char ch;
	
	public char getText() {
		try {
			ch = (char) System.in.read();
		}
		catch(IOException e) {
			System.out.println("Błąd odczytu danych!");
		}
		return ch;
	}
	
	public void changeLetters() {
		
		System.out.println("Wprowadź tekst. Program zamieni małe litery na wielkie i odwrotnie. Aby zakończyć, wybierz znak \".\"");
		do {
			ch = getText();
			if(isSmall(ch)) {
				ch -= 32;
				changes++;
			}
			else if(isBig(ch)) {
				ch += 32;
				changes++;
			}
			if(isNotDot(ch)) {
				System.out.print(ch);
			}
			else {
				System.out.println();
			}
			
		}while(isNotDot(ch));
		
		System.out.println("Koniec programu. Liczba zmian: " + changes);
	}
	
	public boolean isSmall(char ch) {
		return 'a' <= ch && ch <= 'z';
	}
	
	public boolean isBig(char ch) {
		return 'A' <= ch && ch <= 'Z';
	}
	
	public boolean isNotDot(char ch) {
		return ch != '.';
	}
}

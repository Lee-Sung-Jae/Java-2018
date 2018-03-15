import java.util.Scanner;

public class Counting1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = scanner.nextLine();
		System.out.printf("\nString what you entered have:\n\tUppercase - %d\n\tLowercase - %d\n\tNumber - %d",
				Uppercase.parse(str), Lowercase.parse(str), Number.parse(str));
		scanner.close();
	}
}

class Uppercase {
	static int parse(String str) {
		int count = 0;
		char s;
		for(int i = 0; i < str.length(); i++) {
			s = str.charAt(i);
			if((s >= 'A') && (s <= 'Z'))
				count++; 
		}
		return count;
	}
}

class Lowercase {
	static int parse(String str) {
		int count = 0;
		char s;
		for(int i = 0; i < str.length(); i++) {
			s = str.charAt(i);
			if((s >= 'a') && (s <= 'z'))
				count++; 
		}
		return count;
	}
}


class Number {
	static int parse(String str) {
		int count = 0;
		char s;
		for(int i = 0; i < str.length(); i++) {
			s = str.charAt(i);
			if((s >= '0') && (s <= '9'))
				count++; 
		}
		return count;
	}
}
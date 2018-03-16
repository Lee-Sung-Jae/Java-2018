import java.util.Scanner;

public class AccountTest32 {
	public static void main(String[] args) {
		Account32 account = new Account32();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter name: ");
		account.setName(scanner.nextLine());

		System.out.print("Enter balance: ");
		account.setBalance(scanner.nextInt());

		System.out.printf("Name: %s\nBalance: %d$", account.getName(), account.getBalance());
		scanner.close();
	}
}

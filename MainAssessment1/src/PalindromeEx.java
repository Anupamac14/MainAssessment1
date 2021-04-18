import java.util.Scanner;

public class PalindromeEx {
	public static void main(String[] args) {
		String str, rev = "";
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the String");
		str = a.nextLine();
		int length = str.length();
		for (int i = length - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		if (str.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
}

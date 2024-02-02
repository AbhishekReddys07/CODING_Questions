import java.util.Scanner;

public class Anagram_User {
	public static void main(String[] args) {
		new Checking().dup();
	}
}

class Checking {
	void dup() {
		Scanner sc = new Scanner(System.in);
		String str1 = "azed".toLowerCase();
		String str = "abhishek reddy".toLowerCase();

		char arr[] = str.toCharArray();
		char arrr[] = str1.toCharArray();

		int n = arr.length;
		
		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = (char) temp;

				}
			}

		}
		System.out.println(arr);
	
	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class Haker_rank_question {
	static int count;
	static int check;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// double d=sc.nextDouble();
		int n =  9;
		int arr[] = { 10, 20, 20, 10, 10, 30, 50, 10, 20};

		@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
		ArrayList<Integer> l = new <Integer>ArrayList();

		for (int i = 0; i < arr.length; i++) {

			System.out.println(l.add(arr[i]));
		}
		int ans = sockMerchant(n, arr);
		System.out.println(ans);

	}

	public static int sockMerchant(int n, int[] arr) {
		int count = 0;
		for (int i = 1; i < n;) {
			try {
				if (arr[i] == arr[i++]) {
			           count++;
				}
			} catch (ArrayIndexOutOfBoundsException e) {

			}
		}
		
		return count/2;

	}

}

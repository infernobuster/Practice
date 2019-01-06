import java.util.Scanner;
import java.util.ArrayList;
public class ProgramOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, k;
		n = in.nextInt();
		k = in.nextInt();

		if (n - k == 1)
			solution(n, k);
		in.close();
	}

	public static void solution(int n, int k) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int temp = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				arr.add(temp);
			} else {
				arr.add(n - temp + 1);
				temp++;
			}
		}
		printArray(arr);
	}

	public static void printArray(ArrayList<Integer> arr) {
		System.out.println(arr.toString());
	}
}

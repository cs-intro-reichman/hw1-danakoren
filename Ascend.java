// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * lim);
		int b = (int)(Math.random() * lim);
		int c = (int)(Math.random() * lim);
		System.out.println((int)a + " , " +b  + " , " + c);

		int maxNum = (int)(Math.max(a, b));
		maxNum = (int)(Math.max(maxNum, c));
		int minNum = (int)(Math.min(a, b));
		minNum = (int)(Math.min(minNum, c));
		int midNum = a + b +c - maxNum - minNum;

		System.out.println(minNum + " " + midNum + " " + maxNum);
		



	}
}

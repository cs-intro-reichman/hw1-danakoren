// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		System.out.print(num / 100 + " hundreds, ");
		System.out.print(Math.floorMod(num / 10, 10) + " tens, ");
		System.out.print("and " + Math.floorMod(num, 10) + " ones.");
//System.out.println(hundreds);

	}
}

// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		System.out.println("ones: " +  Math.floorMod(num, 10));
		System.out.println("tens: " +  Math.floorMod(num / 10, 10));
		System.out.println("hundreds: " +  Math.floorMod(num / 100, 10));


//System.out.println(hundreds);

	}
}

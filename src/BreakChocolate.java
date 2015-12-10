public class BreakChocolate {

	public static int breakChocolate(int n, int m) {
		if (m == 1 && n == 1) {
			return 0;
		}
		else if (m == 2 && n == 1) {
			return 1;
		}
		else if (m == 1 && n == 2) {
			return 1;
		}
		else if (m > 1) {
			return breakChocolate(n, m-1) + breakChocolate(n, 1) + 1;
		}
		else if (n > 1) {
			return breakChocolate(n-1, m) + breakChocolate(1,m) + 1;
		}
		else {	// error if going to this loop
			return -1;
		}
	}

	public static void main(String[] args) {
		System.out.println(breakChocolate(5,5));
	}

}
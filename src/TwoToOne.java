/**
##Two to One

Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters, 
each taken only once - coming from s1 or s2.

a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

 * @author changliu
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class TwoToOne {

	public static char[] bubbleSort(char[] arr) {
		boolean swap = true;
		while(swap) {
			// initial state to be false, if no swap then it's stable
			swap = false;
			for (int i = 0;  i < arr.length - 1; i++) {
				// if swapped, marked as true, since it may need further swap
				if (arr[i] > arr[i + 1]) {
					char tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					swap = true;
				}
			}
		}
		return arr;
	}
	
	
	public static String longest(String a, String b) {
		String result = "";
		for (int i = 0; i < a.length(); i++) {
			char s = a.charAt(i);
			/**
			 * very trivial for debugging, here cannot use String.contains(s)
			 * directly, as it requires CharSequence Use String.contains(""+s),
			 * since String has CharSequence interface or Use
			 * String.contains(String.toString(s)) instead. Very Important! You
			 * don't know the details of the API, that's sooooooo bad!
			 */
			if (!result.contains("" + s)) {
				result += s;
			}
		}

		for (int j = 0; j < b.length(); j++) {
			char s = b.charAt(j);
			if (!result.contains("" + s)) {
				result += s;
			}
		}
		
		
		// Why here I cannot use test.toString() to return???
		return new String(bubbleSort(result.toCharArray()));
	}

    @Test
    public void test() {
        System.out.println("longest Fixed Tests");
        assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
    }
	
	
	public static void main(String[] args) {
			new TwoToOne().test();
	}
	
	
}

package flytech;

public class StringUtil {
	/**
	 * 
	 * @param s1
	 * @return
	 */
	public static String reverse(String s1) {
		String reverse = "";

		int length = s1.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + s1.charAt(i);
		}
		return reverse;

	}
	/**
	 * 
	 * @param param1
	 * @param param2
	 * @return
	 */
	public static boolean compare(String param1, String param2) {
		
		return false;
	}
}

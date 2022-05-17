package string.calculator;

public class Utility {

	public static boolean isValidStringForAddition(String numbers) {
		if (numbers == null || numbers.trim().equals(""))
			return false;
		return true;
	}

}

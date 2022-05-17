package string.calculator;

public class Utility {

	public static boolean isValidStringForAddition(String numbers) {
		if (numbers == null || numbers.trim().equals(""))
			return false;

		numbers = numbers.trim();

		char[] numbersChar = numbers.toCharArray();

		if (!isNumber(numbersChar[0]) && (numbersChar[0] != '-'))
			return false;
		if (!isNumber(numbersChar[numbersChar.length - 1]))
			return false;

//		boolean lastCharComma = false;
//		boolean lastCharNewLine = false;

		for (int i = 0; i < numbersChar.length - 1; i++) {
			if (!isValidChar(numbersChar[i]))
				return false;

			if (numbersChar[i] == '-' && !isNumber(numbersChar[i + 1]))
				return false;
			if ((numbersChar[i] == ',' || numbersChar[i] == '\n')
					&& (numbersChar[i + 1] == ',' || numbersChar[i + 1] == '\n'))
				return false;

		}

		return true;
	}

	private static boolean isValidChar(char num) {
		if (isNumber(num))
			return true;
		if (num == ',')
			return true;
		if (num == '\n')
			return true;
		if (num == '-')
			return true;
		return false;

	}

	private static boolean isNumber(char number) {
		return number >= '0' && number <= '9';
	}

}

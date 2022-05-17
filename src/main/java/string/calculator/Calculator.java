package string.calculator;

public class Calculator {

	public static int add(String numbers) {

		if (numbers == null || numbers.trim().equals(""))
			return 0;

		String delimiter = ",";

		if (numbers.matches("//(.*)\n(.*)")) {
			delimiter = Character.toString(numbers.charAt(2));
			numbers = numbers.substring(4);
		}

		String numList[] = numbers.split(delimiter + "|\n");

		return getSum(numList);

	}

	private static int getSum(String[] numbers) {
		int total = 0;
		String negativeNumbers = "";
		boolean isOverflow = false;

		for (String number : numbers) {
			
			int num = 0;

			// Check the number is over flowing
			if(Long.parseLong(number) > Integer.MAX_VALUE || Long.parseLong(number) < Integer.MIN_VALUE) {
				isOverflow = true;
			} else {
				num = Integer.parseInt(number);
			}


			if (num < 0) {
				negativeNumbers += (negativeNumbers.equals("")) ? num : ("," + num);
			}

			// Check the summation is over flowing
			if(total > (Integer.MAX_VALUE - num)) {
				isOverflow = true;
			} else {
				total += num;
			}

		}

		if (!negativeNumbers.isEmpty()) {
			throw new IllegalArgumentException("negatives not allowed " + negativeNumbers);
		}
		if (isOverflow) {
			throw new IllegalArgumentException("Integer value overflow");
		}

		return total;
	}
}

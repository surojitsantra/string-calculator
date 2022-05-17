package string.calculator;

import org.junit.Assert;
import org.junit.Test;

public class UtilityTest {
	@Test
	public void shouldAnswerWithTrue() {
//		Invalid cases
		String invalidNumbers1 = "";
		String invalidNumbers2 = "    ";
		String invalidNumbers3 = "  12,,2  ";
		String invalidNumbers4 = "12\n,2";
		String invalidNumbers5 = ",12\n2";
		String invalidNumbers6 = ",12\na2";
		String invalidNumbers7 = ",1a2\n2";
		String invalidNumbers8 = ",12\nx2";
		String invalidNumbers9 = ",12,2,3a";
		String invalidNumbers10 = ",12cv2";

		Assert.assertFalse(Utility.isValidStringForAddition(invalidNumbers1));
		Assert.assertFalse(Utility.isValidStringForAddition(invalidNumbers2));
		Assert.assertFalse(Utility.isValidStringForAddition(invalidNumbers3));
		Assert.assertFalse(Utility.isValidStringForAddition(invalidNumbers4));
		Assert.assertFalse(Utility.isValidStringForAddition(invalidNumbers5));
		Assert.assertFalse(Utility.isValidStringForAddition(invalidNumbers6));
		Assert.assertFalse(Utility.isValidStringForAddition(invalidNumbers7));
		Assert.assertFalse(Utility.isValidStringForAddition(invalidNumbers8));
		Assert.assertFalse(Utility.isValidStringForAddition(invalidNumbers9));
		Assert.assertFalse(Utility.isValidStringForAddition(invalidNumbers10));

		// Valid Case
		String validNumbers1 = "12\n2";
		String validNumbers2 = "12,2";
		String validNumbers3 = "-12\n2";
		String validNumbers4 = "12\n-2";
		String validNumbers5 = "-12,2";
		
		Assert.assertTrue(Utility.isValidStringForAddition(validNumbers1));
		Assert.assertTrue(Utility.isValidStringForAddition(validNumbers2));
		Assert.assertTrue(Utility.isValidStringForAddition(validNumbers3));
		Assert.assertTrue(Utility.isValidStringForAddition(validNumbers4));
		Assert.assertTrue(Utility.isValidStringForAddition(validNumbers5));

	}
}

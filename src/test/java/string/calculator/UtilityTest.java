package string.calculator;

import org.junit.Assert;
import org.junit.Test;

public class UtilityTest {
	@Test
	public void shouldAnswerWithTrue() {
//		Invalid cases
		String numbers1 = "";
		String numbers2 = "    ";
		
		Assert.assertFalse(Utility.isValidStringForAddition(numbers1));
		Assert.assertFalse(Utility.isValidStringForAddition(numbers2));
	}
}

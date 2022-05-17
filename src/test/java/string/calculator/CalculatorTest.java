package string.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void shouldAnswerWithTrue() {
		Assert.assertEquals(Calculator.add(""), 0);
	}
}

package de.tb.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

	private CalculatorService cut = new CalculatorService();

	@Test
	void add_should_return_correct_value() {
		final int actual = cut.add(1, 1);
		assertThat(actual).isEqualTo(2);
	}
}

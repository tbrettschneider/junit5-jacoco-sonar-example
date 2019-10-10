package de.tb.service;

class CalculatorService {

	Integer add(Integer x, Integer y) {
		if (x == null) throw new IllegalArgumentException("x cannot be null!");
		if (y == null) throw new IllegalArgumentException("y cannot be null!");
		return x + y;
	}
}

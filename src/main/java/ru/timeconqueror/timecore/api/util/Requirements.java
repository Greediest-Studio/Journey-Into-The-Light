package ru.timeconqueror.timecore.api.util;

public class Requirements {

	public static void inRangeInclusive(float number, float min, float max) {
		if (number < min || number > max)
			throw new IllegalArgumentException("Number should be in range [" + min + ", " + max + "] (inclusive). Provided: " + number);
	}

	public static void greaterOrEqualsThan(int number, int min) {
		if (number < min)
			throw new IllegalArgumentException("Provided number should be greater or equal " + min + ". Provided: " + number);
	}

	public static void greaterThan(float number, float min) {
		if (number <= min)
			throw new IllegalArgumentException("Provided number should be greater than " + min + ". Provided: " + number);
	}
}

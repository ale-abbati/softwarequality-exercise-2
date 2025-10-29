// SPDX-FileCopyrightText: 2025 Copyright © Alessandro Abbati
//
// SPDX-License-Identifier: MIT


package org.example;

public class MyMaths {

	/**
	 * Calculates the greatest common divisor of two numbers m and n.
	 * @param m First number
	 * @param n Second number
	 * @return Greatest common divisor of numbers m and n.
	 */
	public int gcd(int m, int n) {
		
		int r;
		if (n>m) {
			r = m;
			m = n;
			n = r;
		}
		
		r = m % n;
		while (r != 0) {
			m = n;
			n = r;
			r = m % n;
		}

		return n;
	}
}

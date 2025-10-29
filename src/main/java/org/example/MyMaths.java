// SPDX-FileCopyrightText: 2025 Copyright © Alessandro Abbati
//
// SPDX-License-Identifier: MIT


package org.example;

public class MyMaths {
	
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

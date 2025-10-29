// SPDX-FileCopyrightText: 2025 Copyright © Alessandro Abbati
//
// SPDX-License-Identifier: MIT

package org.example;

public class Stack {
	
	private int maxSize = 0;
	int pos = -1;
	int[] stackArr = null;
	
	public Stack(int size) {
		maxSize = size;
		stackArr = new int[size];
	}	  

	public boolean isEmpty() {
        return this.size() == 0;
    }

	/**
	 * Returns the element on top of the stack and removes it.
	 * @return Element on top of the stack
	 */
	public int pop() {  
		if (pos == -1)  
			return -1;
		int element = stackArr[pos];  
		stackArr[pos] = -1;  
		pos--;  
		return element;  
	}

	/**
	 * Adds an element on top of the stack.
	 * @param element Element that is added to the stack
	 * @throws StackOverflowError
	 * @throws IllegalArgumentException
	 */
	public void push(int element) throws StackOverflowError,IllegalArgumentException {  		
		if (element<0)
			throw new IllegalArgumentException();
		int npos = pos + 1;  
		if (npos == maxSize)  
			throw new StackOverflowError("Stack is full");  
		pos = npos;  
		stackArr[pos] = element;  
	}  

	public int size() { 		
		return pos + 1;  
	}

	/**
	 * Returns the element on top of the stack without deleting it.
	 * @return Element on top of the stack
	 */
	public int top(){
		if(this.isEmpty()){
			return -1;
		}else{
			return stackArr[pos];
		}
	}

}  

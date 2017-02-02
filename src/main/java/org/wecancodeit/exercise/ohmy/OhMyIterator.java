package org.wecancodeit.exercise.ohmy;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OhMyIterator implements Iterator<String> {

	private String[] strings;
	private int index;

	public OhMyIterator(String[] strings) {
		this.strings = strings;
		
	}

	@Override
	public boolean hasNext() {
		return index < strings.length;
	}

	@Override
	public String next() {
		
		if( !hasNext()) {
			throw new NoSuchElementException();
		
		}
		String currentString = strings[index];
		index++;
		return currentString;
		
	}
}

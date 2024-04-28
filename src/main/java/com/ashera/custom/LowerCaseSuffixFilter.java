package com.ashera.custom;

import com.ashera.converter.IFilter;

public class LowerCaseSuffixFilter implements IFilter{

	@Override
	public boolean filter(String value, String query) {
		boolean matches = false;
		
		if (query == null || query.length() == 0) {
			return true;
		}
		if (value == null) {
			return false;
		}
		
		query = query.toLowerCase();
		// First match against the whole, non-splitted value
        if (value.toLowerCase().endsWith(query)) {
        	matches = true;
        } else {
            final String[] words = value.split(" ");
            for (String word : words) {
                if (word.toLowerCase().endsWith(query)) {
                	matches = true;
                    break;
                }
            }
        }
		return matches;
	}

}

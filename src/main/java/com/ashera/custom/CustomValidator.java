//start - license
/*
 * Copyright (c) 2025 Ashera Cordova
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
//end - license
package com.ashera.custom;

import com.ashera.validations.BaseValidator;
import com.ashera.validations.Validation;
import com.ashera.widget.IWidget;

public class CustomValidator extends BaseValidator{

	@Override
	public Validation newInstance(String... argument) {
		return new CustomValidator();
	}

	@Override
	public String getDefaultErrorMessage(IWidget widget) {
		String res = com.ashera.utils.ResourceBundleUtils.getString("values/strings", "string", "@string/lowercase_error_message", widget.getFragment());
		return res;
	}

	@Override
	public boolean isValid(String str, IWidget widget) {
		if (str == null || str.trim().equals("")) {
			return true;
		}
		
		return str.toLowerCase().equals(str);
	}

}
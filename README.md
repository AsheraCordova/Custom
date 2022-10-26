# Custom

Ashera provides cross platform support using Java and typescript language while using cordova as its base. To develop features which run at native speed, the custom project provides a starting point for developing cross platform code using java.

The following functionality can be extended :
* Validation
* Method Expression Handlers
* Widget
* Attribute for widget
* Converter
* Image loader

The custom plugin can be cloned and used as starting point for developing custom crossplatform code based on java.

## Custom Validator

A example of custom validator is given below:
```
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
```

Register the validator on load of the plugin:

```
ValidatorFactory.register("lowercaseonly", new CustomValidator());
```

Use this validator in ui:

```
<EditText
	android:id="@+id/validation0"
	android:layout_width="match_parent"
	android:layout_height="wrap_content"
	formGroupId="test"
	android:layout_margin="10dp"
	android:minHeight="50dp"
	android:background="#ff0"
	validation="lowercaseonly" />

```

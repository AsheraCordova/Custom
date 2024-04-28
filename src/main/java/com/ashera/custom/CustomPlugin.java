package com.ashera.custom;

import com.ashera.model.MethodHandlerFactory;
import com.ashera.validations.ValidatorFactory;

public class CustomPlugin {
	public static void init() {
		ValidatorFactory.register("lowercaseonly", new CustomValidator());
		MethodHandlerFactory.register(new CustomMethodHandler());
		com.ashera.widget.EventCommandFactory.registerCommand("custom", new CustomEventCommand());
		com.ashera.converter.FilterFactory.register(LowerCaseSuffixFilter.class.getName(), new LowerCaseSuffixFilter());
	}
}

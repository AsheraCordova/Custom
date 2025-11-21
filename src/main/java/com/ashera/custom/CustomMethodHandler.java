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

import java.util.Map;

import com.ashera.model.MethodHandler;
import com.ashera.widget.IWidget;

public class CustomMethodHandler implements com.ashera.model.MethodHandler {

	@Override
	public String handle(String methodName, Object obj, IWidget widget) {
		switch (methodName) {
		case "pointsEarned":
			int points = 0;			
			if (obj instanceof Map) {
				Map<String, Object> map = (Map<String, Object>)obj;
				Integer quantity = 0; 
				try {
					quantity = com.ashera.widget.PluginInvoker.getInt(map.get("noOfItems"));
				} catch (NumberFormatException e) {
				}
				Integer tradePrice = 0;
				try {
					tradePrice = com.ashera.widget.PluginInvoker.getInt(map.get("tradePrice"));
				} catch (NumberFormatException e) {
				}
				Integer memberPrice = com.ashera.widget.PluginInvoker.getInt(map.get("memPrice"));
			
				if (quantity != null && tradePrice != null && memberPrice != null) {
					points = quantity * (tradePrice - memberPrice);
					if (points < 0) {
						points = 0;
					}
				}
			}
			

			return points + "";

		default:
			break;
		}
		return MethodHandler.UNHANDLED;
	}
}

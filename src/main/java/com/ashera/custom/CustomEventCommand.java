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

import java.util.HashMap;
import java.util.Map;

import com.ashera.widget.EventExpressionParser;
import com.ashera.widget.IWidget;

public class CustomEventCommand implements com.ashera.widget.EventCommand{
	@Override
	public Object executeCommand(IWidget widget, Map<String, Object> eventObject, Object... params) {
		String event = (String) eventObject.get(EventExpressionParser.KEY_SCRIPT_NAME);
		switch (event) {
			case "onPageScrolled": {
				int numPages = 10;
				IWidget motionLayout = widget.findNearestView("@+id/header");
				int position = (int) params[0];
				float positionOffset = (float) params[1];
				float progress = (position + positionOffset) / (numPages - 1);
				motionLayout.setAttribute("progress", progress, true);
				break;
			}
			case "onDrawerSlide": {
				IWidget motionLayout = widget.findWidgetById("@+id/motioncontent");
				float slideOffset = (float) params[1];
				motionLayout.setAttribute("progress", slideOffset, true);

				IWidget drawerlayout = widget.findWidgetById("@+id/drawerlayoutstart");
				drawerlayout.setAttribute("progress", slideOffset, true);

				break;
			}

			case "onCloseIconClick": {
				IWidget chipGroup = widget.findNearestView("@+id/chip_group");
				chipGroup.setAttribute("removeChip", widget.getId(), true);
				chipGroup.requestLayout();
				chipGroup.getFragment().remeasure();;
				break;
			}
			case "onTextChanged": {
				String s = params[0].toString();
				if(s != null && !s.isEmpty()){
					if (s.length() == 1 && s.endsWith(",")) {
						widget.setAttribute("text", "", true);
					} else if (s.length() > 1 && s.endsWith(",")) {
						widget.setAttribute("text", "", true);
						s = s.replace(",","");
						addChipToGroup(widget, s);
					}
				}
				break;
			}
		}

		return null;
	}

	private static void addChipToGroup(IWidget widget, String s) {
		HashMap<String, Object> chipParams = new HashMap<>();
		chipParams.put("chipId", "@+id/" + s);
		chipParams.put("text", s);
		chipParams.put("chipParams", "closeIconVisible: true; onCloseIconClick: +custom#onCloseIconClick()");

		IWidget chipGroup = widget.findNearestView("@+id/chip_group");
		chipGroup.setAttribute("addChip", chipParams, true);
		chipGroup.requestLayout();
		chipGroup.getFragment().remeasure();;
	}

}

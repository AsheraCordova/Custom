package com.ashera.custom;

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
		}

		return null;
	}
	
}

package com.gas.common;

import org.apache.log4j.Logger;
import org.springframework.ui.Model;

/**
 * @author jung
 *
 */
public class CommonController {

	Logger logger = Logger.getLogger(getClass());
	
	public CommonController() {
	}
	
	protected void setBaseInfo(Model model) {
		model.addAttribute("myTitle", "laundro");
	}
	
}

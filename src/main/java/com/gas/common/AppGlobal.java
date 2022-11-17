package com.gas.common;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Properties;

/**
 * @author jung
 *
 */
public class AppGlobal {

	public static final String ariaKey = "aria_key#";

	public static String db;

	// File Upload Type
	public static String uploadPath;
	public static long uploadSize;

	public void setSystemProperties(Properties props) {
		AppGlobal.db = props.getProperty("app.db").toUpperCase();

		AppGlobal.uploadPath = props.getProperty("app.uploadpath").toString();
		AppGlobal.uploadSize = Long.parseLong(props.getProperty("app.uploadSize").toString());
	}

	/**
	 * ContextPath 리턴
	 */
	public static String getCtxPath() {
		ServletRequestAttributes reqAttr = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		return reqAttr.getRequest().getContextPath();
	}
}

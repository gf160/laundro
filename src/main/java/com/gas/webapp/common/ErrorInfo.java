/**
 * Program Name		: ErrorInfo.java
 * Description		: 
 * Programmer Name 	: Bae Jung Yeo
 * Creation Date	: 2014. 2. 13.
 * ***************************************************************
 *                P R O G R A M    H I S T O R Y
 * ***************************************************************
 * DATE			: PROGRAMMER	: REASON
 */
package com.gas.webapp.common;

import org.springframework.context.MessageSource;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import java.io.Serializable;
import java.util.Locale;

/**
 * @author jung
 *
 */
@SuppressWarnings("serial")
public class ErrorInfo implements Serializable {
	private String code;
	private String message;

	public ErrorInfo(String message) {
		this(null, message);
	}

	public ErrorInfo(String code, String message) {
		this.code = code;
		this.message = message;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public String toString() {
		return "[" + code + "]: " + message;
	}
}

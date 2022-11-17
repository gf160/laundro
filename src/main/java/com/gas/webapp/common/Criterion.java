package com.gas.webapp.common;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author jung
 *
 */
public class Criterion {
	
	private Map<String, Object> condition = new HashMap<String, Object>();
	
	/**
	 * Construct
	 * 사용자정보를 default로 추가
	 */
	public Criterion() {
		// 환경변수
//		this.addParam("siteName", AppGlobal.siteName);
//
//		UserDto userDto = new UserDto();
//		if(userDto != null) {
//			this.addParam("userId", userDto.getUserId());
//			this.addParam("auth", userDto.getAuth());
//			this.addParam("authGrpNo", userDto.getAuthGrpNo());
//		}
	}
	
	/**
	 * Construct 파라미터로 받은 reqMap을 condition에 추가
	 * 
	 * @param reqMap
	 */

	public Criterion(Map<String, Object> reqMap) {
		this();
		Iterator<String> keys = reqMap.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			Object value = reqMap.get(key);
			//XSS
//			if(value instanceof String) {
//				String strVal = value.toString();
//				if(!StringUtils.isBlank(strVal)) {
//					strVal = strVal.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
//					strVal = strVal.replaceAll("\\(", "&#40;").replaceAll("\\)", "&#41;");
//					strVal = strVal.replaceAll("'", "&#39;");
//					strVal = strVal.replaceAll("eval\\((.*)\\)", "");
//			        strVal = strVal.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
//			        this.addParam(key, strVal);
//			        continue;
//				}
//			}
			this.addParam(key, reqMap.get(key));
		}
	}

	/** 
	 * 파라미터 추가
	 * @param key
	 * @param value
	 */
	public void addParam(String key, Object value) {
		this.condition.put(key, value);
	}

	/**
	 * key를 인자로 받아 value 리턴
	 * @param key
	 * @return
	 */
	public Object getValue(String key) {
		if(containsKey(key)) {
			return condition.get(key);
		}
		return null;
	}
	
	/**
	 * key가 존재하면 true, 그렇지 않으면 false 리턴
	 * @param key
	 * @return
	 */
	public boolean containsKey(String key) {
		return condition.containsKey(key);
	}
	
	/**
	 * @return the condition
	 */
	public Map<String, Object> getCondition() {
		return condition;
	}

	/**
	 * @param condition the condition to set
	 */
	public void setCondition(Map<String, Object> condition) {
		this.condition = condition;
	}

	
}

package com.http.model;

/** 
 * <p> 
 * 父类模型，用于存放一些基础信息和参数信息
 * </p> 
 * 
 * @since 2018-03-09
 * @user: huanghc 
 */  
public class BaseModel {

	//消息发送时间
	private String time;
	//系统版本
	private String System;
	//参数列表
	private String params;
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSystem() {
		return System;
	}
	public void setSystem(String system) {
		System = system;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	@Override
	public String toString() {
		return "BaseModel [time=" + time + ", System=" + System + ", params=" + params + "]";
	}
	
}

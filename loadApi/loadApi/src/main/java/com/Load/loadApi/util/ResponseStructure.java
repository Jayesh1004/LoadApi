package com.Load.loadApi.util;

import java.util.List;

public class ResponseStructure<T> {

	private String message;
	private int status;
	private List<T> data;
	private T data1;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public void setData(T data1) {
		this.data1 = data1;
	}

	public T getData1() {
		return data1;
	}

	public void setData1(T data1) {
		this.data1 = data1;
	}

}

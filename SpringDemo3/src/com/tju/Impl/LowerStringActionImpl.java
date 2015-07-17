package com.tju.Impl;

import com.tju.action.StringAction;

public class LowerStringActionImpl implements StringAction {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String execute(String str) {
		// TODO Auto-generated method stub
		return str.toLowerCase();
	}
}

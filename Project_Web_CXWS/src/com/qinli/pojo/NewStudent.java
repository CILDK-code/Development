package com.qinli.pojo;

import java.io.Serializable;
import java.util.Date;

public class NewStudent implements Serializable{
	private String text;
	public NewStudent() {
		
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "NewStudent [text=" + text + "]";
	}
}

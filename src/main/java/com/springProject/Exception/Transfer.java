package com.springProject.Exception;

import java.util.Date;

public class Transfer {
	
	String Sendermessage;
	String Receivermessage;
	Date date;
	public Transfer() {
		super();
	}
	public Transfer(String sendermessage, String receivermessage, Date date) {
		super();
		Sendermessage = sendermessage;
		Receivermessage = receivermessage;
		this.date = date;
	}
	public String getSendermessage() {
		return Sendermessage;
	}
	public String getReceivermessage() {
		return Receivermessage;
	}
	public Date getDate() {
		return date;
	}
	public void setSendermessage(String sendermessage) {
		Sendermessage = sendermessage;
	}
	public void setReceivermessage(String receivermessage) {
		Receivermessage = receivermessage;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}

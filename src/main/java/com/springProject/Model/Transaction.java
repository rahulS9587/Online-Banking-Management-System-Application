package com.springProject.Model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int tid;


String msg;

long Accno;

public Transaction() {
	super();
}





public Transaction(int tid, String msg, long accno) {
	super();
	this.tid = tid;
	this.msg = msg;
	this.Accno = accno;
}





public int getTid() {
	return tid;
}
public String getMsg() {
	return msg;
}
public long getAccno() {
	return Accno;
}
public void setTid(int tid) {
	this.tid = tid;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public void setAccno(long accno) {
	Accno = accno;
}



}

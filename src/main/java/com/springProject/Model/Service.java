package com.springProject.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Service {
	
	
	@Id
	
	int serviceid;

 
	String servicename;
	
	int serviceplan;
	
	int amount;
	
	
	public Service() {
		super();
	}
	




	public Service(int serviceid, String servicename, int serviceplan, int amount) {
		super();
		this.serviceid = serviceid;
		this.servicename = servicename;
		this.serviceplan = serviceplan;
		this.amount = amount;
	}





	public int getServiceid() {
		return serviceid;
	}


	public String getServicename() {
		return servicename;
	}


	public int getServiceplan() {
		return serviceplan;
	}


	public int getAmount() {
		return amount;
	}




	public void setServicename(String servicename) {
		this.servicename = servicename;
	}


	public void setServiceplan(int serviceplan) {
		this.serviceplan = serviceplan;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Bill [serviceid=" + serviceid + ", servicename=" + servicename + ", serviceplan=" + serviceplan
				+ ", amount=" + amount + "]";
	}
	
	
	
	
	
	
	
	
	

}

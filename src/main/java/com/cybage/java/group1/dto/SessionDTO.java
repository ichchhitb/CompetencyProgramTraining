package com.cybage.java.group1.dto;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the session database table.
 * 
 */
public class SessionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sessionId;

	private String endDate;

	private byte isActive;

	private String sesssionName;
	
	private String startDate;

	private String trainer;
	
	public SessionDTO() {
	}

	public int getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public String getSesssionName() {
		return this.sesssionName;
	}

	public void setSesssionName(String sesssionName) {
		this.sesssionName = sesssionName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

}
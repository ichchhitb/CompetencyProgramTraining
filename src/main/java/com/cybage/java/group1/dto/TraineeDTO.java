package com.cybage.java.group1.dto;

import java.io.Serializable;


/**
 * The persistent class for the trainee database table.
 * 
 */
public class TraineeDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int traineeId;

	private String traineeName;

	private String groupUserName;

	public TraineeDTO() {
	}

	public int getTraineeId() {
		return this.traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return this.traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getGroupUserName() {
		return groupUserName;
	}

	public void setGroupUserName(String groupUserName) {
		this.groupUserName = groupUserName;
	}

}
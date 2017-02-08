package com.cybage.java.group1.dto;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the trainerstate database table.
 * 
 */
public class TrainerstateDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int trainerStateId;

	private int timeLeft;

	private int scenarioId;

	private String trainerUsername;

	public TrainerstateDTO() {
	}

	public int getTrainerStateId() {
		return this.trainerStateId;
	}

	public void setTrainerStateId(int trainerStateId) {
		this.trainerStateId = trainerStateId;
	}

	public int getTimeLeft() {
		return this.timeLeft;
	}

	public void setTimeLeft(int timeLeft) {
		this.timeLeft = timeLeft;
	}

	public String getTrainerUsername() {
		return trainerUsername;
	}

	public void setTrainerUsername(String trainerUsername) {
		this.trainerUsername = trainerUsername;
	}

	public int getScenarioId() {
		return scenarioId;
	}

	public void setScenarioId(int scenarioId) {
		this.scenarioId = scenarioId;
	}

}
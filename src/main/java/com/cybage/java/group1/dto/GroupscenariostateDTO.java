package com.cybage.java.group1.dto;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the groupscenariostate database table.
 * 
 */
public class GroupscenariostateDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int groupScenarioStateId;
	@Lob
	private String response;

	private int timeLeft;

	private int scenarioId;

	private String groupUserName;

	public GroupscenariostateDTO() {
	}

	public String getResponse() {
		return this.response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public int getTimeLeft() {
		return this.timeLeft;
	}

	public void setTimeLeft(int timeLeft) {
		this.timeLeft = timeLeft;
	}

	public int getScenarioId() {
		return scenarioId;
	}

	public void setScenarioId(int scenarioId) {
		this.scenarioId = scenarioId;
	}

	public String getGroupUserName() {
		return groupUserName;
	}

	public void setGroupUserName(String groupUserName) {
		this.groupUserName = groupUserName;
	}

}
package com.cybage.java.group1.dto;

import java.io.Serializable;


/**
 * The persistent class for the scenariogrouprelation database table.
 * 
 */
public class ScenarioGroupRelationDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int scenarioGroupId;

	private String response;

	private float score;


	private String groupUserName;

	private int scenarioId;

	public ScenarioGroupRelationDTO() {
	}

	public int getScenarioGroupId() {
		return this.scenarioGroupId;
	}

	public void setScenarioGroupId(int scenarioGroupId) {
		this.scenarioGroupId = scenarioGroupId;
	}

	public String getResponse() {
		return this.response;
	}

	public void setResponse(String response) {
		this.response = response;
	}


	public String getGroupUserName() {
		return groupUserName;
	}

	public void setGroupUserName(String groupUserName) {
		this.groupUserName = groupUserName;
	}

	public int getScenarioId() {
		return scenarioId;
	}

	public void setScenarioId(int scenarioId) {
		this.scenarioId = scenarioId;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

}
package com.cybage.java.group1.dto;

import java.io.Serializable;


/**
 * The persistent class for the scenario database table.
 * 
 */
public class ScenarioDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int scenarioId;

	private int duration;

	private byte isComplete;

	private byte isStart;
	
	private String scenarioQuestion;

	private String title;
	
	private int sessionId;

	public ScenarioDTO() {
	}

	public int getScenarioId() {
		return this.scenarioId;
	}

	public void setScenarioId(int scenarioId) {
		this.scenarioId = scenarioId;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public byte getIsComplete() {
		return this.isComplete;
	}

	public void setIsComplete(byte isComplete) {
		this.isComplete = isComplete;
	}

	public byte getIsStart() {
		return this.isStart;
	}

	public void setIsStart(byte isStart) {
		this.isStart = isStart;
	}

	public String getScenarioQuestion() {
		return this.scenarioQuestion;
	}

	public void setScenarioQuestion(String scenarioQuestion) {
		this.scenarioQuestion = scenarioQuestion;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

}
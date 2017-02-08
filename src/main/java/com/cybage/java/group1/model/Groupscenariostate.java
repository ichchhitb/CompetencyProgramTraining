package com.cybage.java.group1.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the groupscenariostate database table.
 * 
 */
@Entity
@NamedQuery(name="Groupscenariostate.findAll", query="SELECT g FROM Groupscenariostate g")
public class Groupscenariostate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int groupScenarioStateId;

	@Lob
	private String response;

	private int timeLeft;

	//bi-directional many-to-one association to Scenario
	@ManyToOne
	@JoinColumn(name="ScenarioId")
	private Scenario scenario;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="GroupUserName")
	private User usertable;

	public Groupscenariostate() {
	}

	public int getGroupScenarioStateId() {
		return this.groupScenarioStateId;
	}

	public void setGroupScenarioStateId(int groupScenarioStateId) {
		this.groupScenarioStateId = groupScenarioStateId;
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

	public Scenario getScenario() {
		return this.scenario;
	}

	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}

	public User getUsertable() {
		return this.usertable;
	}

	public void setUsertable(User usertable) {
		this.usertable = usertable;
	}

}
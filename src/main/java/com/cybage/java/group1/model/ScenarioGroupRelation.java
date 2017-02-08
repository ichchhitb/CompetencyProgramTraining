package com.cybage.java.group1.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the scenariogrouprelation database table.
 * 
 */
@Entity
@NamedQuery(name="ScenarioGroupRelation.findAll", query="SELECT s FROM ScenarioGroupRelation s")
public class ScenarioGroupRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int scenarioGroupId;

	@Lob
	private String response;

	private float score;

	//bi-directional many-to-one association to Scenario
	@ManyToOne
	@JoinColumn(name="ScenarioId")
	private Scenario scenario;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="GroupUserName")
	private User usertable;

	public ScenarioGroupRelation() {
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

	public float getScore() {
		return this.score;
	}

	public void setScore(float score) {
		this.score = score;
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
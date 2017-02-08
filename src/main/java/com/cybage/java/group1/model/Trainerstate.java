package com.cybage.java.group1.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trainerstate database table.
 * 
 */
@Entity
@NamedQuery(name="Trainerstate.findAll", query="SELECT t FROM Trainerstate t")
public class Trainerstate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int trainerStateId;

	private int timeLeft;

	//bi-directional many-to-one association to Scenario
	@ManyToOne
	@JoinColumn(name="scenarioId")
	private Scenario scenario;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="trainerUsername")
	private User usertable;

	public Trainerstate() {
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
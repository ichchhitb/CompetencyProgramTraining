package com.cybage.java.group1.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the scenario database table.
 * 
 */
@Entity
@NamedQuery(name="Scenario.findAll", query="SELECT s FROM Scenario s")
public class Scenario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int scenarioId;

	private int duration;

	private byte isComplete;

	private byte isStart;

	@Lob
	private String scenarioQuestion;

	private String title;

	//bi-directional many-to-one association to Groupscenariostate
	@OneToMany(mappedBy="scenario")
	private List<Groupscenariostate> groupscenariostates;

	//bi-directional many-to-one association to Session
	@ManyToOne
	@JoinColumn(name="SessionId")
	private Session session;

	//bi-directional many-to-one association to ScenarioGroupRelation
	@OneToMany(mappedBy="scenario")
	private List<ScenarioGroupRelation> scenariogrouprelations;

	//bi-directional many-to-one association to Trainerstate
	@OneToMany(mappedBy="scenario")
	private List<Trainerstate> trainerstates;

	public Scenario() {
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

	public List<Groupscenariostate> getGroupscenariostates() {
		return this.groupscenariostates;
	}

	public void setGroupscenariostates(List<Groupscenariostate> groupscenariostates) {
		this.groupscenariostates = groupscenariostates;
	}

	public Groupscenariostate addGroupscenariostate(Groupscenariostate groupscenariostate) {
		getGroupscenariostates().add(groupscenariostate);
		groupscenariostate.setScenario(this);

		return groupscenariostate;
	}

	public Groupscenariostate removeGroupscenariostate(Groupscenariostate groupscenariostate) {
		getGroupscenariostates().remove(groupscenariostate);
		groupscenariostate.setScenario(null);

		return groupscenariostate;
	}

	public Session getSession() {
		return this.session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public List<ScenarioGroupRelation> getScenariogrouprelations() {
		return this.scenariogrouprelations;
	}

	public void setScenariogrouprelations(List<ScenarioGroupRelation> scenariogrouprelations) {
		this.scenariogrouprelations = scenariogrouprelations;
	}

	public ScenarioGroupRelation addScenariogrouprelation(ScenarioGroupRelation scenariogrouprelation) {
		getScenariogrouprelations().add(scenariogrouprelation);
		scenariogrouprelation.setScenario(this);

		return scenariogrouprelation;
	}

	public ScenarioGroupRelation removeScenariogrouprelation(ScenarioGroupRelation scenariogrouprelation) {
		getScenariogrouprelations().remove(scenariogrouprelation);
		scenariogrouprelation.setScenario(null);

		return scenariogrouprelation;
	}

	public List<Trainerstate> getTrainerstates() {
		return this.trainerstates;
	}

	public void setTrainerstates(List<Trainerstate> trainerstates) {
		this.trainerstates = trainerstates;
	}

	public Trainerstate addTrainerstate(Trainerstate trainerstate) {
		getTrainerstates().add(trainerstate);
		trainerstate.setScenario(this);

		return trainerstate;
	}

	public Trainerstate removeTrainerstate(Trainerstate trainerstate) {
		getTrainerstates().remove(trainerstate);
		trainerstate.setScenario(null);

		return trainerstate;
	}

}
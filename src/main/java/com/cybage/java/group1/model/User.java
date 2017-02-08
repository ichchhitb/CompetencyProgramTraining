package com.cybage.java.group1.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the usertable database table.
 * 
 */
@Entity
@Table(name="usertable")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String userName;

	private byte active;

	@Temporal(TemporalType.DATE)
	private Date dateOfCreation;

	private String name;

	private String password;

	//bi-directional many-to-one association to Groupscenariostate
	@OneToMany(mappedBy="usertable")
	private List<Groupscenariostate> groupscenariostates;

	//bi-directional many-to-one association to ScenarioGroupRelation
	@OneToMany(mappedBy="usertable")
	private List<ScenarioGroupRelation> scenariogrouprelations;

	//bi-directional many-to-one association to Session
	@OneToMany(mappedBy="usertable")
	private List<Session> sessions;

	//bi-directional many-to-one association to SessionGroupRelation
	@OneToMany(mappedBy="usertable")
	private List<SessionGroupRelation> sessiongrouprelations;

	//bi-directional many-to-one association to Trainee
	@OneToMany(mappedBy="usertable")
	private List<Trainee> trainees;

	//bi-directional many-to-one association to Trainerstate
	@OneToMany(mappedBy="usertable")
	private List<Trainerstate> trainerstates;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="RoleId")
	private Role role;

	public User() {
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public Date getDateOfCreation() {
		return this.dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Groupscenariostate> getGroupscenariostates() {
		return this.groupscenariostates;
	}

	public void setGroupscenariostates(List<Groupscenariostate> groupscenariostates) {
		this.groupscenariostates = groupscenariostates;
	}

	public Groupscenariostate addGroupscenariostate(Groupscenariostate groupscenariostate) {
		getGroupscenariostates().add(groupscenariostate);
		groupscenariostate.setUsertable(this);

		return groupscenariostate;
	}

	public Groupscenariostate removeGroupscenariostate(Groupscenariostate groupscenariostate) {
		getGroupscenariostates().remove(groupscenariostate);
		groupscenariostate.setUsertable(null);

		return groupscenariostate;
	}

	public List<ScenarioGroupRelation> getScenariogrouprelations() {
		return this.scenariogrouprelations;
	}

	public void setScenariogrouprelations(List<ScenarioGroupRelation> scenariogrouprelations) {
		this.scenariogrouprelations = scenariogrouprelations;
	}

	public ScenarioGroupRelation addScenariogrouprelation(ScenarioGroupRelation scenariogrouprelation) {
		getScenariogrouprelations().add(scenariogrouprelation);
		scenariogrouprelation.setUsertable(this);

		return scenariogrouprelation;
	}

	public ScenarioGroupRelation removeScenariogrouprelation(ScenarioGroupRelation scenariogrouprelation) {
		getScenariogrouprelations().remove(scenariogrouprelation);
		scenariogrouprelation.setUsertable(null);

		return scenariogrouprelation;
	}

	public List<Session> getSessions() {
		return this.sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

	public Session addSession(Session session) {
		getSessions().add(session);
		session.setUsertable(this);

		return session;
	}

	public Session removeSession(Session session) {
		getSessions().remove(session);
		session.setUsertable(null);

		return session;
	}

	public List<SessionGroupRelation> getSessiongrouprelations() {
		return this.sessiongrouprelations;
	}

	public void setSessiongrouprelations(List<SessionGroupRelation> sessiongrouprelations) {
		this.sessiongrouprelations = sessiongrouprelations;
	}

	public SessionGroupRelation addSessiongrouprelation(SessionGroupRelation sessiongrouprelation) {
		getSessiongrouprelations().add(sessiongrouprelation);
		sessiongrouprelation.setUsertable(this);

		return sessiongrouprelation;
	}

	public SessionGroupRelation removeSessiongrouprelation(SessionGroupRelation sessiongrouprelation) {
		getSessiongrouprelations().remove(sessiongrouprelation);
		sessiongrouprelation.setUsertable(null);

		return sessiongrouprelation;
	}

	public List<Trainee> getTrainees() {
		return this.trainees;
	}

	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}

	public Trainee addTrainee(Trainee trainee) {
		getTrainees().add(trainee);
		trainee.setUsertable(this);

		return trainee;
	}

	public Trainee removeTrainee(Trainee trainee) {
		getTrainees().remove(trainee);
		trainee.setUsertable(null);

		return trainee;
	}

	public List<Trainerstate> getTrainerstates() {
		return this.trainerstates;
	}

	public void setTrainerstates(List<Trainerstate> trainerstates) {
		this.trainerstates = trainerstates;
	}

	public Trainerstate addTrainerstate(Trainerstate trainerstate) {
		getTrainerstates().add(trainerstate);
		trainerstate.setUsertable(this);

		return trainerstate;
	}

	public Trainerstate removeTrainerstate(Trainerstate trainerstate) {
		getTrainerstates().remove(trainerstate);
		trainerstate.setUsertable(null);

		return trainerstate;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
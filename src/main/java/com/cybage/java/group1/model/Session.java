package com.cybage.java.group1.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the session database table.
 * 
 */
@Entity
@NamedQuery(name="Session.findAll", query="SELECT s FROM Session s")
public class Session implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sessionId;

	@Temporal(TemporalType.DATE)
	private Date endDate;

	private byte isActive;

	private String sesssionName;

	@Temporal(TemporalType.DATE)
	private Date startDate;

	//bi-directional many-to-one association to Scenario
	@OneToMany(mappedBy="session")
	private List<Scenario> scenarios;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="Trainer")
	private User usertable;

	//bi-directional many-to-one association to SessionGroupRelation
	@OneToMany(mappedBy="session")
	private List<SessionGroupRelation> sessiongrouprelations;

	public Session() {
	}

	public int getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public String getSesssionName() {
		return this.sesssionName;
	}

	public void setSesssionName(String sesssionName) {
		this.sesssionName = sesssionName;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public List<Scenario> getScenarios() {
		return this.scenarios;
	}

	public void setScenarios(List<Scenario> scenarios) {
		this.scenarios = scenarios;
	}

	public Scenario addScenario(Scenario scenario) {
		getScenarios().add(scenario);
		scenario.setSession(this);

		return scenario;
	}

	public Scenario removeScenario(Scenario scenario) {
		getScenarios().remove(scenario);
		scenario.setSession(null);

		return scenario;
	}

	public User getUsertable() {
		return this.usertable;
	}

	public void setUsertable(User usertable) {
		this.usertable = usertable;
	}

	public List<SessionGroupRelation> getSessiongrouprelations() {
		return this.sessiongrouprelations;
	}

	public void setSessiongrouprelations(List<SessionGroupRelation> sessiongrouprelations) {
		this.sessiongrouprelations = sessiongrouprelations;
	}

	public SessionGroupRelation addSessiongrouprelation(SessionGroupRelation sessiongrouprelation) {
		getSessiongrouprelations().add(sessiongrouprelation);
		sessiongrouprelation.setSession(this);

		return sessiongrouprelation;
	}

	public SessionGroupRelation removeSessiongrouprelation(SessionGroupRelation sessiongrouprelation) {
		getSessiongrouprelations().remove(sessiongrouprelation);
		sessiongrouprelation.setSession(null);

		return sessiongrouprelation;
	}

}
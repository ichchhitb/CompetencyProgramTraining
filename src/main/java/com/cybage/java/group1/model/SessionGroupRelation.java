package com.cybage.java.group1.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sessiongrouprelation database table.
 * 
 */
@Entity
@NamedQuery(name="SessionGroupRelation.findAll", query="SELECT s FROM SessionGroupRelation s")
public class SessionGroupRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sessionGroupId;

	//bi-directional many-to-one association to Session
	@ManyToOne
	@JoinColumn(name="SessionId")
	private Session session;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="groupUsername")
	private User usertable;

	public SessionGroupRelation() {
	}

	public int getSessionGroupId() {
		return this.sessionGroupId;
	}

	public void setSessionGroupId(int sessionGroupId) {
		this.sessionGroupId = sessionGroupId;
	}

	public Session getSession() {
		return this.session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public User getUsertable() {
		return this.usertable;
	}

	public void setUsertable(User usertable) {
		this.usertable = usertable;
	}

}
package com.cybage.java.group1.dto;

import java.io.Serializable;


/**
 * The persistent class for the sessiongrouprelation database table.
 * 
 */
public class SessionGroupRelationDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int sessionGroupId;

	private String groupUserName;

	private int sessionId;

	public SessionGroupRelationDTO() {
	}

	public int getSessionGroupId() {
		return this.sessionGroupId;
	}

	public void setSessionGroupId(int sessionGroupId) {
		this.sessionGroupId = sessionGroupId;
	}

	public String getGroupUserName() {
		return groupUserName;
	}

	public void setGroupUserName(String groupUserName) {
		this.groupUserName = groupUserName;
	}

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

}
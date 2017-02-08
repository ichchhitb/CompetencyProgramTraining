package com.cybage.java.group1.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trainee database table.
 * 
 */
@Entity
@NamedQuery(name="Trainee.findAll", query="SELECT t FROM Trainee t")
public class Trainee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int traineeId;

	private String traineeName;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="groupUsername")
	private User usertable;

	public Trainee() {
	}

	public int getTraineeId() {
		return this.traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return this.traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public User getUsertable() {
		return this.usertable;
	}

	public void setUsertable(User usertable) {
		this.usertable = usertable;
	}

}
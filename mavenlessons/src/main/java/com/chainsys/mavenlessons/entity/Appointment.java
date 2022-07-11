package com.chainsys.mavenlessons.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Appointment")
public class Appointment {
	@Id

	private int app_id;
	private Date app_date;
//	private int id;
	private String patient_name;
	private int fees_collected;
	private String fees_nature;

	@ManyToOne(fetch = FetchType.LAZY)

	@JoinColumn(name = "ID", nullable = false,

			insertable = false, updatable = false)
	@JsonIgnore
	private Doctor doctor;

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public int getAPP_ID() {
		return app_id;
	}

	public void setAPP_ID(int aPP_ID) {
		app_id = aPP_ID;
	}

	public Date getAPP_DATE() {
		return app_date;
	}

	public void setAPP_DATE(Date aPP_DATE) {
		app_date = aPP_DATE;
	}
//
//	public int getID() {
//		return ID;
//	}
//
//	public void setID(int iD) {
//		ID = iD;
//	}

	public String getPATIENT_NAME() {
		return patient_name;
	}

	public void setPATIENT_NAME(String pATIENT_NAME) {
		patient_name = pATIENT_NAME;
	}

	public int getFEES_COLLECTED() {
		return fees_collected;
	}

	public void setFEES_COLLECTED(int fEES_COLLECTED) {
		fees_collected = fEES_COLLECTED;
	}

	public String getFEES_NATURE() {
		return fees_nature;
	}

	public void setFEES_NATURE(String fEES_NATURE) {
		fees_nature = fEES_NATURE;
	}

	@Override
	public String toString() {
		return String.format("%d, %s, %s, %d, %s", app_id, app_date, patient_name, fees_collected, fees_nature);
	}
}

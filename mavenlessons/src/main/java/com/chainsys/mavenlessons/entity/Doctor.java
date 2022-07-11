package com.chainsys.mavenlessons.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "Doctor")
public class Doctor {
	@Id
	private int id;
	private String name;
	private Date dob;
	@Column(name="SPACIALITY")
	private String speciality;
	private String city;
	private Long phone_no;
	private float standard_fees;
	//Bidirectional association
	
	@OneToMany(mappedBy = "doctor",fetch = FetchType.LAZY )
	@JsonIgnore
	private List<Appointment > appointments;
	public List<Appointment> getAppointments(){
		return this.appointments;
	} 
	
	public int getID() {
		return id;
	}

	public void setID(int iD) {
		id = iD;
	}

	public String getNAME() {
		return name;
	}

	public void setNAME(String nAME) {
		name = nAME;
	}

	public Date getDOB() {
		return dob;
	}

	public void setDOB(Date dOB) {
		dob = dOB;
	}

	public String getSPACIALITY() {
		return speciality;
	}

	public void setSPACIALITY(String sPACIALITY) {
		speciality = sPACIALITY;
	}

	public String getCITY() {
		return city;
	}

	public void setCITY(String cITY) {
		city = cITY;
	}

	public Long getPHONE_NO() {
		return phone_no;
	}

	public void setPHONE_NO(long pHONE_NO) {
		phone_no = pHONE_NO;
	}

	public float getSTANDARD_FEES() {
		return standard_fees;
	}

	public void setSTANDARD_FEES(float sTANDARD_FEES) {
		standard_fees = sTANDARD_FEES;
	}
	@Override
	public String toString() {
		return String.format(" { %d, %s, %s, %s, %s, %d, %.2f }", id, name, dob, 
				 speciality, city, phone_no,standard_fees);
	}
}

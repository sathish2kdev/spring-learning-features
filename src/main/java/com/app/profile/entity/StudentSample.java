package com.app.profile.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_master_sample")
public class StudentSample {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Long studentId;

	@Column(name = "student_name")
	private String studentName;

	@Column(name = "student_roll_number")
	private String studentRollNumber;

	@Column(name = "date_of_joining")
	private Date dateOfJoining;

	@Column(name = "fees_paid_status")
	private String feesPaidStatus;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(String studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getFeesPaidStatus() {
		return feesPaidStatus;
	}

	public void setFeesPaidStatus(String feesPaidStatus) {
		this.feesPaidStatus = feesPaidStatus;
	}

}

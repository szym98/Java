package com.capgemini.wsb.persistence.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "PATIENT")
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 20)
	private Long id;


	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;


	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;


	@Column(name = "TELEPHONE_NUMBER", nullable = false)
	private String telephoneNumber;

	@Column(name = "EMAIL")
	private String email;


	@Column(name = "PATIENT_NUMBER", nullable = false)
	private String patientNumber;


	@Column(name = "DATE_OF_BIRTH", nullable = false)
	private LocalDate dateOfBirth;
	@OneToMany(mappedBy = "patient")
	private List<VisitEntity> visits;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public List<VisitEntity> getVisits() {
		return visits;
	}

	public void setVisits(List<VisitEntity> visits) {
		this.visits = visits;
	}
}
package com.healix.healixserver.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hospital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String hospitalName;
	private String hospitalAddress;
	private String hospitalCity;
	private String hospitalState;
	private String hospitalZip;
	private Integer doctorCount;
	private Set<Doctor> doctors;
	private Integer bedroomCount;
	private Integer emergencyWardCount;
	private Integer icuCount;
	private Integer hospitalType;
	private Integer ambulanceCount;
	private Set<Department> departments;
	
}
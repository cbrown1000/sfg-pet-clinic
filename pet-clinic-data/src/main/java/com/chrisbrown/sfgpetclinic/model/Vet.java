package com.chrisbrown.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

	private Set<Specialty> specialties = new HashSet<Specialty>();
	
	public Set<Specialty> getSpecialties() {
		return this.specialties;
	}
	
	public void setSpecialties(Set<Specialty> specialities) {
		this.specialties = specialities;
	}
}

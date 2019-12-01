package com.chrisbrown.sfgpetclinic.model;

public class Vet extends Person {

	private Set<Speciality> specialities;
	
	public Set<Speciality> get Specialities() {
		return this.specialities;
	}
	
	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}
}

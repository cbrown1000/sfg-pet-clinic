package com.chrisbrown.sfgpetclinic.model;

public class Visit extends BaseEntity {
	
	private LocalDate date;
	private String description;
	private Pet pet;

	public LocalDate getDate() {
		return this.date;
	}
	
	public void setDate(LocalDate localDate) {
		this.date = localDate;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Pet getPet() {
		return this.pet;
	}
	
	public void setPet(Pet pet) {
		this.pet = pet;
	}
}

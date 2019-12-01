package com.chrisbrown.sfgpetclinic.model;

public class Owner extends Person {
	
	private Set<Pet> pets;
	
	public <Set>Pet getPets(){
		return this.pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
}

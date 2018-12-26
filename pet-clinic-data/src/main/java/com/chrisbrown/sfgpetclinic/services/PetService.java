package com.chrisbrown.sfgpetclinic.services;

import java.util.Set;

import com.chrisbrown.sfgpetclinic.model.Pet;

public interface PetService {
	
	Pet FindById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();

}

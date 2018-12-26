package com.chrisbrown.sfgpetclinic.services;

import java.util.Set;

import com.chrisbrown.sfgpetclinic.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);

	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
	
	
}

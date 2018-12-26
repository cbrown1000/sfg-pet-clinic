package com.chrisbrown.sfgpetclinic.services;

import java.util.Set;

import com.chrisbrown.sfgpetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}

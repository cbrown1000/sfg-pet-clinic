package com.chrisbrown.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import com.chrisbrown.sfgpetclinic.model.Pet;
import com.chrisbrown.sfgpetclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Pet save(Pet object) {
		return super.save(object);
	}

}

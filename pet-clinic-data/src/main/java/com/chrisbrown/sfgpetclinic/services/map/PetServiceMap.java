package com.chrisbrown.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import com.chrisbrown.sfgpetclinic.model.Pet;
import com.chrisbrown.sfgpetclinic.services.CrudService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Pet save(Pet object) {
		return super.save(object);
	}

}

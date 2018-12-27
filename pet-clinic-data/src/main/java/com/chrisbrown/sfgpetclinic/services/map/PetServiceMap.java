package com.chrisbrown.sfgpetclinic.services.map;

import com.chrisbrown.sfgpetclinic.model.Pet;
import com.chrisbrown.sfgpetclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Pet save(Pet object) {
		return this.save(object.getId(), object);
	}

}

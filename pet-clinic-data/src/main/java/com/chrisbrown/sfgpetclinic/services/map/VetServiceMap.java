package com.chrisbrown.sfgpetclinic.services.map;

import com.chrisbrown.sfgpetclinic.model.Vet;
import com.chrisbrown.sfgpetclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

	@Override
	public Vet save(Vet object) {
		return this.save(object.getId(), object);
	}

}

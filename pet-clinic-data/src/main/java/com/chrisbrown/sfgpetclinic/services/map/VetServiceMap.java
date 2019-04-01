package com.chrisbrown.sfgpetclinic.services.map;

import com.chrisbrown.sfgpetclinic.model.Vet;
import com.chrisbrown.sfgpetclinic.services.CrudService;
import com.chrisbrown.sfgpetclinic.services.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	
	public Vet save(Vet object) {
		return this.save(object.getId(), object);
	}

}

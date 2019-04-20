package com.chrisbrown.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import com.chrisbrown.sfgpetclinic.model.Vet;
import com.chrisbrown.sfgpetclinic.services.CrudService;
import com.chrisbrown.sfgpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	
	public Vet save(Vet object) {
		return super.save(object);
	}

}

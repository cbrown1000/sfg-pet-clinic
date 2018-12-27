package com.chrisbrown.sfgpetclinic.services.map;

import java.util.Set;

import com.chrisbrown.sfgpetclinic.model.Owner;
import com.chrisbrown.sfgpetclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

	@Override
	public Owner save(Owner object) {
		return this.save(object.getId(), object);
	}

}

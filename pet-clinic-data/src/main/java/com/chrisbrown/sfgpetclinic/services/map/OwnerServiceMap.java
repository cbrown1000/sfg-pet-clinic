package com.chrisbrown.sfgpetclinic.services.map;

import com.chrisbrown.sfgpetclinic.model.Owner;
import com.chrisbrown.sfgpetclinic.services.CrudService;
import com.chrisbrown.sfgpetclinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

	@Override
	public Owner save(Owner object) {
		return this.save(object.getId(), object);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}

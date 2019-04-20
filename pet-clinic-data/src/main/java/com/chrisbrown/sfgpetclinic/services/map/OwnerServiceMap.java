package com.chrisbrown.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import com.chrisbrown.sfgpetclinic.model.Owner;
import com.chrisbrown.sfgpetclinic.services.CrudService;
import com.chrisbrown.sfgpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

	@Override
	public Owner save(Owner object) {
		return super.save(object);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}

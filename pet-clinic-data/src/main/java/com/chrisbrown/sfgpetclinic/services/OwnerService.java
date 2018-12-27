package com.chrisbrown.sfgpetclinic.services;

import com.chrisbrown.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);

}

package com.chrisbrown.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import com.chrisbrown.sfgpetclinic.model.Specialty;
import com.chrisbrown.sfgpetclinic.model.Vet;
import com.chrisbrown.sfgpetclinic.services.CrudService;
import com.chrisbrown.sfgpetclinic.services.SpecialtyService;
import com.chrisbrown.sfgpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	private SpecialtyService specialtyService;
	
	
	
	public VetServiceMap(SpecialtyService specialtyService) {
		this.specialtyService = specialtyService;
	}



	public Vet save(Vet object) {
		
		if(object.getSpecialties().size() > 0) {
			object.getSpecialties().forEach(specialty ->{
				if(specialty.getId() == null) {
					Specialty saveSpecialty = this.specialtyService.save(specialty);
					specialty.setId(saveSpecialty.getId());
				}
			});
		}
		
		return super.save(object);
	}

}

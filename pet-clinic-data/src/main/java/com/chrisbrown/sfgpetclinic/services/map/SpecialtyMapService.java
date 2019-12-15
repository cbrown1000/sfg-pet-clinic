package com.chrisbrown.sfgpetclinic.services.map;

import java.util.Set;

import com.chrisbrown.sfgpetclinic.model.Specialty;
import com.chrisbrown.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;



@Service
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService{

	@Override
	public Set<Specialty> findAll() {
		return super.findAll();
	}

	@Override
	public Specialty findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Specialty save(Specialty object) {
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Specialty object) {
		super.delete(object);
	}

	
	
}

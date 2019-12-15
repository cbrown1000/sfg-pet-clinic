package com.chrisbrown.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.chrisbrown.sfgpetclinic.model.Owner;
import com.chrisbrown.sfgpetclinic.model.Pet;
import com.chrisbrown.sfgpetclinic.model.PetType;
import com.chrisbrown.sfgpetclinic.model.Specialty;
import com.chrisbrown.sfgpetclinic.model.Vet;
import com.chrisbrown.sfgpetclinic.services.OwnerService;
import com.chrisbrown.sfgpetclinic.services.PetTypeService;
import com.chrisbrown.sfgpetclinic.services.SpecialtyService;
import com.chrisbrown.sfgpetclinic.services.VetService;
import com.chrisbrown.sfgpetclinic.services.map.OwnerServiceMap;
import com.chrisbrown.sfgpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader  implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialtyService specialtyService;
	
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialtyService = specialtyService;
	}

	@Override
	public void run(String... args) throws Exception{

		int count = this.petTypeService.findAll().size();
		if(count == 0) {
			loadData();
			
		}
		
	}

	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		System.out.println("Loading PetTypes....");
		
		Specialty radiology = new Specialty();
		radiology.setDescription("Radiology");
		Specialty savedRadiology = this.specialtyService.save(radiology);

		Specialty surgery = new Specialty();
		surgery.setDescription("Surgery");
		Specialty savedSurgery = this.specialtyService.save(surgery);

		Specialty dentisty = new Specialty();
		dentisty.setDescription("Dentisty");
		Specialty savedDentisty = this.specialtyService.save(dentisty);

		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("123 Brickerel");
		owner1.setCity("Miami");
		owner1.setTelephone("1234567890");
		
		Pet mikesPet = new Pet();
		mikesPet.setPetType(savedDogPetType);
		mikesPet.setOwner(owner1);
		mikesPet.setBirthDate(LocalDate.now());
		mikesPet.setName("Rosco");
		
		owner1.getPets().add(mikesPet);
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("123 Brickerel");
		owner2.setCity("Miami");
		owner2.setTelephone("1234567890");
		
		Pet fionasCat = new Pet();
		fionasCat.setName("Just Cat");
		fionasCat.setOwner(owner2);
		fionasCat.setBirthDate(LocalDate.now());
		fionasCat.setPetType(savedCatPetType);
		
		owner2.getPets().add(fionasCat);
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners....");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vet1.getSpecialties().add(savedRadiology);
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vet2.getSpecialties().add(savedSurgery);
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets....");
	}
}

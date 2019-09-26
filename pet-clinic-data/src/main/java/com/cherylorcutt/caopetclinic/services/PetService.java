package com.cherylorcutt.caopetclinic.services;

import com.cherylorcutt.caopetclinic.model.Pet;
import java.util.Set;

public interface PetService {

  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();

}

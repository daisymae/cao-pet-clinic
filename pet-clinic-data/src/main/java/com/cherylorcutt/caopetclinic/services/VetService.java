package com.cherylorcutt.caopetclinic.services;

import com.cherylorcutt.caopetclinic.model.Vet;
import java.util.Set;

public interface VetService {
  Vet findById(Long id);

  Vet save(Vet vet);

  Set<Vet> findAll();

}

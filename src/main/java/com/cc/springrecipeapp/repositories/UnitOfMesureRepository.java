package com.cc.springrecipeapp.repositories;

import com.cc.springrecipeapp.model.UnitOfMesure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitOfMesureRepository extends CrudRepository<UnitOfMesure, Long> {
}

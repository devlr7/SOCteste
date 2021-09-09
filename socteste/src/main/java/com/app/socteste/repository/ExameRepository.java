package com.app.socteste.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.socteste.model.Exame;

public interface ExameRepository extends CrudRepository<Exame, String>{

	Exame findById(int id);

}

package com.idat.Practica1Prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Practica1Prueba.model.Items;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Integer>{
	

}

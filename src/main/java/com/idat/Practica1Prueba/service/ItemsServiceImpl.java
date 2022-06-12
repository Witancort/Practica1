package com.idat.Practica1Prueba.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.idat.Practica1Prueba.model.Items;
import com.idat.Practica1Prueba.repository.ItemsRepository;


@Service
public class ItemsServiceImpl implements ItemService {
	
	@Autowired 
	private ItemsRepository repository;

	@Override
	public void guardarItems(Items item) {
		// TODO Auto-generated method stub
		
		repository.save(item);
		
		
	}

	@Override
	public void actualizarItems(Items item) {
		// TODO Auto-generated method stub
		
		repository.saveAndFlush(item);
	}

	@Override
	public void eliminarItems(Integer id) {
		// TODO Auto-generated method stub
		
		repository.deleteById(id);
		
	}

	@Override
	public List<Items> listarItems() {
		// TODO Auto-generated method stub
		
		
		return repository.findAll();
	}

	@Override
	public Items obtenerItemsId(Integer id) {
		// TODO Auto-generated method stub
		
		return repository.findById(id).orElse(null);
	}

}


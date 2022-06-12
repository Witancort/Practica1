package com.idat.Practica1Prueba.service;

import java.util.List;


import com.idat.Practica1Prueba.model.Items;

public interface ItemService {
	
	void guardarItems(Items item);
	void actualizarItems(Items item);
	void eliminarItems(Integer id);
	List<Items> listarItems();
	Items obtenerItemsId(Integer id);

}

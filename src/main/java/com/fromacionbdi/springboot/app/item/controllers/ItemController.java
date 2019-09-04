package com.fromacionbdi.springboot.app.item.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fromacionbdi.springboot.app.item.models.Item;
import com.fromacionbdi.springboot.app.item.services.ItemService;

@RestController
public class ItemController {

	@Autowired
	@Qualifier("restTemplateService")
	private ItemService itemService;
	
	@GetMapping("/listar")
	public List<Item> listar(){
		return itemService.findAll();
	}
	
	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Item detalle (@PathVariable Long id, @PathVariable Integer cantidad){
		return itemService.findById(id, cantidad);
	}
}

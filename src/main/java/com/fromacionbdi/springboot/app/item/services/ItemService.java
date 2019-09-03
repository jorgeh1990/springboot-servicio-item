package com.fromacionbdi.springboot.app.item.services;

import java.util.List;

import com.fromacionbdi.springboot.app.item.models.Item;

public interface ItemService  {
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}

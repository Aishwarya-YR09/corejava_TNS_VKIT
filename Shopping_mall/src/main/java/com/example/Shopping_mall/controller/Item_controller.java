package com.example.Shopping_mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shopping_mall.entity.Item_entity;
import com.example.Shopping_mall.service.Item_service;
// postman->controller->service->repository->database

@RestController
public class Item_controller {
	
	@Autowired
	private Item_service is;
	
	@PostMapping("/add") // save
	public Item_entity registeritem(@RequestBody Item_entity i) {
		return is.registeritem(i);
	}
	
	@GetMapping("/getitem") // get
	public List<Item_entity> getitems()
	{
		return is.getitems();
	}
	
	@DeleteMapping("/deleteitem/{id}")// delete 
	public void deleteitem(@PathVariable("id") Integer id) {
		is.deleteitem(id);
	}
}
// update - putmapping



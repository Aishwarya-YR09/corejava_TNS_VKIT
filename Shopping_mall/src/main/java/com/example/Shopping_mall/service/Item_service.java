package com.example.Shopping_mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Shopping_mall.entity.Item_entity;
import com.example.Shopping_mall.repository.Item_repo;

@Service
public class Item_service {
	
	@Autowired
	private Item_repo ir;
	
	// create 
	
		public Item_entity registeritem(Item_entity i) {
			return ir.save(i);
		}
		
		// read
		
		public List<Item_entity> getitems(){
			return (List<Item_entity>) ir.findAll();
		}
		
		//delete
		
		public void deleteitem(Integer id) {
			ir.deleteById(id);
		}


}

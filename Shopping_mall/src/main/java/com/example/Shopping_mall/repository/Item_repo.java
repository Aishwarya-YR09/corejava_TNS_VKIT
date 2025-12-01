package com.example.Shopping_mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Shopping_mall.entity.Item_entity;

@Repository
public interface Item_repo extends JpaRepository<Item_entity, Integer> {

}

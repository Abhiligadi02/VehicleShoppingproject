package com.example.demo.repository;
 

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.AdduserProduct;

public interface AdduserProductRepository extends JpaRepository<AdduserProduct,Integer> {
	AdduserProduct findByOwnerName(String ownerName);
}

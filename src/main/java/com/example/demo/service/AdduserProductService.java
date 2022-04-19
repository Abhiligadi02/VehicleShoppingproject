package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AdduserProduct;
import com.example.demo.repository.AdduserProductRepository;

import java.util.List;

@Service
public class AdduserProductService {
    @Autowired
    private AdduserProductRepository repository;

    public AdduserProduct saveAdduserProduct (AdduserProduct  adduserProduct ) {
        return repository.save(adduserProduct );
    }

    public List<AdduserProduct > saveAdduserProduct(List<AdduserProduct > userproducts) {
        return repository.saveAll(userproducts);
    }

    public List<AdduserProduct> getAdduserProduct() {
        return repository.findAll();
    }

    public AdduserProduct  getAdduserProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public AdduserProduct  getAdduserProductByName(String ownerName) {
        return repository. findByOwnerName(ownerName);
    }

    public String deleteAdduserProduct(int id) {
        repository.deleteById(id);
        return "AdduserProduct removed !! " + id;
    }

    public AdduserProduct updateAdduserProduct(AdduserProduct adduserProduct) {
    	AdduserProduct existingadduserProduct= repository.findById(adduserProduct.getId()).orElse(null);
    	existingadduserProduct.setOwnerName(adduserProduct.getOwnerName());
    	existingadduserProduct.setPhoneNumber(adduserProduct.getPhoneNumber());
    	existingadduserProduct.setOwnerAdress(adduserProduct.getOwnerAdress());
    	existingadduserProduct.setVehicleName(adduserProduct.getVehicleName());
    	existingadduserProduct.setPrice(adduserProduct.getPrice());
    	existingadduserProduct.setVehicleImage(adduserProduct.getVehicleImage());
    	existingadduserProduct.setCategory(adduserProduct.getCategory());
    	existingadduserProduct.setVehicleDetails(adduserProduct.getVehicleDetails());

        
        
        return repository.save(existingadduserProduct);
    }

     

}

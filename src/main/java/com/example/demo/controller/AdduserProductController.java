package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.AdduserProduct;
 
import com.example.demo.service.AdduserProductService;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
public class AdduserProductController {

    @Autowired
    private AdduserProductService service;

    @PostMapping("/addAdduserProduct")
    public AdduserProduct addCustomer(@RequestBody AdduserProduct adduserProduct) {
        return service.saveAdduserProduct(adduserProduct);
    }

    @PostMapping("/addAdduserProducts")
    public List<AdduserProduct> addAdduserProduct(@RequestBody List<AdduserProduct> adduserProduct) {
        return service.saveAdduserProduct(adduserProduct);
    }

    @GetMapping("/userProducts")
    public List<AdduserProduct> findAllAdduserProducts() {
        return service.getAdduserProduct();
    }
    

    @GetMapping("/AdduserProductById/{id}")
    public AdduserProduct findAdduserProductById(@PathVariable int id) {
        return service.getAdduserProductById(id);
    }

    @GetMapping("/adduserProduct/{name}")
    public AdduserProduct findAdduserProductByName(@PathVariable String ownerName) {
        return service.getAdduserProductByName(ownerName);
    }

    @PutMapping("/updated")
    public AdduserProduct updateAdduserProduct(@RequestBody AdduserProduct adduserProduct) {
        return service.updateAdduserProduct(adduserProduct);
    }

    @DeleteMapping("/deleted/{id}")
    public String deleteAdduserProduct(@PathVariable int id) {
        return service.deleteAdduserProduct(id);
    }
}

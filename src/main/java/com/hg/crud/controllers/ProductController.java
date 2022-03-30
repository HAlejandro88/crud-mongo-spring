package com.hg.crud.controllers;

import com.hg.crud.models.Product;
import com.hg.crud.repositories.IProduct;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alejandro.soto
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/products")
public class ProductController {
    
    @Autowired
    private IProduct repository;
    
    @PostMapping("/create")
    public Product create(@RequestBody Product prod) {
        return repository.insert(prod);
    }
    
    @GetMapping("/all")
    public List<Product> allProducts() {
        return repository.findAll();
    }
    
    @PutMapping("/{id}")
    
    public Product updateProd(@PathVariable String id, @Validated @RequestBody Product prod) {
        return repository.save(prod);
    }
    
    @DeleteMapping("/product/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }
    
}

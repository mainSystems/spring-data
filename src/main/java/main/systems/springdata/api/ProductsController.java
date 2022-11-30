package main.systems.springdata.api;

import main.systems.springdata.model.Products;
import main.systems.springdata.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    ProductsRepository productsRepository;

    @GetMapping("/{id}")
    public Products getProductsById(@PathVariable Long id) {
            return productsRepository.getReferenceById(id);
    }

    @GetMapping("/all")
    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    @PostMapping
    public void addProducts(Products products) {
        productsRepository.save(products);
    }

    @GetMapping("/delete/{id}")
    public void delProductsById(@PathVariable Long id) {
        System.out.println("id to del= " + id);
        if (productsRepository.existsById(id)) {
            productsRepository.deleteById(id);
        }
    }

}

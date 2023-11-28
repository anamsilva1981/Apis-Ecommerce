package com.crud.api.app.controller;

import com.crud.api.app.services.ProductService;
import com.crud.api.domain.entities.ProductsModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductsModel>> findAll(){
        List<ProductsModel> list = productService.findAllProducts();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductsModel> findById(@PathVariable Long id){
        ProductsModel findById = productService.findById(id);
        return ResponseEntity.ok(findById);
    }

    @PostMapping
    public List<ProductsModel> createProduct(@RequestBody ProductsModel productsModel){
        return productService.createProduct(productsModel);
    }

    @PutMapping
    public List<ProductsModel> updateProduct(@RequestBody ProductsModel productsModel){
        return productService.updateProduct(productsModel);
    }

    @DeleteMapping("{id}")
        public List<ProductsModel> deleteProduct(@PathVariable Long id){
        return productService.deleteProduct(id);
    }



}

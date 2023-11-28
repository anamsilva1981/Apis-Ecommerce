package com.crud.api.app.services;

import com.crud.api.domain.entities.ProductsModel;
import com.crud.api.infra.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductsModel> findAllProducts() {
        return productRepository.findAll();
    }

    public List<ProductsModel> createProduct(ProductsModel productsModel) {
        productRepository.save(productsModel);
        return findAllProducts();
    }

    public List<ProductsModel> updateProduct(ProductsModel productsModel){
        productRepository.save(productsModel);
        return findAllProducts();
    }

    public ProductsModel findById(Long id_products){
        Optional<ProductsModel> findById = productRepository.findById(id_products);
        return findById.get();
    }

    public List<ProductsModel> deleteProduct(Long id){
        productRepository.deleteById(id);
        return findAllProducts();
    }

}

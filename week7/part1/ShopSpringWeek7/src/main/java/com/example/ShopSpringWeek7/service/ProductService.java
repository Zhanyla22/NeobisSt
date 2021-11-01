package com.example.ShopSpringWeek7.service;


import com.example.ShopSpringWeek7.entity.Product;
import com.example.ShopSpringWeek7.model.ProductModel;
import com.example.ShopSpringWeek7.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public Optional<Product> findByIdProduct(Integer id){
        return productRepository.findById(id);
    }


    public Product addNewProduct(ProductModel productModel){
        Product product = new Product(1,productModel.getName(),productModel.getBrandName(),productModel.getCost());
        return productRepository.save(product);
    }

    public String updatebyIdProduct(Integer id, ProductModel productModel){
        Optional<Product> product = productRepository.findById(id);
        product.get().setName(productModel.getName());
        product.get().setBrandName(productModel.getBrandName());
        product.get().setCost(productModel.getCost());
        return "updated...";
    }
}

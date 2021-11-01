package com.example.ShopSpringWeek7.controller;

import com.example.ShopSpringWeek7.entity.Product;
import com.example.ShopSpringWeek7.model.ProductModel;
import com.example.ShopSpringWeek7.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/allProducts")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/{id}")
    public Optional<Product> getByIdproduct(@PathVariable("id") Integer id){
        return productService.findByIdProduct(id);
    }

    @PostMapping("/adding Product")
    public ProductModel addNewProduct(@RequestBody ProductModel productModel){
        productService.addNewProduct(productModel);
        return productModel;
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable ("id") Integer id, @RequestBody ProductModel productModel){
        return productService.updatebyIdProduct(id,productModel);
    }
}

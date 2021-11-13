package com.example.SpringWeek7.Service;

import com.example.SpringWeek7.Entity.Product;
import com.example.SpringWeek7.Model.ProductModel;
import com.example.SpringWeek7.Repository.ProductRepository;
import javassist.NotFoundException;
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

    public Optional<Product> findByIdProduct(Integer id) throws Exception{

        return Optional.ofNullable(productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("here is no such a Product with this id :",id))));


    }


    public Product addNewProduct(ProductModel productModel){
        Product product = new Product(productModel.getName(),productModel.getBrandName(),productModel.getCost());
        return productRepository.save(product);
    }

    public String updateByIdProduct(Integer id, ProductModel productModel){
        Optional<Product> product = productRepository.findById(id);
        product.get().setName(productModel.getName());
        product.get().setBrandName(productModel.getBrandName());
        product.get().setCost(productModel.getCost());
        return "updated...";
    }
}

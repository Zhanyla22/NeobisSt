package com.example.SpringWeek7.Controller;

import com.example.SpringWeek7.Entity.Product;
import com.example.SpringWeek7.Model.ProductModel;
import com.example.SpringWeek7.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/all-Products")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/{id}")
    public Optional<Product> getByIdProduct(@PathVariable("id") Integer id) throws Exception {
        return productService.findByIdProduct(id);
    }

    @PostMapping("/adding-Product")
    public ProductModel addNewProduct(@RequestBody ProductModel productModel){
        productService.addNewProduct(productModel);
        return productModel;
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable ("id") Integer id, @RequestBody ProductModel productModel){
        return productService.updateByIdProduct(id,productModel);
    }
}

package com.example.SpringWeek7;

import com.example.SpringWeek7.Entity.Product;
import com.example.SpringWeek7.Repository.ProductRepository;
import org.assertj.core.api.AbstractInstantAssert;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SpringWeek7ApplicationTests {

	/*@Test
	void contextLoads() {
	}*/

	@Autowired
	ProductRepository productRepository;
	@Test
	@Order(1)
	public void testCreate(){
		Product product = new Product();
		product.setId(1);
		product.setName("Sprite");
		product.setBrandName("Sprite");
		product.setCost(60);
		productRepository.save(product);
		assertNotNull(productRepository.findById(1).get());
	}

	@Test
	@Order(2)
	public void testReadAll(){
		List<Product> list=productRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	@Order(3)
	public void testSingleProduct(){
		Product product = productRepository.findById(1).get();
		assertEquals(60,product.getCost());

	}
	@Test
	@Order(4)
	public void testUpdate(){
		Product product = productRepository.findById(1).get();
		product.setCost(100);
		productRepository.save(product);
		assertNotEquals(60,productRepository.findById(1).get().getCost());

	}

}

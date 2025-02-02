package com.Angular_With_Spring_Ecommerce.Angular_With_Spring_Ecommerce.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.Angular_With_Spring_Ecommerce.Angular_With_Spring_Ecommerce.entity.Product;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

}

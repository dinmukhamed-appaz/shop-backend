package com.shop.shop_clothes.repository;

import com.shop.shop_clothes.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

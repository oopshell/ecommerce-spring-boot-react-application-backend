package me.tiantian_li.ecommerce.repository;

import me.tiantian_li.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

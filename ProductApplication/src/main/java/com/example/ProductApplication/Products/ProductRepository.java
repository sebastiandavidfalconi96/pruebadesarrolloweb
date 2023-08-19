//ProductRepository

package com.example.ProductApplication.Products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface ProductRepository extends JpaRepository<ProductAplication, Long> {

    Optional<ProductAplication> findProductAplicationByName(String name);

}
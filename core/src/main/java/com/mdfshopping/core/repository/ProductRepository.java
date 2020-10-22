package com.mdfshopping.core.repository;

import com.mdfshopping.core.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("Select p from Product p where p.description like %:word%")
    List<Product> findAllByDescription(String word);

    List<Product> findByIdIn(List<Long> ids);

}

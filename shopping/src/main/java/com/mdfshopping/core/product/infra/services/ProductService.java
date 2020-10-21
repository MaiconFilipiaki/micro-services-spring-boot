package com.mdfshopping.core.product.infra.services;

import com.mdfshopping.core.model.Product;
import com.mdfshopping.core.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {

    final private ProductRepository productRepository;

//    ProductService(final ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

    public List<Product> listAll() {
        return productRepository.findAll();
    }

    public Product create(final Product product) {
        return productRepository.save(product);
    }

    public Product findById(final Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    public List<Product> search(final String word) {
        return productRepository.findAllByDescription(word);
    }

}

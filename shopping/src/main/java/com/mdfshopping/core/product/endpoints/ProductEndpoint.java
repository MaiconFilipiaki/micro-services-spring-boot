package com.mdfshopping.core.product.endpoints;

import com.mdfshopping.core.model.Product;
import com.mdfshopping.core.product.infra.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductEndpoint {

    final private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> listAll() {
        return ResponseEntity.ok(productService.listAll());
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody final Product product) {
        return ResponseEntity.ok(productService.create(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") final Long id) {
        return ResponseEntity.ok(productService.findById(id));
    }

    @GetMapping("/search/{word}")
    public ResponseEntity<List<Product>> search(@PathVariable("word") final String word) {
        return ResponseEntity.ok(productService.search(word));
    }

}

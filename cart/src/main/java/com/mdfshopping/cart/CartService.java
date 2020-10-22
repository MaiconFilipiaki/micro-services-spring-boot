package com.mdfshopping.cart;

import com.mdfshopping.core.model.Cart;
import com.mdfshopping.core.model.Product;
import com.mdfshopping.core.repository.CartRepository;
import com.mdfshopping.core.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
@Service
public class CartService {

    private final CartRepository cartRepository;
    private final ProductRepository productRepository;

    public Cart save(final Cart cart) {
        List<Product> product = productRepository.findByIdIn(cart.getProducts().stream().map(Product::getId).collect(Collectors.toList()));
        cart.setProducts(product);
        return cartRepository.save(cart);
    }

    public Cart findById(final Long id) {
        return cartRepository.findById(id).orElseThrow();
    }

}

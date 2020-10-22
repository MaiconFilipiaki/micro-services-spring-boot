package com.mdfshopping.cart;

import com.mdfshopping.core.model.Cart;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
@AllArgsConstructor
public class CartEndpoint {

    private final CartService cartService;

    @GetMapping("/{id}")
    public ResponseEntity<Cart> getCart(@PathVariable final Long id) {
        return ResponseEntity.ok(cartService.findById(id));
    }

    @GetMapping("/test")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("pl");
    }

    @PostMapping("/create")
    public ResponseEntity<Cart> create(@RequestBody final Cart cart) {
        return ResponseEntity.ok(cartService.save(cart));
    }

}

package com.mdfshopping.cart;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartEndpoint {

    @GetMapping
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("ok");
    }

}

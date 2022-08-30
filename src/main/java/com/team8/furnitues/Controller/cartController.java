package com.team8.furnitues.Controller;

import com.team8.furnitues.Entity.cart;
import com.team8.furnitues.Services.cartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class cartController {
    @Autowired
    com.team8.furnitues.Services.cartService cartService;

    @GetMapping("/all")
    public List<cart> getallcart(){
        return cartService.getAllCart();
    }
    @PostMapping("/create")
    public void addCategory(@RequestBody cart cart){
        cartService.addCart(cart);
    }
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id){
        cartService.deleteCart(id);
    }

}

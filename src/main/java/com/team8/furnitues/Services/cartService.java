package com.team8.furnitues.Services;


import com.team8.furnitues.Entity.cart;
import com.team8.furnitues.Repo.cartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cartService {
    @Autowired
    com.team8.furnitues.Repo.cartRepo cartRepo;

    public void addCart(cart cart) {
        cartRepo.save(cart);
    }

    public List<cart> getAllCart() {
        return cartRepo.findAll();
    }

    public void deleteCart(int id) {
        cartRepo.deleteById(id);

    }
}

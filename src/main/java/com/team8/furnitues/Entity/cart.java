package com.team8.furnitues.Entity;


import javax.persistence.*;
import java.util.Set;

@Entity
public class cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartId;
    private int cartTotal;


//    @ManyToMany
//    private Set<product> products;
//
//    public Set<product> getProducts() {
//        return products;
//    }
//
//    public void setProducts(Set<product> products) {
//        this.products = products;
//    }
//
//    public cart(Set<product> products) {
//        this.products = products;

//    }

    public  cart(){}

    public cart(int cartId, int cartTotal) {
        this.cartId = cartId;
        this.cartTotal = cartTotal;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(int cartTotal) {
        this.cartTotal = cartTotal;
    }
//    public void addProducts(product product) {
//       // cartTotal=cartTotal+product.getPrize();
//        products.add(product);
//    }


}

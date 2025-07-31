package com.ecommerce.project.service;

import com.ecommerce.project.payload.CartDTO;
import jakarta.transaction.Transactional;

import java.util.List;

public interface CartService {

    CartDTO addProductToCart(Long productId, Integer quantity);

    List<CartDTO> getAllCarts();

    @Transactional //ensures multiple operation and there is issue in third operation , and 2 previous operation got roll back.
    CartDTO updateProductQuantityInCart(Long productId, Integer quantity);

    CartDTO getCart(String emailId, Long cartId);

    String deleteProductFromCart(Long cartId, Long productId);
}

package pro.sky.spring_shoppingCart.impl;

import org.springframework.stereotype.Service;
import pro.sky.spring_shoppingCart.model.Cart;
import pro.sky.spring_shoppingCart.service.CartService;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    public final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> add(List<Integer> id) {
        return cart.addItems(id);
    }

    @Override
    public List<Integer> get() {
        return cart.getItems();
    }


}


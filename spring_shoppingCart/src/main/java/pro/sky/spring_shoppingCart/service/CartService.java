package pro.sky.spring_shoppingCart.service;

import java.util.List;


public interface CartService {

    List<Integer> add(List<Integer> id);

    List<Integer> get();
}

package old;

public class ShopList {

//    @@ -0,0 +1,27 @@
//package com.shoplist.shoplist;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.annotation.SessionScope;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//@Component
//@SessionScope
//public class Cart {
//
//    private final List<Integer> items;
//
//    public Cart() {
//        this.items = new ArrayList<>();
//    }
//
//    public List<Integer> addItems(List<Integer> id) {
//        items.addAll(id);
//        return id;
//    }
//
//    public List<Integer> getItems() {
//        return Collections.unmodifiableList(items);
//    }
//}
//  29
//src/main/java/com/shoplist/shoplist/ShoplistApplication.java
//Viewed
//package com.shoplist.shoplist;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication
//public class ShoplistApplication {
//	public static void main(String[] args) {
//		SpringApplication.run(ShoplistApplication.class, args);
//	}
//
//}
////> Ваше задание на сегодня — нужно написать сервис, который собирает корзину для интернет-магазина.
////
////Выполненное задание пришлите на платформу в виде ссылки на пул-реквест проекта на GitHub.
////>
////
////Алгоритм действий:
////
////- Разработайте контроллер, сервис и некую сущность корзины с покупками.
////- У контроллера должны быть два метода:
/////store/order/add
/////store/order/get
////- При обращении к методу add можно в качестве параметров запроса передавать один или
//// несколько чисел, которые являются ID некоего товара.
////- При get мы должны получить все добавленные ID в виде списка в JSON-формате.
////- Для каждого подключения нового клиента должен создаваться новый объект — корзина.
////- Никаких хранилищ всех корзин быть не должно.
////- В качестве теста можно зайти со своего браузера и добавить итемы (item), далее —  получить список.
////- Этот же тест нужно проделать через браузер в режиме инкогнито и получить другой список.
////Алгоритм действий теста в браузере в режиме инкогнито:
////    1. Обращаемся к методу add из браузера, добавляем первые ID.
////    2. Обращаемся к методу add из инкогнито, добавляем первые ID.
////    3. Повторяем шаг 1 и 2.
////    4. Обращаемся к методу get сначала из браузера, потом из инкогнито. Списки должны
////    быть разными и заполнены тем, что было в шагах 1–3 .
////    - **Подсказки**
////        1. Нужно выбрать корректный скоуп для корзины.
////        2. Нужно указать context-path /store в application.properties.
////        3. Метод add должен быть один и при этом корректно работать как с одним ID, так и с несколькими.
////        4. Учесть, что ID могут повторяться. Выбрать соответствующую коллекцию в корзине.
// 31
//src/main/java/com/shoplist/shoplist/controller/ItemsController.java
//Viewed
//@@ -0,0 +1,31 @@
//package com.shoplist.shoplist.controller;
//
//import com.shoplist.shoplist.service.OrderService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/order")
//public class ItemsController {
//    public final OrderService orderService;
//
//    public ItemsController(OrderService orderService) {
//        this.orderService = orderService;
//    }
//
//    @GetMapping("/add")
//    public List<Integer> addItems(@RequestParam List<Integer> items) {
//        return orderService.addItems(items);
//    }
//
//    @GetMapping("/get")
//    public List<Integer> getItems() {
//        return orderService.getItems();
//    }
//
//
//}
// 9
//src/main/java/com/shoplist/shoplist/service/OrderService.java
//Viewed
//@@ -0,0 +1,9 @@
//package com.shoplist.shoplist.service;
//
//import java.util.List;
//
//public interface OrderService {
//    List<Integer> addItems(List<Integer> items);
//
//    List<Integer> getItems();
//}
// 27
//src/main/java/com/shoplist/shoplist/service/impl/OrderServiceImpl.java
//Viewed
//@@ -0,0 +1,27 @@
//package com.shoplist.shoplist.service.impl;
//
//import com.shoplist.shoplist.Cart;
//import com.shoplist.shoplist.service.OrderService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class OrderServiceImpl implements OrderService {
//
//    public final Cart cart;
//
//    public OrderServiceImpl(Cart cart) {
//        this.cart = cart;
//    }
//
//    @Override
//    public List<Integer> addItems(List<Integer> id) {
//        return cart.addItems(id);
//    }
//
//    @Override
//    public List<Integer> getItems() {
//        return cart.getItems();
//    }
//}
// 2
//src/main/resources/application.properties
//Viewed
//@@ -1 +1 @@
//
//server.servlet.context-path=/store

    //package com.shoplist.shoplist;
    //
    //import org.springframework.stereotype.Component;
    //import org.springframework.web.context.annotation.SessionScope;
    //
    //import java.util.ArrayList;
    //import java.util.Collections;
    //import java.util.List;
    //@Component
    //@SessionScope
    //public class Cart {
    //
    //    private final List<Integer> items;
    //
    //    public Cart() {
    //        this.items = new ArrayList<>();
    //    }
    //
    //    public List<Integer> addItems(List<Integer> id) {
    //        items.addAll(id);
    //        return id;
    //    }
    //
    //    public List<Integer> getItems() {
    //        return Collections.unmodifiableList(items);
    //    }
    //}
    // 29
    //src/main/java/com/shoplist/shoplist/ShoplistApplication.java
    //Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
    //Comment on this file
    //@@ -1,42 +1,13 @@
    //package com.shoplist.shoplist;
    //import org.springframework.boot.SpringApplication;
    //import org.springframework.boot.autoconfigure.SpringBootApplication;
    //@SpringBootApplication
    //public class ShoplistApplication {
    //	public static void main(String[] args) {
    //		SpringApplication.run(ShoplistApplication.class, args);
    //	}
    //
    //}
    ////> Ваше задание на сегодня — нужно написать сервис, который собирает корзину для интернет-магазина.
    ////
    ////Выполненное задание пришлите на платформу в виде ссылки на пул-реквест проекта на GitHub.
    ////>
    ////
    ////Алгоритм действий:
    ////
    ////- Разработайте контроллер, сервис и некую сущность корзины с покупками.
    ////- У контроллера должны быть два метода:
    /////store/order/add
    /////store/order/get
    ////- При обращении к методу add можно в качестве параметров запроса передавать один или
    //// несколько чисел, которые являются ID некоего товара.
    ////- При get мы должны получить все добавленные ID в виде списка в JSON-формате.
    ////- Для каждого подключения нового клиента должен создаваться новый объект — корзина.
    ////- Никаких хранилищ всех корзин быть не должно.
    ////- В качестве теста можно зайти со своего браузера и добавить итемы (item), далее —  получить список.
    ////- Этот же тест нужно проделать через браузер в режиме инкогнито и получить другой список.
    ////Алгоритм действий теста в браузере в режиме инкогнито:
    ////    1. Обращаемся к методу add из браузера, добавляем первые ID.
    ////    2. Обращаемся к методу add из инкогнито, добавляем первые ID.
    ////    3. Повторяем шаг 1 и 2.
    ////    4. Обращаемся к методу get сначала из браузера, потом из инкогнито. Списки должны
    ////    быть разными и заполнены тем, что было в шагах 1–3 .
    ////    - **Подсказки**
    ////        1. Нужно выбрать корректный скоуп для корзины.
    ////        2. Нужно указать context-path /store в application.properties.
    ////        3. Метод add должен быть один и при этом корректно работать как с одним ID, так и с несколькими.
    ////        4. Учесть, что ID могут повторяться. Выбрать соответствующую коллекцию в корзине.
    // 31
    //src/main/java/com/shoplist/shoplist/controller/ItemsController.java
    //Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
    //Comment on this file
    //@@ -0,0 +1,31 @@
    //package com.shoplist.shoplist.controller;
    //
    //import com.shoplist.shoplist.service.OrderService;
    //import org.springframework.web.bind.annotation.GetMapping;
    //import org.springframework.web.bind.annotation.RequestMapping;
    //import org.springframework.web.bind.annotation.RequestParam;
    //import org.springframework.web.bind.annotation.RestController;
    //
    //import java.util.List;
    //
    //@RestController
    //@RequestMapping("/order")
    //public class ItemsController {
    //    public final OrderService orderService;
    //
    //    public ItemsController(OrderService orderService) {
    //        this.orderService = orderService;
    //    }
    //
    //    @GetMapping("/add")
    //    public List<Integer> addItems(@RequestParam List<Integer> items) {
    //        return orderService.addItems(items);
    //    }
    //
    //    @GetMapping("/get")
    //    public List<Integer> getItems() {
    //        return orderService.getItems();
    //    }
    //
    //
    //}
    // 9
    //src/main/java/com/shoplist/shoplist/service/OrderService.java
    //Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
    //Comment on this file
    //@@ -0,0 +1,9 @@
    //package com.shoplist.shoplist.service;
    //
    //import java.util.List;
    //
    //public interface OrderService {
    //    List<Integer> addItems(List<Integer> items);
    //
    //    List<Integer> getItems();
    //}
    // 27
    //src/main/java/com/shoplist/shoplist/service/impl/OrderServiceImpl.java
    //Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
    //Comment on this file
    //@@ -0,0 +1,27 @@
    //package com.shoplist.shoplist.service.impl;
    //
    //import com.shoplist.shoplist.Cart;
    //import com.shoplist.shoplist.service.OrderService;
    //import org.springframework.stereotype.Service;
    //
    //import java.util.List;
    //
    //@Service
    //public class OrderServiceImpl implements OrderService {
    //
    //    public final Cart cart;
    //
    //    public OrderServiceImpl(Cart cart) {
    //        this.cart = cart;
    //    }
    //
    //    @Override
    //    public List<Integer> addItems(List<Integer> id) {
    //        return cart.addItems(id);
    //    }
    //
    //    @Override
    //    public List<Integer> getItems() {
    //        return cart.getItems();
    //    }
    //}
    // 2
    //src/main/resources/application.properties
    //Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
    //Comment on this file
    //@@ -1 +1 @@
}

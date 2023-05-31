package pro.sky.spring_shoppingCart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringShoppingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringShoppingCartApplication.class, args);
	}





	////@Component
	////@SessionScope
	////public class Cart {
	////
	////    private final List<Integer> items;
	////
	////    public Cart() {
	////        this.items = new ArrayList<>();
	////    }
	////
	////    public List<Integer> addItems(List<Integer> id) {
	////        items.addAll(id);
	////        return id;
	////    }
	////
	////    public List<Integer> getItems() {
	////        return Collections.unmodifiableList(items);
	//
	////@RestController
	////@RequestMapping("/order")
	////public class ItemsController {
	////    public final OrderService orderService;
	////
	////    public ItemsController(OrderService orderService) {
	////        this.orderService = orderService;
	////    }
	////
	////    @GetMapping("/add")
	////    public List<Integer> addItems(@RequestParam List<Integer> items) {
	////        return orderService.addItems(items);
	////    }
	////
	////    @GetMapping("/get")
	////    public List<Integer> getItems() {
	////        return orderService.getItems();
	//
	////@Service
	////public class OrderServiceImpl implements OrderService {
	////
	////    public final Cart cart;
	////
	////    public OrderServiceImpl(Cart cart) {
	////        this.cart = cart;
	////    }
	////
	////    @Override
	////    public List<Integer> addItems(List<Integer> id) {
	////        return cart.addItems(id);
	////    }
	////
	////    @Override
	////    public List<Integer> getItems() {
	////        return cart.getItems();
	////    }
	//
	//
	//    //public interface OrderService {
	//    //    List<Integer> addItems(List<Integer> items);
	//    //
	//    //    List<Integer> getItems();
	//    //}
	//
}

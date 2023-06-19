package Controllers;

import Interfaces.StoreInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/store/order")
public class StoreController {
    private final StoreInterface storeInterface;
@Autowired
    public StoreController(StoreInterface storeInterface) {
        this.storeInterface = storeInterface;
    }

    @GetMapping("/add")
    public void add(@RequestParam Integer productId) {
    storeInterface.add(productId);
    }

    @GetMapping("/get")
    public Collection<Integer> get() {
        return storeInterface.get();
    }
}

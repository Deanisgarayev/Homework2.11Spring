package Services;

import Exceptions.ProductIdIsAlreadyAdded;
import Interfaces.StoreInterface;
import com.task.spring.spring.Store;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class StoreService implements StoreInterface {
    private final List<Store> items;

    public  StoreService() {
        this.items = new ArrayList<>();
    }
    @Override
    public void add(Integer productId) {
        Store store = new Store(productId);
        if (items.contains(store.getProductId())) {
            throw new ProductIdIsAlreadyAdded("The productId already exists");
        }
        items.add(store);
    }

    @Override
    public Collection<Store> get() {
        return Collections.unmodifiableList(items);
    }
}

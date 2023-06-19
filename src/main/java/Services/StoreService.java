package Services;

import Exceptions.ProductIdIsAlreadyAdded;
import Interfaces.StoreInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class StoreService implements StoreInterface {
    private final List<Integer> items;

    public  StoreService() {
        this.items = new ArrayList<>();
    }
    @Override
    public void add(Integer productId) {
        if (items.contains(productId)) {
            throw new ProductIdIsAlreadyAdded("The productId already exists");
        }
        items.add(productId);

    }

    @Override
    public Collection<Integer> get() {
        return Collections.unmodifiableList(items);
    }
}

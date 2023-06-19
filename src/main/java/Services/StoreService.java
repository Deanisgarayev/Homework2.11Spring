package Services;

import Interfaces.StoreInterface;
import org.springframework.stereotype.Service;

@Service
public class StoreService implements StoreInterface {
    @Override
    public void add(Integer productId) {

    }

    @Override
    public Integer get(Integer productId) {
        return null;
    }
}

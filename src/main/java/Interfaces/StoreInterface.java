package Interfaces;

import com.task.spring.spring.Store;

import java.util.Collection;

public interface StoreInterface {
    void add(Integer productId);

    Collection<Store> get() ;
}

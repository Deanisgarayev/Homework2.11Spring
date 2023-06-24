package com.task.spring.spring;

import java.util.Collection;

public interface StoreInterface {
    void add(Integer productId);

    Collection<Integer> get() ;
}

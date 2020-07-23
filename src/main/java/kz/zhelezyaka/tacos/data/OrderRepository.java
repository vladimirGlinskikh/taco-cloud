package kz.zhelezyaka.tacos.data;

import kz.zhelezyaka.tacos.Order;

public interface OrderRepository {
    Order save(Order order);
}

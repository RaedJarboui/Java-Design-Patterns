package com.Interface.segregate.persistence;

import java.util.HashMap;
import java.util.Map;

import com.Interface.segregate.entity.Order;

// the problem here is that we cannot implement PersistenceService in OrderPersistenceService because findByName method require name ->
//as param and class Order doesnot have name, we can litterally implement PersistenceService into UserPersistenceService though
//->that's why we need to create specific persistenceService interface for Order class and remove findByName from it

//public class OrderPersistenceService implements PersistenceService<Order> { ->NO
public class OrderPersistenceService implements PersistenceServiceOrderInterface<Order> {

	private static final Map<Long, Order> ORDERS = new HashMap<>();

	@Override
	public void save(Order entity) {
		synchronized (ORDERS) {
			ORDERS.put(entity.getId(), entity);
		}
	}

	@Override
	public void delete(Order entity) {
		synchronized (ORDERS) {
			ORDERS.remove(entity.getId());
		}
	}

	@Override
	public Order findById(Long id) {
		synchronized (ORDERS) {
			return ORDERS.get(id);
		}
	}

//	@Override   ->we dont have to use PersistenceService anymore, we just implement PersistenceServiceOrderInterface here
//	public Order findByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}

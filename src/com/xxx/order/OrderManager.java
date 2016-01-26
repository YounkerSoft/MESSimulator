package com.xxx.order;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import com.xxx.bean.Order;

/**
 * @author yuan
 *
 * @date 2016年1月20日 下午5:43:30
 */
public class OrderManager {
	
	
	//init orders' orderTime
	public void initOrdersTime(HashMap<Long, HashMap<Long, Order>> orders){
		
		for(int i=0; i<orders.size(); i++){
			HashMap<Long, Order> ordersPerWindow = orders.get(i);
			
			initOrderTime(ordersPerWindow);
			
			orders.put((long) i, ordersPerWindow);			
		}
		
	}
	
	
	//init ordersPerWindows' orderTime
	public void initOrderTime(HashMap<Long, Order> ordersPerWindow){
		
		Iterator<Entry<Long, Order>> iter = ordersPerWindow.entrySet().iterator();
		
		while (iter.hasNext()){
			Entry<Long, Order> entry = iter.next();
			
			Order order = entry.getValue();
			
			//init orderTime
			order.setOrderTime(null);
			
			ordersPerWindow.put(order.getOrderId(), order);
		}

	}
	
	
	
	//getXXXOrders() : get methods
	public Order getOrderById(HashMap<Long, HashMap<Long, Order>> orders, long orderId){
		Order order = null;
		
		for(int i=0; i<orders.size(); i++){
			HashMap<Long, Order> ordersPerWindow = orders.get(i);
			
			order = ordersPerWindow.get(orderId);
			
			if(!order.equals(null) || order!=null){
				return order;
			}		
		}	
		
		return order;
	}
	
	
	//notifyScheduler() : when new order is arriving, send a signal to PPS (Production Planing System)
	public void notifyScheduler(){
		
	}
	
}

package com.xxx.order;

import java.util.HashMap;
import java.util.Random;

import com.xxx.bean.Order;
import com.xxx.util.ValueOfConfigureFile;

/**
 * @author yuan
 *
 * @date 2016年1月20日 下午5:43:44
 */
public class OrderGenerator {
	
	//Random
	Random random = new Random();
	
	
	//Value of configure files
	private ValueOfConfigureFile valueOfConfFile = new ValueOfConfigureFile();
	
	
	//get Time info
//	private int windownSize = valueOfConfFile.getWindownSize();
	private int TimeSize = valueOfConfFile.getTimeSize();
	
	
	//get Order info
	private String orderGenRule = valueOfConfFile.getOrderGenRule();
	private int ordersPerWin = valueOfConfFile.getOrdersPerWin();
	private int orderGenErr = valueOfConfFile.getOrderGenErr();
	
	
	//get Product info
	private int productCategory = valueOfConfFile.getProductCategory();
	private int productCount = valueOfConfFile.getProductCount();
	
	
		
	//Generate Orders
	public HashMap<Long, HashMap<Long, Order>> generateOrders(){
		
		//order lists
		HashMap<Long, HashMap<Long, Order>> orders = new HashMap<Long, HashMap<Long, Order>>();
		
		
		//generate orders
		for(int i=0; i<TimeSize; i++){
			//Orders per window
			HashMap<Long, Order> ordersPerWindow = new HashMap<Long, Order>();
			
			if(orderGenRule.equalsIgnoreCase("time")){
				
				ordersPerWindow = genOrdersPerWindow();
				
			} else {
				//other rules of orders
			}
			
			orders.put(new Long(i), ordersPerWindow);
			ordersPerWindow = new HashMap<Long, Order>();		//init

		}	
		
		return orders;
		
	}
	
	
	//Generate Orders Per Window
	public HashMap<Long, Order> genOrdersPerWindow(){
		
		HashMap<Long, Order> ordersPerWindow = new HashMap<Long, Order>();
		
		int orderErr = random.nextInt(orderGenErr);
		int orderArrivalRate = ordersPerWin + orderErr;
		
		for(int i=0; i<orderArrivalRate; i++){
			Order order = new Order(i, random.nextInt(productCategory), random.nextInt(productCount), 0);
			
			ordersPerWindow.put(order.getOrderId(), order);
		}
				
		return ordersPerWindow;
		
	}
	
	
	
	//test
	public static void main(String[] args){
		
		OrderGenerator gen = new OrderGenerator();
		
		HashMap<Long, HashMap<Long, Order>> orders;
		
		orders =  gen.generateOrders();
		
		System.out.println("orders size:" + orders.size());
		
		for(int i=0; i<orders.size(); i++){
			
			HashMap<Long, Order> ordersPerWindow = orders.get((long)i);
			
			if(ordersPerWindow != null){
				System.out.println("ordersPerWindow size:" + ordersPerWindow.size());
			}
			
		}
		
	}

}

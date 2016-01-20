package com.xxx.bean;

import java.sql.Time;

/**
 * @author yuan
 *
 * @date 2016��1��20�� ����5:33:59
 */
public class Order {
	
	private long orderId;
	private long productId;
	private int count;
	private int status;				//[ suspend | executing | completed etc. ] == [ 0 | 1 | 2 etc. ]
	private Time orderTime;			// (�µ�ʱ��)
	private Time completionTime;	// �����ʱ�䣩
	
	
	/**
	 * @param orderId
	 * @param productId
	 * @param count
	 * @param status
	 */
	public Order(long orderId, long productId, int count, int status) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.count = count;
		this.status = status;
	}
		
	/**
	 * @param orderId
	 * @param productId
	 * @param count
	 * @param status
	 * @param orderTime
	 * @param completionTime
	 */
	public Order(long orderId, long productId, int count, int status,
			Time orderTime, Time completionTime) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.count = count;
		this.status = status;
		this.orderTime = orderTime;
		this.completionTime = completionTime;
	}

	
	/**
	 * @return the orderId
	 */
	public long getOrderId() {
		return orderId;
	}


	/**
	 * @return the productId
	 */
	public long getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(long productId) {
		this.productId = productId;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the orderTime
	 */
	public Time getOrderTime() {
		return orderTime;
	}

	/**
	 * @param orderTime the orderTime to set
	 */
	public void setOrderTime(Time orderTime) {
		this.orderTime = orderTime;
	}

	/**
	 * @return the completionTime
	 */
	public Time getCompletionTime() {
		return completionTime;
	}

	/**
	 * @param completionTime the completionTime to set
	 */
	public void setCompletionTime(Time completionTime) {
		this.completionTime = completionTime;
	}

}

package com.xxx.bean;

import java.util.Date;

/**
 * @author yuan
 *
 * @date 2016年1月20日 下午5:33:59
 */
public class Order {
	
	private long orderId;
	private long productId;
	private int count;
	private int status;				//[ suspend | executing | completed etc. ] == [ 0 | 1 | 2 etc. ]
	private Date orderTime;			// (下单时间)
	private Date completionTime;	// （完成时间）
	
	
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
			Date orderTime, Date completionTime) {
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
	public Date getOrderTime() {
		return orderTime;
	}

	/**
	 * @param orderTime the orderTime to set
	 */
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	/**
	 * @return the completionTime
	 */
	public Date getCompletionTime() {
		return completionTime;
	}

	/**
	 * @param completionTime the completionTime to set
	 */
	public void setCompletionTime(Date completionTime) {
		this.completionTime = completionTime;
	}

}
